package performance;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class Loacl_Parallel {
	public static OkHttpClient client= null;
	public static MediaType mediaType = null;
	public RequestBody body = null;
	public Request request = null;
	
	@BeforeTest
	public void beforetestSetup()
	{
		 client = new OkHttpClient.Builder().connectTimeout(45, TimeUnit.SECONDS)
				.writeTimeout(45, TimeUnit.SECONDS).readTimeout(45, TimeUnit.SECONDS).build();
		 mediaType = MediaType.parse("text/xml; charset=utf-8");
		/* String filetosend=	 convertFileToString("Invoice001.xml");
		 body = RequestBody.create(mediaType, filetosend);
		 request = new Request.Builder().url("http://localhost/iVATEngineService/EngineService.asmx").post(body)
					.addHeader("content-type", "text/xml; charset=utf-8")
					.addHeader("soapaction", "http://tempuri.org/AnalyseDocument").addHeader("cache-control", "no-cache")
					.build();
		*/	
	}
	@DataProvider(name="parallelTestData_3", parallel=true)
	public Object[][] parallelTestData_8() throws EncryptedDocumentException, FileNotFoundException, InvalidFormatException, IOException
	{
		Object[][] data =new Object[8][1];
		/*data[0][0]= convertFileToString("test1-BLFR.xml");
		data[1][0]= convertFileToString("test2_bl_to_bl.xml");
		data[2][0]= convertFileToString("test3-FR-FR.xml");
		*/
		data[0][0]= convertFileToString("Invoice001.xml");
		data[1][0]= convertFileToString("Invoice001.xml");
		data[2][0]= convertFileToString("Invoice001.xml");
		data[3][0]= convertFileToString("Invoice001.xml");
		data[4][0]= convertFileToString("Invoice001.xml");
		data[5][0]= convertFileToString("Invoice001.xml");
		data[6][0]= convertFileToString("Invoice001.xml");
		data[7][0]= convertFileToString("Invoice001.xml");
		
		return data;
		
	}
@Test(dataProvider="parallelTestData_3")
	public void test1(String filetosend) throws IOException
	{
		// OkHttpClient client = new OkHttpClient();
		
		//String filetosend = convertFileToString("test1-BLFR.xml");
		RequestBody body = RequestBody.create(mediaType, filetosend);
		Request request = new Request.Builder().url("http://localhost/iVATEngineService/EngineService.asmx").post(body)
				.addHeader("content-type", "text/xml; charset=utf-8")
				.addHeader("soapaction", "http://tempuri.org/AnalyseDocument").addHeader("cache-control", "no-cache")
				.build();
		
		long startTime = System.currentTimeMillis();
		Response response = client.newCall(request).execute();
		double elapsedTime = (response.receivedResponseAtMillis() - startTime) / 1000.00;

		System.out.println("validationTime=" + elapsedTime);
		System.out.println(response.body().string());

	}

@Test(enabled=false)
public void test2() throws IOException
{
		// OkHttpClient client = new OkHttpClient();
		OkHttpClient client = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS)
				.writeTimeout(10, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).build();
		MediaType mediaType = MediaType.parse("text/xml; charset=utf-8");

		String filetosend = convertFileToString("test2_bl_to_bl.xml");
		RequestBody body = RequestBody.create(mediaType, filetosend);
		Request request = new Request.Builder().url("http://localhost/iVATEngineService/EngineService.asmx").post(body)
				.addHeader("content-type", "text/xml; charset=utf-8")
				.addHeader("soapaction", "http://tempuri.org/AnalyseDocument").addHeader("cache-control", "no-cache")
				.build();
		long startTime = System.currentTimeMillis();
		Response response = client.newCall(request).execute();
		double elapsedTime = (response.receivedResponseAtMillis() - startTime) / 1000.00;

		System.out.println("validationTime=" + elapsedTime);
		System.out.println(response.body().string());
}

@Test(enabled=false)
public void test3() throws IOException
{
		// OkHttpClient client = new OkHttpClient();
		OkHttpClient client = new OkHttpClient.Builder().connectTimeout(10, TimeUnit.SECONDS)
				.writeTimeout(10, TimeUnit.SECONDS).readTimeout(30, TimeUnit.SECONDS).build();
		MediaType mediaType = MediaType.parse("text/xml; charset=utf-8");

		String filetosend = convertFileToString("test3-FR-FR.xml");
		RequestBody body = RequestBody.create(mediaType, filetosend);
		Request request = new Request.Builder().url("http://localhost/iVATEngineService/EngineService.asmx").post(body)
				.addHeader("content-type", "text/xml; charset=utf-8")
				.addHeader("soapaction", "http://tempuri.org/AnalyseDocument").addHeader("cache-control", "no-cache")
				.build();
		long startTime = System.currentTimeMillis();
		Response response = client.newCall(request).execute();
		double elapsedTime = (response.receivedResponseAtMillis() - startTime) / 1000.00;

		System.out.println("validationTime=" + elapsedTime);
		System.out.println(response.body().string());

}
	public static String convertFileToString (String fileName){
		BufferedReader br = null;
		FileReader fr = null;
		String finalstring="";
		try {

			//br = new BufferedReader(new FileReader(FILENAME));
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
}
