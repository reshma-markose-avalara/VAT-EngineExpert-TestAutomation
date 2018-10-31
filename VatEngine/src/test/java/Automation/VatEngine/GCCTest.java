package Automation.VatEngine;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class GCCTest {
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
  public void BE_AEcompany_service() throws InterruptedException {
	  logger=extReport.startTest("BE_AEcompany_service");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC1(), "BE_AEcompany_goods not working fine"); 
		 logger.log(LogStatus.PASS, "BE_AEcompany_service working fine");
	  }
  
  @Test(priority=2)
  public void BE_AEcompany_goodsGold() throws InterruptedException {
	  logger=extReport.startTest("BE_AEcompany_goodsGold");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC2(), "BE_AEcompany_goodsGold not working fine");
		 logger.log(LogStatus.PASS, "BE_AEcompany_goodsGold working fine");
	  }
  
  @Test(priority=3)
  public void BE_AEcompany_goods() throws InterruptedException {
	  logger=extReport.startTest("BE_AEcompany_goods");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC3(), "BE_AEcompany_goods not working fine");
		 logger.log(LogStatus.PASS, "BE_AEcompany_goods working fine");
	  }
  @Test(priority=4)
  public void BE_NL_shipFromAE_shipToAE_goods() throws InterruptedException {
	  logger=extReport.startTest("BE_AE_AEcompany_goods");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC4(), "BE_AE_AEcompany_goods not working fine");
		 logger.log(LogStatus.PASS, "BE_AE_AEcompany_goods working fine");
	  }
  
  @Test(priority=5)
  public void Export_GoodUAE_To_KSA_By_nonRes_to_KSA_VAT_regCo() throws InterruptedException {
	  logger=extReport.startTest("Export_GoodUAE_To_KSA_By_nonRes_to_KSA_VAT_regCo");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC5(), "Export_GoodUAE_To_KSA_By_nonRes_to_KSA_VAT_regCo not working fine");
		 logger.log(LogStatus.PASS, "Export_GoodUAE_To_KSA_By_nonRes_to_KSA_VAT_regCo working fine");
	  }
  @Test(priority=6)
  public void Export_GoodKSA_To_UAE_By_nonRes_to_UAE_VAT_regCo() throws InterruptedException {
	  logger=extReport.startTest("Export_GoodKSA_To_UAE_By_nonRes_to_UAE_VAT_regCo");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC6(), "Export_GoodKSA_To_UAE_By_nonRes_to_UAE_VAT_regCo not working fine");
		 logger.log(LogStatus.PASS, "Export_GoodKSA_To_UAE_By_nonRes_to_UAE_VAT_regCo working fine");
	  }
  @Test(priority=7)
  public void ExportOfGoodsBE_to_UAE_by_nonRes_to_UAE_VAT_regCo() throws InterruptedException {
	  logger=extReport.startTest("ExportOfGoodsBE_to_UAE_by_nonRes_to_UAE_VAT_regCo");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC7(), "ExportOfGoodsBE_to_UAE_by_nonRes_to_UAE_VAT_regCo not working fine");
		 logger.log(LogStatus.PASS, "ExportOfGoodsBE_to_UAE_by_nonRes_to_UAE_VAT_regCo working fine");
	  }
  @Test(priority=8)
  public void ExportOfGoodsBE_to_UAE_by_nonRes_to_KSA_VAT_regCo() throws InterruptedException {
	  logger=extReport.startTest("ExportOfGoodsBE_to_UAE_by_nonRes_to_KSA_VAT_regCo");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC8(), "ExportOfGoodsBE_to_UAE_by_nonRes_to_KSA_VAT_regCo not working fine");
		 logger.log(LogStatus.PASS, "ExportOfGoodsBE_to_UAE_by_nonRes_to_KSA_VAT_regCo working fine");
	  }
  @Test(priority=9)
  public void ExportOfGoodsBEnl_UAE_KSA_nonRes_to_nonRes() throws InterruptedException {
	  logger=extReport.startTest("ExportOfGoodsBEnl_UAE_KSA_nonRes_to_nonRes");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC9(), "ExportOfGoodsBEnl_UAE_KSA_nonRes_to_nonRes not working fine");
		 logger.log(LogStatus.PASS, "ExportOfGoodsBEnl_UAE_KSA_nonRes_to_nonRes working fine");
	  }
  @Test(priority=10)
  public void ExportOfGoodsBENL_KSA_UAE_nonRes_to_nonRes() throws InterruptedException {
	  logger=extReport.startTest("ExportOfGoodsBENL_KSA_UAE_nonRes_to_nonRes");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC10(), "ExportOfGoodsBENL_KSA_UAE_nonRes_to_nonRes not working fine");
		 logger.log(LogStatus.PASS, "ExportOfGoodsBENL_KSA_UAE_nonRes_to_nonRes working fine");
	  }
  @Test(priority=11)
  public void LocalSaleGoods_UAE_UAE_toRegistered_UAECompany() throws InterruptedException {
	  logger=extReport.startTest("LocalSaleGoods_UAE_UAE_ toRegistered_UAECompany");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC11(), "LocalSaleGoods_UAE_UAE_ toRegistered_UAECompany not working fine");
		 logger.log(LogStatus.PASS, "LocalSaleGoods_UAE_UAE_ toRegistered_UAECompany working fine");
	  }
  @Test(priority=12)
  public void LocalSaleServices_UAE_UAE_toRegisteredUAEComp() throws InterruptedException {
	  logger=extReport.startTest("LocalSaleServices_UAE_UAE_toRegisteredUAEComp");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC12(), "LocalSaleServices_UAE_UAE_toRegisteredUAEComp not working fine");
		 logger.log(LogStatus.PASS, "LocalSaleServices_UAE_UAE_toRegisteredUAEComp working fine");
	  }
  
  @Test(priority=13)
  public void LocalSaleGoods_KSA_KSA_toRegisteredKSAComp() throws InterruptedException {
	  logger=extReport.startTest("LocalSaleGoods_KSA_KSA_toRegisteredKSAComp");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC13(), "LocalSaleGoods_KSA_KSA_toRegisteredKSAComp not working fine");
		 logger.log(LogStatus.PASS, "LocalSaleGoods_KSA_KSA_toRegisteredKSAComp working fine");
	  }
  @Test(priority=14)
  public void LocalSaleServicesB2B_KSA_KSA_toRegisteredKSAComp() throws InterruptedException {
	  logger=extReport.startTest("LocalSaleServicesB2B_KSA_KSA_toRegisteredKSAComp");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC14(), "LocalSaleServicesB2B_KSA_KSA_toRegisteredKSAComp not working fine");
		 logger.log(LogStatus.PASS, "LocalSaleServicesB2B_KSA_KSA_toRegisteredKSAComp working fine");
	  }
  @Test(priority=15)
  public void LocalTransportGoodsByNonResCompToUAERegComp() throws InterruptedException {
	  logger=extReport.startTest("LocalTransportGoodsByNonResCompToUAERegComp");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC15(), "LocalTransportGoodsByNonResCompToUAERegComp not working fine");
		 logger.log(LogStatus.PASS, "LocalTransportGoodsByNonResCompToUAERegComp working fine");
	  }
  @Test(priority=16)
  public void LocalTransportGoodsByNonResCompToUAENonResComp() throws InterruptedException {
	  logger=extReport.startTest("LocalTransportGoodsByNonResCompToUAENonResComp");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC16(), "LocalTransportGoodsByNonResCompToUAENonResComp not working fine");
		 logger.log(LogStatus.PASS, "LocalTransportGoodsByNonResCompToUAENonResComp working fine");
	  }
  @Test(priority=17)
  public void LocalTransportGoodsByNonResCompToUAENonResPrivCompany() throws InterruptedException {
	  logger=extReport.startTest("LocalTransportGoodsByNonResCompToUAENonResPrivCompany");
		 AnalysisPage analysis =  PageFactory.initElements(driver, AnalysisPage.class);
		 Assert.assertTrue(analysis.test_GCC17(), "LocalTransportGoodsByNonResCompToUAENonResPrivCompany not working fine");
		 logger.log(LogStatus.PASS, "LocalTransportGoodsByNonResCompToUAENonResPrivCompany working fine");
	  }
}
