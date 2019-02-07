package Automation.VatEngine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class AnalysisPageTest {
	public WebDriver driver = null;
	public static ExtentReports extReport;
	public static ExtentTest logger;
	@BeforeClass
	public void beforeLogin()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vat-expert.qa.dev.vr.avalara.net/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Login login_page=PageFactory.initElements(driver, Login.class);
		driver= login_page.login_wordpress("nitesh", "laddu&Chin2");
		
		DateFormat dateformat = new SimpleDateFormat("MMMdd_HHmm");
		Date date = new Date();
		String var = dateformat.format(date);
		extReport = new ExtentReports("D:\\reports\\VatExpert_" + var + ".html", true);
	}
	@AfterClass
	public void endReport()
	{
		extReport.flush();
	}
	@AfterMethod
	public void afterEachMethodReport(ITestResult result)
	{
		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(LogStatus.FAIL, logger.getTest().getName());
		}
		extReport.endTest(logger);
	}
  @Test(priority=1)
  public void test1SaleWithSimplifiedTriangulation() throws InterruptedException {
	 	logger = extReport.startTest("test1SaleWithSimplifiedTriangulation");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test1(), "test1SaleWithSimplifiedTriangulation not working fine");
		logger.log(LogStatus.PASS, "test1SaleWithSimplifiedTriangulation working fine");
		
	  }

  @Test(priority=2)
  public void test2SaleGoodInstallDifcountryofEstablishment() throws InterruptedException {
	 logger=extReport.startTest("test2SaleGoodInstallDifcountryofEstablishment");
	 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	 Assert.assertTrue(analysis.Test2(), "test2SaleGoodInstallDifcountryofEstablishment not working fine");
	 logger.log(LogStatus.PASS, "test2SaleGoodInstallDifcountryofEstablishment working fine");
	
  }
  @Test(priority=3)
  public void test3PurchaseNoTransAllinSameCountry() throws InterruptedException {
	 logger=extReport.startTest("test3PurchaseNoTransAllinSameCountry");
	 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	 Assert.assertTrue(analysis.Test3(), "test3PurchaseNoTransAllinSameCountry not working fine");
	 logger.log(LogStatus.PASS, "test3PurchaseNoTransAllinSameCountry working fine");
	
  }
  @Test(priority=4)
  public void test4SaleOfService() throws InterruptedException {
	  logger=extReport.startTest("test4SaleOfService");
	 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	 Assert.assertTrue(analysis.Test4(), "test4SaleOfService not working fine");
	 logger.log(LogStatus.PASS, "test4SaleOfService working fine");
	
  }
  @Test(priority=5)
  public void test5_BL_FR_SaleOfGoodBL() throws InterruptedException {
	  logger=extReport.startTest("test5_BL_FR_SaleOfGoodBL");
	 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	 Assert.assertTrue(analysis.Test5(), "test5_BL_FR_SaleOfGoodBL not working fine");
	 logger.log(LogStatus.PASS, "test5_BL_FR_SaleOfGoodBL working fine");
	 }
  @Test(priority=7)
  public void test7_GB_GB_SaleOfGoodSameCountry() throws InterruptedException {
	 logger=extReport.startTest("test7_GB_GB_SaleOfGoodSameCountry");
	 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	 Assert.assertTrue(analysis.Test7(), "test7_GB_GB_SaleOfGoodSameCountry not working fine");
	 logger.log(LogStatus.PASS, "test7_GB_GB_SaleOfGoodSameCountry working fine");
  }
  
  @Test(priority=8)
  public void test8_GB_GB_SaleOfGoodSameCountry() throws InterruptedException {
	 logger=extReport.startTest("test8_GB_GB_SaleOfGoodSameCountry");
	 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	 Assert.assertTrue(analysis.Test8(), "test8_GB_GB_SaleOfGoodSameCountry not working fine");
	 logger.log(LogStatus.PASS, "test8_GB_GB_SaleOfGoodSameCountry working fine");
  }
  
  @Test(priority=9)
  public void test9_BEBE_ToNLTransferDocument() throws InterruptedException {
	  logger=extReport.startTest("test9_BEBE_ToNLTransferDocument");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test9(), "test9_BEBE_ToNLTransferDocument not working fine");
	  logger.log(LogStatus.PASS, "test9_BEBE_ToNLTransferDocument working fine");
  }
  @Test(priority=11)
  public void test11_BEPL_SaleOfGood() throws InterruptedException {
	  logger=extReport.startTest("test11_BEPL_SaleOfGood");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test11(), "test11_BEPL_SaleOfGood not working fine");;
	  logger.log(LogStatus.PASS, "test11_BEPL_SaleOfGood working fine");
  }
  
  @Test(priority=12)
  public void test12_BEPL_SaleOfGood() throws InterruptedException {
	  logger=extReport.startTest("test12_BEPL_SaleOfGood");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test12(), "test12_BEPL_SaleOfGood not working fine");
	  logger.log(LogStatus.PASS, "test12_BEPL_SaleOfGood working fine");
  }
  @Test(priority=13)
  public void test13_BEPL_SaleOfGood() throws InterruptedException {
	  logger=extReport.startTest("test13_BEPL_SaleOfGood");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test13(), "test13_BEPL_SaleOfGood not working fine");
	  logger.log(LogStatus.PASS, "test13_BEPL_SaleOfGood working fine");
  }
  @Test(priority=14)
  public void test14_BEDK_SaleOfGoodUsingPLvat() throws InterruptedException {
	  logger=extReport.startTest("test14_BEDK_SaleOfGoodUsingPLvat");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test14(), "test14_BEDK_SaleOfGoodUsingPLvat not working fine");
	  logger.log(LogStatus.PASS, "test14_BEDK_SaleOfGoodUsingPLvat working fine");
  }
  @Test(priority=15)
  public void test15_BEPL_SaleOfGood() throws InterruptedException {
	  logger=extReport.startTest("test15_BEPL_SaleOfGood");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test15(), "test15_BEPL_SaleOfGood not working fine");
	  logger.log(LogStatus.PASS, "test15_BEPL_SaleOfGood working fine");
  }
  @Test(priority=16)
  public void test16_BEPL_SaleOfGood() throws InterruptedException {
	  logger=extReport.startTest("test16_BEPL_SaleOfGood");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test16(), "test16_BEPL_SaleOfGood not working fine");
	  logger.log(LogStatus.PASS, "test16_BEPL_SaleOfGood working fine");
  }
  @Test(priority=17)
  public void test17_BENL_ThroughPLVatNumber_SaleOfGood() throws InterruptedException {
	  logger=extReport.startTest("test17_BENL_ThroughPLVatNumber_SaleOfGood");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test17(), "test17_BENL_ThroughPLVatNumber_SaleOfGood NOT working fine");
	  logger.log(LogStatus.PASS, "test17_BENL_ThroughPLVatNumber_SaleOfGood working fine");
  }
  @Test(priority=18)
  public void test18_BENL_ThroughPLVatNumber_SaleOfGood() throws InterruptedException {
	  logger=extReport.startTest("test18_BENL_ThroughPLVatNumber_SaleOfGood");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test18(), "test18_BENL_ThroughPLVatNumber_SaleOfGood NOT working fine");
	  logger.log(LogStatus.PASS, "test18_BENL_ThroughPLVatNumber_SaleOfGood working fine");
  }
  @Test(priority=19)
  public void test19_BENL_ThroughPLVatNumber_SaleOfGood() throws InterruptedException {
	  logger=extReport.startTest("test19_BENL_ThroughPLVatNumber_SaleOfGood");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test19(), "test19_BENL_ThroughPLVatNumber_SaleOfGood NOT working fine");
	  logger.log(LogStatus.PASS, "test19_BENL_ThroughPLVatNumber_SaleOfGood working fine");
  }
  @Test(priority=20)
  public void test20_NLNL_SalesCredit() throws InterruptedException {
	  logger=extReport.startTest("test20_NLNL_SalesCredit");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test20(), "test20_NLNL_SalesCredit not working fine");
	  logger.log(LogStatus.PASS, "test20_NLNL_SalesCredit working fine");
  }
  @Test(priority=21)
  public void test21_BH_LUIT_SaleOfTransService() throws InterruptedException {
	  logger=extReport.startTest("test21_BH_LUIT_SaleOfTransService");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test21(), "test21_BH_LUIT_SaleOfTransService not working fine");
	  logger.log(LogStatus.PASS, "test21_BH_LUIT_SaleOfTransService working fine");
  }
  @Test(priority=22)
  public void test22_BEFR_NLCH_SaleOfTransService() throws InterruptedException {
	  logger=extReport.startTest("test22_BEFR_NLCH_SaleOfTransService");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test22(), "test22_BEFR_NLCH_SaleOfTransService not working fine");
	  logger.log(LogStatus.PASS, "test22_BEFR_NLCH_SaleOfTransService working fine");
  }
  @Test(priority=23)
  public void test23_BEcomp_BEcomp_ShipToNL_SaleGoods() throws InterruptedException {
	  logger=extReport.startTest("test23_BEcomp_BEcomp_ShipToNL_SaleGoods");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test23(), "test23_BEcomp_BEcomp_ShipToNL_SaleGoods not working fine");
	  logger.log(LogStatus.PASS, "test23_BEcomp_BEcomp_ShipToNL_SaleGoods working fine");
  }
  @Test(priority=25)
  public void test25_NLcomp_BEcomp_SaleGoods() throws InterruptedException {
	  logger=extReport.startTest("test25_NLcomp_BEcomp_SaleGoods");
	  AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	  Assert.assertTrue(analysis.Test25(), "test25_NLcomp_BEcomp_SaleGoods not working fine");
	  logger.log(LogStatus.PASS, "test25_NLcomp_BEcomp_SaleGoods working fine");
  }
  @Test(priority=26)
  public void test26_BEpriv_FRcomp_SaleGoods() throws InterruptedException {
	  logger=extReport.startTest("test26_BEpriv_FRcomp_SaleGoods");
	 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	 Assert.assertTrue(analysis.Test26(), "test26_BEpriv_FRcomp_SaleGoods not working fine");
	 logger.log(LogStatus.PASS, "test26_BEpriv_FRcomp_SaleGoods working fine");
  }
  @Test(priority=27)
  public void test27_FR_BE_Car() throws InterruptedException {
	 logger=extReport.startTest("test27_FR_BE_Car");
	 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
	 Assert.assertTrue(analysis.Test27(), "test27_FR_BE_Car not working fine");
	 logger.log(LogStatus.PASS, "test27_FR_BE_Car working fine");
  }
}
