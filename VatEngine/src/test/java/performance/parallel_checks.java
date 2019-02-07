package performance;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.DataProvider;

public class parallel_checks {
	public static OkHttpClient client= null;
	public static MediaType mediaType = null;
	public String filetosend = null;
	public RequestBody body= null;
	public Request request = null;
	public String filename= null;
	public static String PerfNumberfFile=null;
	//public String check="";
	public ArrayList<Double> al=new ArrayList<Double>();
  @BeforeClass
  public void beforeClass() {
	  
	  filename= "test3-FR-FR.xml";
	  DateFormat dateformat = new SimpleDateFormat("MMMdd_HHmm");
		Date date = new Date();
		String var = dateformat.format(date);
		PerfNumberfFile = "d:\\reports\\VatEnginePerfNumber_" + var + ".csv";	
		filetosend= convertFileToString(filename);
	 // .addHeader("postman-token", "7842e6f9-1bd6-2225-bf48-7c51eeabba94")
	 
  }
  public void setupRequest() {
	  client = new OkHttpClient.Builder()
		        .connectTimeout(10, TimeUnit.SECONDS)
		        .writeTimeout(10, TimeUnit.SECONDS)
		        .readTimeout(30, TimeUnit.SECONDS)
		        .build();
	 mediaType = MediaType.parse("text/xml; charset=utf-8");
	
	
	 body = RequestBody.create(mediaType, filetosend);
	 request = new Request.Builder()
			 .url("http://localhost/iVATEngineService/EngineService.asmx")
	 // .url("http://ec2-34-247-21-218.eu-west-1.compute.amazonaws.com/iVATEngineService/EngineService.asmx")
	  .post(body)
	  .addHeader("content-type", "text/xml; charset=utf-8")
	  .addHeader("soapaction", "http://tempuri.org/AnalyseDocument")
	  .addHeader("cache-control", "no-cache").build();
	
}
long startTime= 0; long elapsedTime=0;   double  validationTime=0.00;
  public Response response= null;
  @BeforeGroups(groups="prallel_2")
	public void beforegroup2()
	{	
		setupRequest();
		writeDetailstoFile(PerfNumberfFile, "\n Starting 2 parallel ,"+ new Date());
	}
  @Test(dataProvider="parallelTestData_2",groups="prallel_2",priority=2)
  public void check2(String temp) throws IOException, InterruptedException {
	  startTime = System.currentTimeMillis();
		  response = client.newCall(request).execute();
	         elapsedTime = System.currentTimeMillis() - startTime;
	         validationTime=elapsedTime/1000.00;
		System.out.println("validationTime="+validationTime);
		al.add(validationTime);
  }
  @AfterGroups(groups="prallel_2")
 	public void aftergroup2() throws InterruptedException
 	{	
	  Thread.sleep(2000);
	  for(double temp:al)
	  {
		  writeDetailstoFile(PerfNumberfFile, "\n"+temp);
	  }
 	  writeDetailstoFile(PerfNumberfFile, "\n end 2 parallel:,"+ new Date());
 	al.clear();
 	response=null;
 	client= null;
 	body= null;
 	request= null;
 	}

   
  @DataProvider(name="parallelTestData_2",parallel=true)
	public Object[][] parallelTestData() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException
	{
		Object[][] data =new Object[2][1];
		
		return data;
		
	}

  @BeforeGroups(groups="prallel_4")
	public void beforegroup4()
	{		
	  writeDetailstoFile(PerfNumberfFile, "\n Starting 4 parallel,"+ new Date());
	setupRequest();
	
	}
@Test(dataProvider="parallelTestData_4",groups="prallel_4",priority=3)
public void check4(String temp) throws IOException, InterruptedException {

	  startTime = System.currentTimeMillis();
	  response = client.newCall(request).execute();
	  elapsedTime = System.currentTimeMillis() - startTime;
	    validationTime=elapsedTime/1000.00;
		System.out.println("validationTime="+validationTime);
		al.add(validationTime);
}
@AfterGroups(groups="prallel_4")
	public void aftergroup4() throws InterruptedException
	{	
	Thread.sleep(2000);
	 for(double temp:al)
	  {
		  writeDetailstoFile(PerfNumberfFile, "\n"+temp);
	  }
	  writeDetailstoFile(PerfNumberfFile, "\n end 4 parallel:,"+ new Date());
	al.clear();
	response=null;
 	client= null;
 	body= null;
 	request= null;
	}

 
@DataProvider(name="parallelTestData_4",parallel=true)
	public Object[][] parallelTestData_4() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException
	{
		Object[][] data =new Object[4][1];
		
		return data;
		
	}

@BeforeGroups(groups="prallel_8")
public void beforegroup8()
{		
  writeDetailstoFile(PerfNumberfFile, "\n\n Starting 8 parallel,"+ new Date());
  setupRequest();
}
@Test(dataProvider="parallelTestData_8",groups="prallel_8",priority=4)
public void check8(String temp) throws IOException, InterruptedException {

  startTime = System.currentTimeMillis();
  response = client.newCall(request).execute();
  elapsedTime = System.currentTimeMillis() - startTime;
    validationTime=elapsedTime/1000.00;
	System.out.println("validationTime="+validationTime);
	al.add(validationTime);
}
@AfterGroups(groups="prallel_8")
public void aftergroup8() throws InterruptedException
{	
Thread.sleep(2000);
 for(double temp:al)
  {
	  writeDetailstoFile(PerfNumberfFile, "\n"+temp);
  }
  writeDetailstoFile(PerfNumberfFile, "\n\n end 8 parallel:,"+ new Date());
al.clear();
response=null;
	client= null;
	body= null;
	request= null;
}


@DataProvider(name="parallelTestData_8",parallel=true)
public Object[][] parallelTestData_8() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException
{
	Object[][] data =new Object[8][1];
	
	return data;
	
}
@BeforeGroups(groups="prallel_16")
public void beforegroup16()
{		
  writeDetailstoFile(PerfNumberfFile, "\n\n Starting 16 parallel,"+ new Date());
  setupRequest();
}
@Test(dataProvider="parallelTestData_16",groups="prallel_16",priority=5)
public void check16(String temp) throws IOException, InterruptedException {

  startTime = System.currentTimeMillis();
  response = client.newCall(request).execute();
  elapsedTime = System.currentTimeMillis() - startTime;
    validationTime=elapsedTime/1000.00;
	System.out.println("validationTime="+validationTime);
	al.add(validationTime);
}
@AfterGroups(groups="prallel_16")
public void aftergroup16() throws InterruptedException
{	
Thread.sleep(2000);
 for(double temp:al)
  {
	  writeDetailstoFile(PerfNumberfFile, "\n"+temp);
  }
  writeDetailstoFile(PerfNumberfFile, "\n\n end 16 parallel:,"+ new Date());
al.clear();

}


@DataProvider(name="parallelTestData_16",parallel=true)
public Object[][] parallelTestData_16() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException
{
	Object[][] data =new Object[16][1];
	
	return data;
	
}

  @AfterClass
  public void prepareReport()
  {
	  //nothing
  }

  public static String convertFileToString (String fileName){
		BufferedReader br = null;
		FileReader fr = null;
		String finalstring="";
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				//System.out.println(sCurrentLine);
				finalstring=finalstring+sCurrentLine;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
				br.close();
				if (fr != null)
				fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
      return finalstring;
    }
	protected static void writeDetailstoFile(String fileName,String newEmail) {
			try {
			// Assume default encoding.
			FileWriter fileWriter = new FileWriter(fileName, true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		bufferedWriter.write(newEmail);
				bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
		
		}

	}
}
