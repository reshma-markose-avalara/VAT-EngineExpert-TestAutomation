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

public class AnalysisPageRegressionTestGreece {
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
	
//5 scenarios for VEN-175_Greece:Local Reverse charge on game consoles, tablets and laptops
	
	@Test(priority=1)
	  public void GR_1_LocalReverseCharge() throws InterruptedException {
		  logger = extReport.startTest("GR_1");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_1_LocalReverseCharge(), "GR_1 not working fine");
		  logger.log(LogStatus.PASS, "GR_1 working fine");
	  }
	
	@Test(priority=2)
	  public void GR_2_LocalReverseCharge() throws InterruptedException {
		  logger = extReport.startTest("GR_2");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_2_LocalReverseCharge(), "GR_2 not working fine");
		  logger.log(LogStatus.PASS, "GR_2 working fine");
	  }
	@Test(priority=3)
	  public void GR_3_LocalReverseCharge() throws InterruptedException {
		  logger = extReport.startTest("GR_3");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_3_LocalReverseCharge(), "GR_3 not working fine");
		  logger.log(LogStatus.PASS, "GR_3 working fine");
	  }
	@Test(priority=4)
	  public void GR_4_LocalReverseCharge() throws InterruptedException {
		  logger = extReport.startTest("GR_4");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_4_LocalReverseCharge(), "GR_4 not working fine");
		  logger.log(LogStatus.PASS, "GR_4 working fine");
	  }
                  // scenario where inputting text
	@Test(priority=5)   
	  public void GR_5_LocalReverseCharge() throws InterruptedException {
		  logger = extReport.startTest("GR_5");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_5_LocalReverseCharge(), "GR_5 not working fine");
		  logger.log(LogStatus.PASS, "GR_5 working fine");
	  }
	
	//5 scenarios for VEN-178_Greece-Greece reverse charge on mobile phones
	@Test(priority=6)
	  public void GR_6_LocalSaleOfGoods() throws InterruptedException {
		  logger = extReport.startTest("GR_6");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_6_LocalSaleOfGoods(), "GR_6 not working fine");
		  logger.log(LogStatus.PASS, "GR_6 working fine");
	  }
	@Test(priority=7)
	  public void GR_7_LocalSaleOfGoods() throws InterruptedException {
		  logger = extReport.startTest("GR_7");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_7_LocalSaleOfGoods(), "GR_7 not working fine");
		  logger.log(LogStatus.PASS, "GR_7 working fine");
	  }
	@Test(priority=8)
	  public void GR_8_LocalSaleOfGoods() throws InterruptedException {
		  logger = extReport.startTest("GR_8");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_8_LocalSaleOfGoods(), "GR_8 not working fine");
		  logger.log(LogStatus.PASS, "GR_8 working fine");
	  }
	@Test(priority=9)
	  public void GR_9_LocalSaleOfGoods() throws InterruptedException {
		  logger = extReport.startTest("GR_9");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_9_LocalSaleOfGoods(), "GR_9 not working fine");
		  logger.log(LogStatus.PASS, "GR_9 working fine");
	  }
	@Test(priority=10)
	  public void GR_10_LocalSaleOfGoods() throws InterruptedException {
		  logger = extReport.startTest("GR_10");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_10_LocalSaleOfGoods(), "GR_10 not working fine");
		  logger.log(LogStatus.PASS, "GR_10 working fine");
	  }
	@Test(priority=11)
	  public void GR_11_LocalSaleOfGoodsTablets() throws InterruptedException {
		  logger = extReport.startTest("GR_11");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_11_LocalSaleOfGoodsTablets(), "GR_11 not working fine");
		  logger.log(LogStatus.PASS, "GR_11 working fine");
	  }
	@Test(priority=12)
	  public void GR_12_LocalSaleOfGoodsTablets() throws InterruptedException {
		  logger = extReport.startTest("GR_12");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_12_LocalSaleOfGoodsTablets(), "GR_12 not working fine");
		  logger.log(LogStatus.PASS, "GR_12 working fine");
	  }
	@Test(priority=13)
	  public void GR_13_LocalSaleOfGoodsTablets() throws InterruptedException {
		  logger = extReport.startTest("GR_13");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_13_LocalSaleOfGoodsTablets(), "GR_13 not working fine");
		  logger.log(LogStatus.PASS, "GR_13 working fine");
	  }
	@Test(priority=14)
	  public void GR_14_LocalSaleOfGoodsTablets() throws InterruptedException {
		  logger = extReport.startTest("GR_14");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_14_LocalSaleOfGoodsTablets(), "GR_14 not working fine");
		  logger.log(LogStatus.PASS, "GR_14 working fine");
	  }
	@Test(priority=15)
	  public void GR_15_LocalSaleOfGoodsTablets() throws InterruptedException {
		  logger = extReport.startTest("GR_15");
		  AnalysisPageGreece analysis = PageFactory.initElements(driver, AnalysisPageGreece.class);
		  Assert.assertTrue(analysis.GR_15_LocalSaleOfGoodsTablets(), "GR_15 not working fine");
		  logger.log(LogStatus.PASS, "GR_15 working fine");
	  }
	
  }
