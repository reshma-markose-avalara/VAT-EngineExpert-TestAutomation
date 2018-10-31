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
	public void RTestBEGR_ExpertiseOnImovableProperty() throws InterruptedException {
		logger = extReport.startTest("RTestBEGR_ExpertiseOnImovableProperty");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test1_RTestBEGR_ExpertiseOnImovableProperty(),
				"RTestBEGR_ExpertiseOnImovableProperty not working fine");
		logger.log(LogStatus.PASS, "RTestBEGR_ExpertiseOnImovableProperty working fine");
	  }
	 @Test(priority=2)
	 public void RTestBEGR_workOnImovableProperty() throws InterruptedException {
		logger = extReport.startTest("RTestBEGR_workOnImovableProperty");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test2_RTestBEGR_workOnImovableProperty(),
				"RTestBEGR_workOnImovableProperty not working fine");
		logger.log(LogStatus.PASS, "RTestBEGR_workOnImovableProperty working fine");
	  }
	 @Test(priority=3)
	 public void RTestBRnotRegisteredInGR_mobileSale() throws InterruptedException {
		logger = extReport.startTest("RTestBRnotRegisteredInGR_mobileSale");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test3_RTestBRnotRegisteredInGR_mobileSale(),
				"RTestBRnotRegisteredInGR_mobileSale not working fine");
		logger.log(LogStatus.PASS, "RTestBRnotRegisteredInGR_mobileSale working fine");
	  }
	 
	 @Test(priority=4)
	 public void RTestBEregisteredInGR_toGR_mobile() throws InterruptedException {
		logger = extReport.startTest("RTestBEregisteredInGR_toGR_mobile");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test4_RTestBR_GRregistered_mobileSale(),
				"RTestBEregisteredInGR_toGR_mobile not working fine");
		logger.log(LogStatus.PASS, "RTestBEregisteredInGR_toGR_mobile working fine");
	  }
	 @Test(priority=5)
	 public void RTestBE_notRegisteredInGR_toGR_workOnImovableProperty() throws InterruptedException {
		logger = extReport.startTest("RTestBE_notRegisteredInGR_toGR_workOnImovableProperty");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test5_RTestBE_notRegisteredInGR_toGR_workOnImovableProperty(),
		 "RTestBE_notRegisteredInGR_toGR_workOnImovableProperty not working fine");
		logger.log(LogStatus.PASS, "RTestBE_notRegisteredInGR_toGR_workOnImovableProperty working fine");
		  }
	 @Test(priority=6)
	 public void Rtest_NLcompNLcomp_GoodsTransportedFrom_BE_DE() throws InterruptedException {
		logger = extReport.startTest("Rtest_NLcompNL comp_ GoodsTransportedFrom_ BE_DE");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test6_Rtest_NLcompNLcomp_GoodsTransportedFrom_BE_DE(),
		 "Rtest_NLcompNL comp_ GoodsTransportedFrom_ BE_DE not working fine");
		logger.log(LogStatus.PASS, "Rtest_NLcompNL comp_ GoodsTransportedFrom_ BE_DE working fine");
		  }  
	 @Test(priority=7)
	 public void Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL() throws InterruptedException {
		logger = extReport.startTest("Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test7_Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL(),
		 "Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL not working fine");
		logger.log(LogStatus.PASS, "Rtest_BEcompFRcomp_GoodsTransportedFrom_DE_NL working fine");
		  }  
	 
	 
  @Test(priority=6,enabled=false)
  public void RTest_distanceSaleBE_DE() throws InterruptedException {
		logger = extReport.startTest("RTest_distanceSaleBE_DE");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test5_RTestdistanceSale(), "RTest_distanceSaleBE_DE not working fine");
		logger.log(LogStatus.PASS, "RTest_distanceSaleBE_DE working fine");
	  }
  
 
 
  
  
  
 
}
