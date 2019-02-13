package Automation.VatEngine;

import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import excel.ReadExcel;

import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class GCC_SoapChecks extends ReadExcel{
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
	
	Map < String, Object[] > result = null;
	String inputFile = "C:\\code\\VAT-Engine-Tests\\VatEngine\\src\\test\\java\\excel\\TestVatEngine.xls";
	String outputFile = "C:\\code\\VAT-Engine-Tests\\VatEngine\\src\\test\\java\\excel\\TestVatEngineResult.xls";
	
	ReadExcel re = new ReadExcel();
	
	@AfterMethod
	public void afterrun()
	{
		al.clear();
		response=null;
		client= null;
		body= null;
		request= null;
		
 	}

	public static Map<String, Double> boxValueMap = new HashMap<String, Double>();

	//MT Start
	@Test(priority=1)
	public void BH_test1_Cultural() throws IOException, InterruptedException
	{
		re.openFile(inputFile,0); //new testcase value changes here
		int rows = re.numRows();
		result = new TreeMap < String, Object[] >();
		result.put( ""+0, new Object[] {
    			re.returnCellValue(0,0), re.returnCellValue(0,1),"RESULT"});
		for(int i = 1; i < rows; i++){
			try{
				setupRequest(re.returnCellValue(i,0));
				response = client.newCall(request).execute();
				String p = response.body().string();
				System.out.println(p);
				String VatRate = getVatRate(p);
				System.out.println("VatRate = " + VatRate);
				if(VatRate.equalsIgnoreCase(re.returnCellValue(i,1))){
					System.out.println("PASS:" + re.returnCellValue(i,0) + ":" + re.returnCellValue(i,1) + ":" + VatRate);
					result.put( ""+i, new Object[] {
		        			re.returnCellValue(i,0), re.returnCellValue(i,1),"PASS"});
				}else{
					System.out.println("FAIL:" + re.returnCellValue(i,0) + ":" + re.returnCellValue(i,1) + ":" + VatRate);
					result.put( ""+i, new Object[] {
		        			re.returnCellValue(i,0), re.returnCellValue(i,1),"FAIL"});
				}	
			}catch(Exception e){
				result.put( ""+i, new Object[] {
	        			re.returnCellValue(i,0), re.returnCellValue(i,1),"FAIL"});
			}
		}
		re.writeTestResults(result, outputFile,"Bahrain"); //made changes here
		response.close();
	}

	@Test(priority=2)
	public void BH_test2_Cultural() throws IOException, InterruptedException
	{
		re.openFile(inputFile,1); //new testcase value changes here
		int rows = re.numRows();
		result = new TreeMap < String, Object[] >();
		result.put( ""+0, new Object[] {
    			re.returnCellValue(0,0), re.returnCellValue(0,1),re.returnCellValue(0,2),"RESULT"});
		for(int i = 1; i < rows; i++){
			try{
				setupRequest(re.returnCellValue(i,0));
				response = client.newCall(request).execute();
				String p = response.body().string();
				System.out.println(p);
				String VatRate = getVatRate(p);
				System.out.println("VatRate = " + VatRate);
				String mentioning= getMentioning(p);
				System.out.println("mentioning="+mentioning);
				if(VatRate.equalsIgnoreCase(re.returnCellValue(i,1)) && mentioning.contains(re.returnCellValue(i,2))){
					System.out.println("PASS:" + re.returnCellValue(i,0) + ":" + re.returnCellValue(i,1) + ":" + re.returnCellValue(i,2) + ":"  +VatRate + ":" +mentioning);
					result.put( ""+i, new Object[] {
		        			re.returnCellValue(i,0), re.returnCellValue(i,1),re.returnCellValue(i,2),"PASS"});
				}else{
					System.out.println("FAIL:" + re.returnCellValue(i,0) + ":" + re.returnCellValue(i,1)  + ":" + re.returnCellValue(i,2) + ":"  +VatRate + ":" +mentioning);
					result.put( ""+i, new Object[] {
		        			re.returnCellValue(i,0), re.returnCellValue(i,1),re.returnCellValue(i,2),"FAIL"});
				}	
			}catch(Exception e){
				result.put( ""+i, new Object[] {
	        			re.returnCellValue(i,0), re.returnCellValue(i,1),re.returnCellValue(i,2),"FAIL"});
			}
		}
		re.writeTestResults(result, outputFile,"GCC");
		response.close();
	}
	
	public  String getVatRate(String responseStr) {
		 String  tax= responseStr.replaceAll("&lt;", "<");
		 tax= tax.replaceAll("&gt;", ">");
		
		 tax=tax.substring(tax.indexOf("<iVATEngineResponse>"), tax.indexOf("</iVATEngineResponse>")+"</iVATEngineResponse>".length());
		 tax= tax.substring(tax.indexOf("<VATRate>")+"<VATRate>".length(), tax.indexOf("</VATRate>"));
			return tax;
	}

	private String getMentioning(String responseStr) {
		String  men= responseStr.replaceAll("&lt;", "<");
		men= men.replaceAll("&gt;", ">");
			
		men=men.substring(men.indexOf("<iVATEngineResponse>"), men.indexOf("</iVATEngineResponse>")+"</iVATEngineResponse>".length());
		men= men.substring(men.indexOf("<Text>")+"<Text>".length(), men.indexOf("</Text>"));
		return men;
	}
	private String getLastMentioning(String responseStr) {
		String  men= responseStr.replaceAll("&lt;", "<");
		men= men.replaceAll("&gt;", ">");
			
		men=men.substring(men.indexOf("<iVATEngineResponse>"), men.indexOf("</iVATEngineResponse>")+"</iVATEngineResponse>".length());
		men= men.substring(men.lastIndexOf("<Text>")+"<Text>".length(), men.lastIndexOf("</Text>"));
		return men;
	}
	 public  Map<String, Double>  getboxValues(String responseStr) throws SAXException, IOException, ParserConfigurationException {
		 String  tax= responseStr.replaceAll("&lt;", "<");
		 tax= tax.replaceAll("&gt;", ">");
		 tax=tax.substring(tax.indexOf("<iVATEngineResponse>"), tax.indexOf("</iVATEngineResponse>")+"</iVATEngineResponse>".length());
		// Map<String, Double> boxAndValueMap = new HashMap<String, Double>();
		 Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
				.parse(new InputSource(new StringReader(tax)));
		
		NodeList errNodes = doc.getElementsByTagName("VATReturn");
		for (int i=0;i< errNodes.getLength();i++) {
			Element err = (Element) errNodes.item(i);
			String box= err.getElementsByTagName("BoxName").item(0).getTextContent();
			System.out.println(box);
			double  boxValue= Double.parseDouble(err.getElementsByTagName("BoxValue").item(0).getTextContent());
			System.out.println(boxValue);
			boxValueMap.put(box, boxValue);
		}
		 
		 return boxValueMap;
	}
	//......................................
	@SuppressWarnings("unused")
	private void putInfile(String p) {
		 BufferedWriter bufferedWriter = null;
	        try {
	             File myFile = new File("MyTestFile.xml");
	            // check if file exist, otherwise create the file before writing
	            if (!myFile.exists()) {
	                myFile.createNewFile();
	            }
	            Writer writer = new FileWriter(myFile);
	            bufferedWriter = new BufferedWriter(writer);
	            bufferedWriter.write(p);
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally{
	            try{
	                if(bufferedWriter != null) bufferedWriter.close();
	            } catch(Exception ex){
	                 
	            }
	        }
	        getMentioningFromFile("MyTestFile.xml");
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
				 .url("http://ec2-34-254-132-242.eu-west-1.compute.amazonaws.com/iVATEngineService/EngineService.asmx")
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

	public String getMentioningFromFile(String responsexmlfile)
	{
		 try {
	         File inputFile = new File("MyTestFile.xml");
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
	         NodeList nList = doc.getElementsByTagName("Mentioning");
	         System.out.println("----------------------------");
	         
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	            Node nNode = nList.item(temp);
	            System.out.println("\nCurrent Element :" + nNode.getNodeName());
	            
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	                 System.out.println("mentioning text : " 
	                  + eElement
	                  .getElementsByTagName("Text")
	                  .item(0)
	                  .getTextContent());
	                }
	         }
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
		 return "xml";
	}
}
