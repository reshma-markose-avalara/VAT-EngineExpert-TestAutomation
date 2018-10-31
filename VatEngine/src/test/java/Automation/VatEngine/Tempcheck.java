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

public class Tempcheck {
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
  @Test(priority=1,enabled=false)
  public void test1SaleWithSimplifiedTriangulation() throws InterruptedException {
	 /* Login login_page=PageFactory.initElements(driver, Login.class);
		  driver= login_page.login_wordpress("nitesh", "laddu&Chin2");*/
		logger = extReport.startTest("test1SaleWithSimplifiedTriangulation");
		AnalysisPage analysis = PageFactory.initElements(driver, AnalysisPage.class);
		Assert.assertTrue(analysis.Test1(), "test1SaleWithSimplifiedTriangulation not working fine");
		logger.log(LogStatus.PASS, "test1SaleWithSimplifiedTriangulation working fine");
		
	  }
  
  @Test(priority=2,enabled=false)
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
}
