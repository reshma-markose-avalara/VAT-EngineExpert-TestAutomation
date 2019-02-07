package tempTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

public class check {
	public static OkHttpClient client= null;
	public static MediaType mediaType = null;
	public String filetosend = null;
	public RequestBody body= null;
	public Request request = null;
	public String filename= null;
	public static String PerfNumberfFile=null;
	public Response response = null;
	//public String check="";
	public ArrayList<Double> al=new ArrayList<Double>();

	
	@AfterMethod
	public void afterrun()
	{
		al.clear();
		response=null;
		client= null;
		body= null;
		request= null;
		
 	}
	
	@Test(priority=1,invocationCount=1)
	public void fun1() throws IOException, InterruptedException
	{
		setupRequest("datacolor.xml");
		long startTime = System.currentTimeMillis();
		response = client.newCall(request).execute();
		long responseTimeStamp = response.receivedResponseAtMillis();
		long check = responseTimeStamp- startTime;
		long response_time= check/1000;
		System.out.println("response_time=" + check);
		System.out.println(response.body().string());
		response.close();
		Thread.sleep(2000);
	}

	 public void setupRequest(String inputfile) {
		  client = new OkHttpClient.Builder()
			        .connectTimeout(10, TimeUnit.SECONDS)
			        .writeTimeout(10, TimeUnit.SECONDS)
			        .readTimeout(30, TimeUnit.SECONDS)
			        .build();
		 mediaType = MediaType.parse("text/xml; charset=utf-8");
		
		 filetosend= convertFileToString(inputfile);
		 body = RequestBody.create(mediaType, filetosend);
		 request = new Request.Builder()
				 .url("http://localhost/iVATEngineService/EngineService.asmx")
		 // .url("http://ec2-34-247-21-218.eu-west-1.compute.amazonaws.com/iVATEngineService/EngineService.asmx")
		  .post(body)
		  .addHeader("content-type", "text/xml; charset=utf-8")
		  .addHeader("soapaction", "http://tempuri.org/AnalyseDocument")
		  .addHeader("cache-control", "no-cache").build();
		
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
