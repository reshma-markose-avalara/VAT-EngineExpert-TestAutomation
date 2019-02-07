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

public class AnalysisPageRegressionTest {
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
	

//	@Test(priority=10,enabled=false)
//	public void RTestBEGR_ExpertiseOnImovableProperty() throws InterruptedException {
//		logger = extReport.startTest("RTestBEGR_ExpertiseOnImovableProperty");
//		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//		Assert.assertTrue(analysis.Test1_RTestBEGR_ExpertiseOnImovableProperty(),
//				"RTestBEGR_ExpertiseOnImovableProperty not working fine");
//		logger.log(LogStatus.PASS, "RTestBEGR_ExpertiseOnImovableProperty working fine");
//	  }
//	 @Test(priority=12,enabled=false)
//	 public void RTestBEGR_workOnImovableProperty() throws InterruptedException {
//		logger = extReport.startTest("RTestBEGR_workOnImovableProperty");
//		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//		Assert.assertTrue(analysis.Test2_RTestBEGR_workOnImovableProperty(),
//				"RTestBEGR_workOnImovableProperty not working fine");
//		logger.log(LogStatus.PASS, "RTestBEGR_workOnImovableProperty working fine");
//	  }
//	 @Test(priority=13,enabled=false)
//	 public void RTestBRnotRegisteredInGR_mobileSale() throws InterruptedException {
//		logger = extReport.startTest("RTestBRnotRegisteredInGR_mobileSale");
//		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//		Assert.assertTrue(analysis.Test3_RTestBRnotRegisteredInGR_mobileSale(),
//				"RTestBRnotRegisteredInGR_mobileSale not working fine");
//		logger.log(LogStatus.PASS, "RTestBRnotRegisteredInGR_mobileSale working fine");
//	  }
//	 
//	 @Test(priority=14,enabled=false)
//	 public void RTestBEregisteredInGR_toGR_mobile() throws InterruptedException {
//		logger = extReport.startTest("RTestBEregisteredInGR_toGR_mobile");
//		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//		Assert.assertTrue(analysis.Test4_RTestBR_GRregistered_mobileSale(),
//				"RTestBEregisteredInGR_toGR_mobile not working fine");
//		logger.log(LogStatus.PASS, "RTestBEregisteredInGR_toGR_mobile working fine");
//	  }
//	 @Test(priority=15,enabled=false)
//	 public void RTestBE_notRegisteredInGR_toGR_workOnImovableProperty() throws InterruptedException {
//		logger = extReport.startTest("RTestBE_notRegisteredInGR_toGR_workOnImovableProperty");
//		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//		Assert.assertTrue(analysis.Test5_RTestBE_notRegisteredInGR_toGR_workOnImovableProperty(),
//		 "RTestBE_notRegisteredInGR_toGR_workOnImovableProperty not working fine");
//		logger.log(LogStatus.PASS, "RTestBE_notRegisteredInGR_toGR_workOnImovableProperty working fine");
//		  }
//	 @Test(priority=16,enabled=false)
//	 public void Rtest_NLcompNLcomp_GoodsTransportedFrom_BE_DE() throws InterruptedException {
//		logger = extReport.startTest("Rtest_NLcompNL comp_ GoodsTransportedFrom_ BE_DE");
//		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//		Assert.assertTrue(analysis.Test6_Rtest_NLcompNLcomp_GoodsTransportedFrom_BE_DE(),
//		 "Rtest_NLcompNL comp_ GoodsTransportedFrom_ BE_DE not working fine");
//		logger.log(LogStatus.PASS, "Rtest_NLcompNL comp_ GoodsTransportedFrom_ BE_DE working fine");
//		  }  
//	 @Test(priority=17,enabled=false)
//	 public void Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL() throws InterruptedException {
//		logger = extReport.startTest("Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL");
//		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//		Assert.assertTrue(analysis.Test7_Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL(),
//		 "Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL not working fine");
//	logger.log(LogStatus.PASS, "Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL working fine");
//		  }  
//	 
//	 
  @Test(priority=16)
  public void RTest_distanceSaleBE_DE() throws InterruptedException {
		logger = extReport.startTest("RTest_distanceSaleBE_DE");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test5_RTestdistanceSale(), "RTest_distanceSaleBE_DE not working fine");
		logger.log(LogStatus.PASS, "RTest_distanceSaleBE_DE working fine");
	  }
  
	
	@Test(priority=1)
	  public void GCC_1_Cultural() throws InterruptedException {
		  logger = extReport.startTest("GCC_1");
		  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		  Assert.assertTrue(analysis.TestGCC1_Cultural(), "GCC_1 not working fine");
		  logger.log(LogStatus.PASS, "GCC_1 working fine");
	  }
	  
	  @Test(priority=2)
	 public void GCC_2_Cultural() throws InterruptedException {
		  logger = extReport.startTest("GCC_2");
		  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		  Assert.assertTrue(analysis.TestGCC2_Cultural(), "GCC_2 not working fine");
		  logger.log(LogStatus.PASS, "GCC_2 working fine");
	  }
	  
	  @Test(priority=3)
		 public void GCC_3_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_3");
			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
			  Assert.assertTrue(analysis.TestGCC3_Cultural(), "GCC_3 not working fine");
			  logger.log(LogStatus.PASS, "GCC_3 working fine");
		  }
	  
	  @Test(priority=4)
		 public void GCC_4_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_4");
			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
			  Assert.assertTrue(analysis.TestGCC4_Cultural(), "GCC_4 not working fine");
			  logger.log(LogStatus.PASS, "GCC_4 working fine");
		  }
	  @Test(priority=5)
		 public void GCC_5_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_5");
			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
			  Assert.assertTrue(analysis.TestGCC5_Cultural(), "GCC_5 not working fine");
			  logger.log(LogStatus.PASS, "GCC_5 working fine");
		  }
	  
	  @Test(priority=6)
		 public void GCC_6_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_6");
			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
			  Assert.assertTrue(analysis.TestGCC6_Cultural(), "GCC_6 not working fine");
			  logger.log(LogStatus.PASS, "GCC_6 working fine");
		  }
	  
	  @Test(priority=7)
		 public void GCC_7_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_7");
			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
			  Assert.assertTrue(analysis.TestGCC7_Cultural(), "GCC_7 not working fine");
			  logger.log(LogStatus.PASS, "GCC_7 working fine");
		  }
	  @Test(priority=8)
		 public void GCC_8_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_8");
			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
			  Assert.assertTrue(analysis.TestGCC8_Cultural(), "GCC_8 not working fine");
			  logger.log(LogStatus.PASS, "GCC_8 working fine");
		  }
//	  @Test(priority=9)
//		 public void GCC_9_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_9");
//			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//			  Assert.assertTrue(analysis.TestGCC9_Cultural(), "GCC_9 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_9 working fine");
////		  }
//	  @Test(priority=10)
//		 public void GCC_10_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_10");
//			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//			  Assert.assertTrue(analysis.TestGCC10_Cultural(), "GCC_10 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_10 working fine");
//		  }
//	  @Test(priority=11)
//		 public void GCC_11_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_11");
//			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//			  Assert.assertTrue(analysis.TestGCC11_Cultural(), "GCC_11 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_11 working fine");
//		  }
//	  @Test(priority=12)
//		 public void GCC_12_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_12");
//			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//			  Assert.assertTrue(analysis.TestGCC12_Cultural(), "GCC_12 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_12 working fine");
//		  }
//	  @Test(priority=13)
//		 public void GCC_13_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_13");
//			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//			  Assert.assertTrue(analysis.TestGCC13_Cultural(), "GCC_13 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_13 working fine");
//		  }
//	  @Test(priority=15)
//		 public void GCC_15_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_15");
//			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//			  Assert.assertTrue(analysis.TestGCC15_Cultural(), "GCC_15 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_15 working fine");
//		  }
//	  @Test(priority=16)
//		 public void GCC_16_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_16");
//			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//			  Assert.assertTrue(analysis.TestGCC16_Cultural(), "GCC_16 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_16 working fine");
//		  }
//	  @Test(priority=17)
//		 public void GCC_17_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_17");
//			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//			  Assert.assertTrue(analysis.TestGCC17_Cultural(), "GCC_17 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_17 working fine");
//		  }
//	  @Test(priority=18)
//		 public void GCC_18_Cultural() throws InterruptedException {
//			  logger = extReport.startTest("GCC_18");
//			  AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
//			  Assert.assertTrue(analysis.TestGCC18_Cultural(), "GCC_18 not working fine");
//			  logger.log(LogStatus.PASS, "GCC_18 working fine");
//		  }
//	  
}
