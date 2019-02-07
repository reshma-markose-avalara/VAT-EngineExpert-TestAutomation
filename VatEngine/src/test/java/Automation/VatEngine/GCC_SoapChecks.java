package Automation.VatEngine;

import java.io.BufferedReader; 
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
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
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;

public class GCC_SoapChecks {
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
	
//	@Test(priority=1)
//	public void GCC_test1_BE_AEcompany_service() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test1_BE_AEcompany_service.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Dienstverrichting niet onderworpen aan Belgische btw art. 21,  § 2 van het Wbtw / Art. 44  Richtlijn 2006/112/EG"), "mentioning not matching");
//		response.close();
//	}
//	@Test(priority=2)
//	public void GCC_test2_BE_AEcompany_goodsGold() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test2_BE_AEcompany_goodsGold.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println("p=="+p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("21.00"), "VatRate not matching");
//		response.close();
//	}
//	@Test(priority=3)
//	public void GCC_test3_BE_AEcompany_goods() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test3_BE_AEcompany_goods.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("21.00"), "VatRate not matching");
//		response.close();
//	}
//	@Test(priority=4)
//	public void GCC_test4_BE_NL_shipFromAE_shipToAE_goods() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test4_BE_NL_shipFromAE_shipToAE_goods.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
//		String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Levering van goederen niet onderworpen aan Belgische BTW.  art. 14, § 1 van het WBTW / Artikel 31 - Richtlijn 2006/112"), "mentioning not matching");
//		
//		response.close();
//	}
	
//	@Test(priority=5)
//	public void GCC_test5_Export_GoodUAE_To_KSA_By_nonRes_to_KSA_VAT_regCo() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test5_Export_GoodUAE_To_KSA_By_nonRes_to_KSA_VAT_regCo.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
//		String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Levering van goederen niet onderworpen aan Belgische BTW.  art. 14, § 2 van het WBTW / Artikel 32, eerste alinea - Richtlijn 2006/112"), "mentioning not matching");
//		
//		String Clientmentioning= getLastMentioning(p);
//		System.out.println("mentioning="+Clientmentioning);
//		Assert.assertTrue(Clientmentioning.contains("Reg Art 30"), "mentioning at client side not matching");
//		
//		response.close();
//	}
	
//	@Test(priority=6)
//	public void GCC_test6_Export_GoodKSA_To_UAE_By_nonRes_to_UAE_VAT_regCo() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test6_Export_GoodKSA_To_UAE_By_nonRes_to_UAE_VAT_regCo.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
//		String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Levering van goederen niet onderworpen aan Belgische BTW.  art. 14, § 2 van het WBTW / Artikel 32, eerste alinea - Richtlijn 2006/112"), "mentioning not matching");
//		
//		String Clientmentioning= getLastMentioning(p);
//		System.out.println("mentioning="+Clientmentioning);
//		Assert.assertTrue(Clientmentioning.contains("Reg Art 32"), "mentioning at client side not matching");
//		
//		response.close();
//	}
//	@Test(priority=7)
//	public void GCC_test7_ExportOfGoodsBE_to_UAE_by_nonRes_to_UAE_VAT_regCo() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test7_ExportOfGoodsBE_to_UAE_by_nonRes_to_UAE_VAT_regCo.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
//		String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Vrijstelling van BTW art. 39, § 1, 1° van het WBTW"), "mentioning not matching");
//		Assert.assertTrue(mentioning.contains("Artikel 146, lid 1, onder a) - Richtlijn 2006/112"), "mentioning not matching");
//		
//		response.close();
//	}
//	
//	@Test(priority=8)
//	public void GCC_test8_ExportOfGoodsBE_to_KSA_by_nonRes_to_UAE_VAT_regCo() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test8_ExportOfGoodsBE_to_UAE_by_nonRes_to_UAE_VAT_regCo.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
//		String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Levering van goederen niet onderworpen aan Belgische BTW.  art. 14, § 2 van het WBTW"), "mentioning not matching");
//		Assert.assertTrue(mentioning.contains("Artikel 32, eerste alinea - Richtlijn 2006/112"), "mentioning not matching");
//		
//		response.close();
//	}
//	
//	@Test(priority=9)
//	public void GCC_test9_ExportOfGoodsBEnl_UAE_KSA_nonRes_to_nonRes() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test9_ExportOfGoodsBEnl_UAE_KSA_nonRes_to_nonRes.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
//		String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Levering van goederen niet onderworpen aan Belgische BTW.  art. 14, § 2 van het WBTW"), "mentioning not matching");
//		Assert.assertTrue(mentioning.contains("Artikel 32, eerste alinea - Richtlijn 2006/112"), "mentioning not matching");
//		mentioning= getLastMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Reg Art 30"), "mentioning at purchase side not matching");
//		response.close();
//	}
//	
//	@Test(priority=10)
//	public void GCC_test10_ExportOfGoodsBENL_KSA_UAE_nonRes_to_nonRes() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test10_ExportOfGoodsBENL_KSA_UAE_nonRes_to_nonRes.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
//		String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Levering van goederen niet onderworpen aan Belgische BTW.  art. 14, § 2 van het WBTW"), "mentioning not matching");
//		Assert.assertTrue(mentioning.contains("Artikel 32, eerste alinea - Richtlijn 2006/112"), "mentioning not matching");
//		mentioning= getLastMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Reg Art 32"), "mentioning at purchase side not matching");
//		response.close();
//	}
//	
//	@Test(priority=11)
//	public void GCC_test11_LocalSaleGoods_UAE_UAE_toRegistered_UAECompany() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test11_LocalSaleGoods_UAE_UAE_toRegistered_UAECompany.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
//		response.close();
//	}
//	
//	@Test(priority=12)
//	public void GCC_test12_LocalSaleServices_UAE_UAE_toRegistered_UAECompany() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\GCC_test12_LocalSaleServices_UAE_UAE_toRegistered_UAECompany.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
//		response.close();
//	}
	public static Map<String, Double> boxValueMap = new HashMap<String, Double>();
//	@Test(priority=13)
//	public void GCC_test13_LocalSaleGoods_KSA_KSA_toRegisteredKSAComp() throws IOException, InterruptedException, SAXException, ParserConfigurationException
//	{
//		setupRequest("src\\test\\resources\\GCC_test13_LocalSaleGoods_KSA_KSA_toRegisteredKSAComp.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		getboxValues(p);
//		Assert.assertTrue(boxValueMap.get("1_3") == 5.00 , " box value for 1_3 not matching");
//		Assert.assertTrue(boxValueMap.get("1_1") == 100.00 , " box value for 1_3 not matching");
//		Assert.assertTrue(getVatRate(p).equalsIgnoreCase("5.00"), "VatRate not matching");
//		response.close();
//	}
//	@Test(priority=14)
//	public void GCC_test14_LocalSaleServicesB2B_KSA_KSA_toRegisteredKSAComp() throws IOException, InterruptedException, SAXException, ParserConfigurationException
//	{
//		setupRequest("src\\test\\resources\\GCC_test14_LocalSaleServicesB2B_KSA_KSA_toRegisteredKSAComp.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		getboxValues(p);
//		Assert.assertTrue(boxValueMap.get("1_3") == 5.00 , " box value for 1_3 not matching");
//		Assert.assertTrue(boxValueMap.get("1_1") == 100.00 , " box value for 1_3 not matching");
//		Assert.assertTrue(getVatRate(p).equalsIgnoreCase("5.00"), "VatRate not matching");
//		response.close();
//	}
//	@Test(priority=15)
//	public void GCC_test15_LocalTransportGoodsByNonResCompToUAERegComp() throws IOException, InterruptedException, SAXException, ParserConfigurationException
//	{
//		setupRequest("src\\test\\resources\\GCC_test15_LocalTransportGoodsByNonResCompToUAERegComp.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
//		String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Dienstverrichting niet onderworpen aan Belgische btw art. 21,  § 2 van het Wbtw"), "mentioning not matching");
//		Assert.assertTrue(mentioning.contains("Art. 44  Richtlijn 2006/112/EG"), "mentioning not matching");
//		response.close();
//	}
//
//	@Test(priority=16)
//	public void GCC_test16_LocalTransportGoodsByNonResCompToUAENonResComp() throws IOException, InterruptedException, SAXException, ParserConfigurationException
//	{
//		setupRequest("src\\test\\resources\\GCC_test16_LocalTransportGoodsByNonResCompToUAENonResComp.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
//		/*String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Dienstverrichting niet onderworpen aan Belgische btw art. 21,  § 2 van het Wbtw"), "mentioning not matching");
//		Assert.assertTrue(mentioning.contains("Art. 44  Richtlijn 2006/112/EG"), "mentioning not matching");
//	*/	response.close();
//	}
//
//	@Test(priority=17)
//	public void GCC_test17_LocalTransportGoodsByNonResCompToUAENonResPrivCompany() throws IOException, InterruptedException, SAXException, ParserConfigurationException
//	{
//		setupRequest("src\\test\\resources\\GCC_test17_LocalTransportGoodsByNonResCompToUAENonResPrivCompany.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
//		/*String mentioning= getMentioning(p);
//		System.out.println("mentioning="+mentioning);
//		Assert.assertTrue(mentioning.contains("Dienstverrichting niet onderworpen aan Belgische btw art. 21,  § 2 van het Wbtw"), "mentioning not matching");
//		Assert.assertTrue(mentioning.contains("Art. 44  Richtlijn 2006/112/EG"), "mentioning not matching");
//	*/	response.close();
//	}

	// VEN- 230 ticket scenarios start here(18 soap checks)
	
	@Test(priority=1)
	public void BH_test1_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test1_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.equalsIgnoreCase("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=2)
	public void BH_test2_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test2_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=3)
	public void BH_test3_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test3_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=4)
	public void BH_test4_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test4_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=5)
	public void BH_test5_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test5_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=6)
	public void BH_test6_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test6_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=7)
	public void BH_test7_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test7_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=8)
	public void BH_test8_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test8_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=9)
	public void BH_test9_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test9_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=10)
	public void BH_test10_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test10_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=11)
	public void BH_test11_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test11_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=12)
	public void BH_test12_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test12_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=13)
	public void BH_test13_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test13_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=15)
	public void BH_test15_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test15_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=16)
	public void BH_test16_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test16_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=17)
	public void BH_test17_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test17_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=18)
	public void BH_test18_Cultural() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test18_Cultural.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	
	// 2 Scenarios(19-20) for VEN-222_Add Bahrain (BH) VAT rates
	@Test(priority=19)
	public void BH_test19_VatRates() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test19_VatRates.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=20)
	public void BH_test20_VatRates() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test20_VatRates.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	// VEN-231 scenarios
	@Test(priority=21)
	public void BH_test21_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test21_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=22)
	public void BH_test22_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test22_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=23)
	public void BH_test23_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test23_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=24)
	public void BH_test24_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test24_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=25)
	public void BH_test25_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test25_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=26)
	public void BH_test26_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test26_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=27)
	public void BH_test27_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test27_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=28)
	public void BH_test28_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test28_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=29)
	public void BH_test29_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test29_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
//	@Test(priority=30)
//	public void BH_test30_RentingVehicle() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\BH_test30_RentingVehicle.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
//		response.close();
//	}
	  //VEN-240(Total 5 test cases)
	
	@Test(priority=31)
	public void BH_test31_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test31_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=32)
	public void BH_test32_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test32_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=33)
	public void BH_test33_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test33_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=34)
	public void BH_test34_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test34_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=35)
	public void BH_test35_RentingVehicle() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test35_RentingVehicle.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	//Testing for Ticket 198-Bahrain - export of services begins here
	@Test(priority=36)
	public void BH_test36_SaleOfServices() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test36_SaleOfServices.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=37)
	public void BH_test37_SaleOfServices() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test37_SaleOfServices.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=38)
	public void BH_test38_SaleOfServices() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test38_SaleOfServices.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=39)
	public void BH_test39_SaleOfServices() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test39_SaleOfServices.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
	//Testing for Ticket 197-Bahrain - VAT on import of TBE services begins here
	@Test(priority=40)
	public void BH_test40_telecommunicationservices() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test40_telecommunicationservices.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=41)
	public void BH_test41_telecommunicationservices() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test41_telecommunicationservices.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=42)
	public void BH_test42_telecommunicationservices() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test42_telecommunicationservices.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("5.00"), "VatRate not matching");
		response.close();
	}
//	@Test(priority=43)
//	public void BH_test43_telecommunicationservices() throws IOException, InterruptedException
//	{
//		setupRequest("src\\test\\resources\\BH_test43_telecommunicationservices.xml");
//		response = client.newCall(request).execute();
//		String p= response.body().string();
//		System.out.println(p);
//		String VatRate= getVatRate(p);
//		System.out.println("VatRate="+VatRate);
//		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
//		response.close();
//	}
//	
	//Testing for Ticket 199-Bahrain - VAT on supply of transport services-Transport of passengers begins here
	@Test(priority=44)
	public void BH_test44_TransportOfPassengers() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test44_TransportOfPassengers.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=45)
	public void BH_test45_TransportOfPassengers() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test45_TransportOfPassengers.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=46)
	public void BH_test46_TransportOfPassengers() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test46_TransportOfPassengers.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=47)
	public void BH_test47_TransportOfPassengers() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test47_TransportOfPassengers.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=48)
	public void BH_test48_TransportOfPassengers() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test48_TransportOfPassengers.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=49)
	public void BH_test49_TransportOfPassengers() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test49_TransportOfPassengers.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=50)
	public void BH_test50_TransportOfPassengers() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test50_TransportOfPassengers.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=51)
	public void BH_tes51_TransportOfPassengers() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test51_TransportOfPassengers.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	//199-TransportOfGoods
	@Test(priority=52)
	public void BH_test52_TransportOfGoods() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test52_TransportOfGoods.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=53)
	public void BH_test53_TransportOfGoods() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test53_TransportOfGoods.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=54)
	public void BH_test54_TransportOfGoods() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test54_TransportOfGoods.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=55)
	public void BH_test55_TransportOfGoods() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test55_TransportOfGoods.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=56)
	public void BH_test56_TransportOfGoods() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test56_TransportOfGoods.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=57)
	public void BH_test57_TransportOfGoods() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test57_TransportOfGoods.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=58)
	public void BH_test58_TransportOfGoods() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test58_TransportOfGoods.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
		response.close();
	}
	@Test(priority=59)
	public void BH_test59_TransportOfGoods() throws IOException, InterruptedException
	{
		setupRequest("src\\test\\resources\\BH_test59_TransportOfGoods.xml");
		response = client.newCall(request).execute();
		String p= response.body().string();
		System.out.println(p);
		String VatRate= getVatRate(p);
		System.out.println("VatRate="+VatRate);
		Assert.assertTrue(VatRate.contains("0.00"), "VatRate not matching");
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
