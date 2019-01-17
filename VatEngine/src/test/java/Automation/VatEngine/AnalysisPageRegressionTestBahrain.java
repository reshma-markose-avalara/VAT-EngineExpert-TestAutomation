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

public class AnalysisPageRegressionTestBahrain {
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
		driver= login_page.login_wordpress("reshma", "vatExpert");
		
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
	
//	@Test(priority=1)
//	  public void GCC_1_Cultural() throws InterruptedException {
//		  logger = extReport.startTest("GCC_1");
//		  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//		  Assert.assertTrue(analysis.TestGCC1_Cultural(), "GCC_1 not working fine");
//		  logger.log(LogStatus.PASS, "GCC_1 working fine");
//	  }
//	  
//	  @Test(priority=2)
//	 public void GCC_2_Cultural() throws InterruptedException {
//		  logger = extReport.startTest("GCC_2");
//		  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//		  Assert.assertTrue(analysis.TestGCC2_Cultural(), "GCC_2 not working fine");
//		  logger.log(LogStatus.PASS, "GCC_2 working fine");
//	  }
	  
	  @Test(priority=3)
		 public void GCC_3_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_3");
			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
			  Assert.assertTrue(analysis.TestGCC3_Cultural(), "GCC_3 not working fine");
			  logger.log(LogStatus.PASS, "GCC_3 working fine");
		  }
	  
//	  @Test(priority=4)
//		 public void GCC_4_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_4");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC4_Cultural(), "GCC_4 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_4 working fine");
//		  }
//	  @Test(priority=5)
//		 public void GCC_5_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_5");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC5_Cultural(), "GCC_5 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_5 working fine");
//		  }
//	  
//	  @Test(priority=6)
//		 public void GCC_6_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_6");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC6_Cultural(), "GCC_6 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_6 working fine");
//		  }
//	  
//	  @Test(priority=7)
//		 public void GCC_7_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_7");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC7_Cultural(), "GCC_7 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_7 working fine");
//		  }
//	  @Test(priority=8)
//		 public void GCC_8_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_8");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC8_Cultural(), "GCC_8 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_8 working fine");
//		  }
//	  @Test(priority=9)
//		 public void GCC_9_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_9");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC9_Cultural(), "GCC_9 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_9 working fine");
//		  }
	  @Test(priority=10)
		 public void GCC_10_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_10");
			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
			  Assert.assertTrue(analysis.TestGCC10_Cultural(), "GCC_10 not working fine");
			  logger.log(LogStatus.PASS, "GCC_10 working fine");
		  }
//	  @Test(priority=11)
//		 public void GCC_11_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_11");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC11_Cultural(), "GCC_11 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_11 working fine");
//		  }
//	  @Test(priority=12)
//		 public void GCC_12_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_12");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC12_Cultural(), "GCC_12 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_12 working fine");
//		  }
//	  @Test(priority=13)
//		 public void GCC_13_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_13");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC13_Cultural(), "GCC_13 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_13 working fine");
//		  }
//	  @Test(priority=15)
//		 public void GCC_15_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_15");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC15_Cultural(), "GCC_15 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_15 working fine");
//		  }
//	  @Test(priority=16)
//		 public void GCC_16_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_16");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC16_Cultural(), "GCC_16 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_16 working fine");
//		  }
	  @Test(priority=17)
		 public void GCC_17_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_17");
			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
			  Assert.assertTrue(analysis.TestGCC17_Cultural(), "GCC_17 not working fine");
			  logger.log(LogStatus.PASS, "GCC_17 working fine");
		  }
//	  @Test(priority=18)
//		 public void GCC_18_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_18");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.TestGCC18_Cultural(), "GCC_18 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_18 working fine");
//		  }
	// 2 Scenarios(19-20) for VEN-222_Add Bahrain (BH) VAT rates
//	  @Test(priority=19)
//		 public void BH_19_VatRates() throws InterruptedException {
//			  logger = extReport.startTest("BH_19");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_19_VatRates(), "BH_19 not working fine");
//			  logger.log(LogStatus.PASS, "BH_19 working fine");
//		  }
//	  @Test(priority=20)
//		 public void BH_20_VatRates() throws InterruptedException {
//			  logger = extReport.startTest("BH_20");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_20_VatRates(), "BH_20 not working fine");
//			  logger.log(LogStatus.PASS, "BH_20 working fine");
//       }
	  
	// VEN-231 scenarios
//	  @Test(priority=21)
//		 public void BH_21_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_21");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_21_RentingVehicle(), "BH_21 not working fine");
//			  logger.log(LogStatus.PASS, "BH_21 working fine");
//		  }
//	  @Test(priority=22)
//		 public void BH_22_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_22");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_22_RentingVehicle(), "BH_22 not working fine");
//			  logger.log(LogStatus.PASS, "BH_22 working fine");
//		  }
//	  @Test(priority=23)
//		 public void BH_23_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_23");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_23_RentingVehicle(), "BH_23 not working fine");
//			  logger.log(LogStatus.PASS, "BH_23 working fine");
//		  }
//	  @Test(priority=24)
//		 public void BH_24_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_24");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_24_RentingVehicle(), "BH_24 not working fine");
//			  logger.log(LogStatus.PASS, "BH_24 working fine");
//		  }
//	  @Test(priority=25)
//		 public void BH_25_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_25");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_25_RentingVehicle(), "BH_25 not working fine");
//			  logger.log(LogStatus.PASS, "BH_25 working fine");
//		  }
//	  @Test(priority=26)
//		 public void BH_26_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_26");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_26_RentingVehicle(), "BH_26 not working fine");
//			  logger.log(LogStatus.PASS, "BH_26 working fine");
//		  }
	  @Test(priority=27)
		 public void BH_27_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_27");
			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
			  Assert.assertTrue(analysis.BH_27_RentingVehicle(), "BH_27 not working fine");
			  logger.log(LogStatus.PASS, "BH_27 working fine");
		  }
//	  @Test(priority=28)
//		 public void BH_28_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_28");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_28_RentingVehicle(), "BH_28 not working fine");
//			  logger.log(LogStatus.PASS, "BH_28 working fine");
//		  }
//	  @Test(priority=29)
//		 public void BH_29_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_29");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_29_RentingVehicle(), "BH_29 not working fine");
//			  logger.log(LogStatus.PASS, "BH_29 working fine");
//		  }	  
////	  //errr in this scenario
//////	  @Test(priority=30)
//////		 public void BH_30_RentingVehicle() throws InterruptedException {
//////			  logger = extReport.startTest("BH_30");
//////			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//////			  Assert.assertTrue(analysis.BH_30_RentingVehicle(), "BH_30 not working fine");
//////			  logger.log(LogStatus.PASS, "BH_30 working fine");
//////		  }
////	  
	  //VEN-240(Total 5 test cases)
//	  @Test(priority=31)
//		 public void BH_31_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_31");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_31_RentingVehicle(), "BH_31 not working fine");
//			  logger.log(LogStatus.PASS, "BH_31 working fine");
//		  }
//	  @Test(priority=32)
//		 public void BH_32_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_32");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_32_RentingVehicle(), "BH_32 not working fine");
//			  logger.log(LogStatus.PASS, "BH_32 working fine");
//		  }
//	  @Test(priority=33)
//		 public void BH_33_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_33");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_33_RentingVehicle(), "BH_33 not working fine");
//			  logger.log(LogStatus.PASS, "BH_33 working fine");
//		  }
//	  @Test(priority=34)
//		 public void BH_34_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_34");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_34_RentingVehicle(), "BH_34 not working fine");
//			  logger.log(LogStatus.PASS, "BH_34 working fine");
//		  }
//	  @Test(priority=35)
//		 public void BH_35_RentingVehicle() throws InterruptedException {
//			  logger = extReport.startTest("BH_35");
//			  AnalysisPageBahrain analysis = PageFactory.initElements(driver, AnalysisPageBahrain.class);
//			  Assert.assertTrue(analysis.BH_35_RentingVehicle(), "BH_35 not working fine");
//			  logger.log(LogStatus.PASS, "BH_35 working fine");
//		  }
	  
}
