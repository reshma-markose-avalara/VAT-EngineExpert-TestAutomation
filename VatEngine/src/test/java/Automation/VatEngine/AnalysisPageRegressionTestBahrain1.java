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

public class AnalysisPageRegressionTestBahrain1 {
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
	
//VEN-230 Testing starts here
	
	@Test(priority=1)
	  public void GCC_1_Cultural() throws InterruptedException {
		  logger = extReport.startTest("GCC_1");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.TestGCC1_Cultural(), "GCC_1 not working fine");
		  logger.log(LogStatus.PASS, "GCC_1 working fine");
	  }
	  
	  @Test(priority=2)
	 public void GCC_2_Cultural() throws InterruptedException {
		  logger = extReport.startTest("GCC_2");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.TestGCC2_Cultural(), "GCC_2 not working fine");
		  logger.log(LogStatus.PASS, "GCC_2 working fine");
	  }
	  
	  @Test(priority=3)
		 public void GCC_3_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_3");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC3_Cultural(), "GCC_3 not working fine");
			  logger.log(LogStatus.PASS, "GCC_3 working fine");
		  }
	  
	  @Test(priority=4)
		 public void GCC_4_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_4");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC4_Cultural(), "GCC_4 not working fine");
			  logger.log(LogStatus.PASS, "GCC_4 working fine");
		  }
	  @Test(priority=5)
		 public void GCC_5_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_5");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC5_Cultural(), "GCC_5 not working fine");
			  logger.log(LogStatus.PASS, "GCC_5 working fine");
		  }
	  
	  @Test(priority=6)
		 public void GCC_6_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_6");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC6_Cultural(), "GCC_6 not working fine");
			  logger.log(LogStatus.PASS, "GCC_6 working fine");
		  }
	  
	  @Test(priority=7)
		 public void GCC_7_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_7");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC7_Cultural(), "GCC_7 not working fine");
			  logger.log(LogStatus.PASS, "GCC_7 working fine");
		  }
	  @Test(priority=8)
		 public void GCC_8_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_8");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC8_Cultural(), "GCC_8 not working fine");
			  logger.log(LogStatus.PASS, "GCC_8 working fine");
		  }
	  @Test(priority=9)
		 public void GCC_9_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_9");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC9_Cultural(), "GCC_9 not working fine");
			  logger.log(LogStatus.PASS, "GCC_9 working fine");
		  }
	  @Test(priority=10)
		 public void GCC_10_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_10");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC10_Cultural(), "GCC_10 not working fine");
			  logger.log(LogStatus.PASS, "GCC_10 working fine");
		  }
	  @Test(priority=11)
		 public void GCC_11_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_11");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC11_Cultural(), "GCC_11 not working fine");
			  logger.log(LogStatus.PASS, "GCC_11 working fine");
		  }
	  @Test(priority=12)
		 public void GCC_12_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_12");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC12_Cultural(), "GCC_12 not working fine");
			  logger.log(LogStatus.PASS, "GCC_12 working fine");
		  }
	  @Test(priority=13)
		 public void GCC_13_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_13");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC13_Cultural(), "GCC_13 not working fine");
			  logger.log(LogStatus.PASS, "GCC_13 working fine");
		  }
	  @Test(priority=15)
		 public void GCC_15_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_15");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC15_Cultural(), "GCC_15 not working fine");
			  logger.log(LogStatus.PASS, "GCC_15 working fine");
		  }
	  @Test(priority=16)
		 public void GCC_16_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_16");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC16_Cultural(), "GCC_16 not working fine");
			  logger.log(LogStatus.PASS, "GCC_16 working fine");
		  }
	  @Test(priority=17)
		 public void GCC_17_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_17");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC17_Cultural(), "GCC_17 not working fine");
			  logger.log(LogStatus.PASS, "GCC_17 working fine");
		  }
	  @Test(priority=18)
		 public void GCC_18_Cultural() throws InterruptedException {
			  logger = extReport.startTest("GCC_18");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.TestGCC18_Cultural(), "GCC_18 not working fine");
			  logger.log(LogStatus.PASS, "GCC_18 working fine");
		  }

// 2 Scenarios(19-20) for VEN-222_Add Bahrain (BH) VAT rates
	  @Test(priority=19)
		 public void BH_19_VatRates() throws InterruptedException {
			  logger = extReport.startTest("BH_19");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_19_VatRates(), "BH_19 not working fine");
			  logger.log(LogStatus.PASS, "BH_19 working fine");
		  }
	  @Test(priority=20)
		 public void BH_20_VatRates() throws InterruptedException {
			  logger = extReport.startTest("BH_20");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_20_VatRates(), "BH_20 not working fine");
			  logger.log(LogStatus.PASS, "BH_20 working fine");
	  }

//Hello all	  
// VEN-231 scenarios
	  @Test(priority=21)
		 public void BH_21_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_21");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_21_RentingVehicle(), "BH_21 not working fine");
			  logger.log(LogStatus.PASS, "BH_21 working fine");
		  }
	  @Test(priority=22)
		 public void BH_22_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_22");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_22_RentingVehicle(), "BH_22 not working fine");
			  logger.log(LogStatus.PASS, "BH_22 working fine");
		  }
	  @Test(priority=23)
		 public void BH_23_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_23");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_23_RentingVehicle(), "BH_23 not working fine");
			  logger.log(LogStatus.PASS, "BH_23 working fine");
		  }
	  @Test(priority=24)
		 public void BH_24_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_24");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_24_RentingVehicle(), "BH_24 not working fine");
			  logger.log(LogStatus.PASS, "BH_24 working fine");
		  }
	  @Test(priority=25)
		 public void BH_25_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_25");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_25_RentingVehicle(), "BH_25 not working fine");
			  logger.log(LogStatus.PASS, "BH_25 working fine");
		  }
	  @Test(priority=26)
		 public void BH_26_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_26");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_26_RentingVehicle(), "BH_26 not working fine");
			  logger.log(LogStatus.PASS, "BH_26 working fine");
		  }
	  @Test(priority=27)
		 public void BH_27_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_27");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_27_RentingVehicle(), "BH_27 not working fine");
			  logger.log(LogStatus.PASS, "BH_27 working fine");
		  }
	  @Test(priority=28)
		 public void BH_28_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_28");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_28_RentingVehicle(), "BH_28 not working fine");
			  logger.log(LogStatus.PASS, "BH_28 working fine");
		  }
	  @Test(priority=29)
		 public void BH_29_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_29");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_29_RentingVehicle(), "BH_29 not working fine");
			  logger.log(LogStatus.PASS, "BH_29 working fine");
		  }
	  //sedqwdqwd
////	  //errr in this scenario
//////	  @Test(priority=30)
//////		 public void BH_30_RentingVehicle() throws InterruptedException {
//////			  logger = extReport.startTest("BH_30");
//////			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
//////			  Assert.assertTrue(analysis.BH_30_RentingVehicle(), "BH_30 not working fine");
//////			  logger.log(LogStatus.PASS, "BH_30 working fine");
//////		  }
////	  
	  

//VEN-240(Total 5 test cases)
	  @Test(priority=31)
		 public void BH_31_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_31");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_31_RentingVehicle(), "BH_31 not working fine");
			  logger.log(LogStatus.PASS, "BH_31 working fine");
		  }
	  @Test(priority=32)
		 public void BH_32_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_32");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_32_RentingVehicle(), "BH_32 not working fine");
			  logger.log(LogStatus.PASS, "BH_32 working fine");
		  }
	  @Test(priority=33)
		 public void BH_33_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_33");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_33_RentingVehicle(), "BH_33 not working fine");
			  logger.log(LogStatus.PASS, "BH_33 working fine");
		  }
	  @Test(priority=34)
		 public void BH_34_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_34");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_34_RentingVehicle(), "BH_34 not working fine");
			  logger.log(LogStatus.PASS, "BH_34 working fine");
		  }
	  @Test(priority=35)
		 public void BH_35_RentingVehicle() throws InterruptedException {
			  logger = extReport.startTest("BH_35");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH_35_RentingVehicle(), "BH_35 not working fine");
			  logger.log(LogStatus.PASS, "BH_35 working fine");
		  }
	
//Testing for Ticket 198-Bahrain - export of services begins here
	
	  @Test(priority=36)
		 public void BH1_SaleOfServices() throws InterruptedException {
			  logger = extReport.startTest("BH_SaleOfServices");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH1_SaleOfServices(), "BH_SaleOfServices not working fine");
			  logger.log(LogStatus.PASS, "BH_SaleOfServices working fine");
		  }
	  @Test(priority=37)
		 public void BH2_SaleOfServices() throws InterruptedException {
			  logger = extReport.startTest("BH_SaleOfServices");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH2_SaleOfServices(), "BH_SaleOfServices not working fine");
			  logger.log(LogStatus.PASS, "BH_SaleOfServices working fine");
		  }
	  @Test(priority=38)
		 public void BH3_SaleOfServices() throws InterruptedException {
			  logger = extReport.startTest("BH_SaleOfServices");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH3_SaleOfServices(), "BH_SaleOfServices not working fine");
			  logger.log(LogStatus.PASS, "BH_SaleOfServices working fine");
		  }
	  @Test(priority=39)
		 public void BH4_SaleOfServices() throws InterruptedException {
			  logger = extReport.startTest("BH_SaleOfServices");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH4_SaleOfServices(), "BH_SaleOfServices not working fine");
			  logger.log(LogStatus.PASS, "BH_SaleOfServices working fine");
		  }

//Testing for Ticket 243-Bahrain - VAT on supply of goods with installation begins here
	
//	  @Test(priority=1)
//		 public void BH1_SupplyGoodsWithInstallation() throws InterruptedException {
//			  logger = extReport.startTest("BH1_SupplyGoodsWithInstallation");
//			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
//			  Assert.assertTrue(analysis.BH1_SupplyGoodsWithInstallation(), "BH1_SupplyGoodsWithInstallation not working fine");
//			  logger.log(LogStatus.PASS, "BH1_SupplyGoodsWithInstallation working fine");
//}
	
	
//Testing for Ticket 197-Bahrain - VAT on import of TBE services begins here
	
	@Test(priority=40)
	 public void BH1_SaleOfServices_telecommunication_services() throws InterruptedException {
		  logger = extReport.startTest("BH1_SaleOfServices_telecommunication_services");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH1_SaleOfServices_telecommunication_services(), "BH1_SaleOfServices_telecommunication_services not working fine");
		  logger.log(LogStatus.PASS, "BH1_SaleOfServices_telecommunication_services working fine");
}
	@Test(priority=41)
	 public void BH2_SaleOfServices_telecommunication_services() throws InterruptedException {
		  logger = extReport.startTest("BH2_SaleOfServices_telecommunication_services");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH2_SaleOfServices_telecommunication_services(), "BH2_SaleOfServices_telecommunication_services not working fine");
		  logger.log(LogStatus.PASS, "BH2_SaleOfServices_telecommunication_services working fine");
}
	@Test(priority=42)
	 public void BH3_SaleOfServices_telecommunication_services() throws InterruptedException {
		  logger = extReport.startTest("BH3_SaleOfServices_telecommunication_services");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH3_SaleOfServices_telecommunication_services(), "BH3_SaleOfServices_telecommunication_services not working fine");
		  logger.log(LogStatus.PASS, "BH3_SaleOfServices_telecommunication_services working fine");
}
	@Test(priority=43)
	 public void BH4_SaleOfServices_telecommunication_services() throws InterruptedException {
		  logger = extReport.startTest("BH4_SaleOfServices_telecommunication_services");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH4_SaleOfServices_telecommunication_services(), "BH4_SaleOfServices_telecommunication_services not working fine");
		  logger.log(LogStatus.PASS, "BH4_SaleOfServices_telecommunication_services working fine");
}

//Testing for Ticket 199-Bahrain - VAT on supply of transport services-Transport of passengers begins here
	
	@Test(priority=44)
	 public void BH1_TransportOfPassengers() throws InterruptedException {
		  logger = extReport.startTest("BH1_TransportOfPassengers");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH1_TransportOfPassengers(), "BH1_TransportOfPassengers not working fine");
		  logger.log(LogStatus.PASS, "BH1_TransportOfPassengers working fine");
}
	@Test(priority=45)
	 public void BH2_TransportOfPassengers() throws InterruptedException {
		  logger = extReport.startTest("BH2_TransportOfPassengers");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH2_TransportOfPassengers(), "BH2_TransportOfPassengers not working fine");
		  logger.log(LogStatus.PASS, "BH2_TransportOfPassengers working fine");
}
	@Test(priority=46)
	 public void BH3_TransportOfPassengers() throws InterruptedException {
		  logger = extReport.startTest("BH3_TransportOfPassengers");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH3_TransportOfPassengers(), "BH3_TransportOfPassengers not working fine");
		  logger.log(LogStatus.PASS, "BH3_TransportOfPassengers working fine");
}
	@Test(priority=47)
	 public void BH4_TransportOfPassengers() throws InterruptedException {
		  logger = extReport.startTest("BH4_TransportOfPassengers");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH4_TransportOfPassengers(), "BH4_TransportOfPassengers not working fine");
		  logger.log(LogStatus.PASS, "BH4_TransportOfPassengers working fine");
}
	@Test(priority=48)
	 public void BH5_TransportOfPassengers() throws InterruptedException {
		  logger = extReport.startTest("BH5_TransportOfPassengers");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH5_TransportOfPassengers(), "BH5_TransportOfPassengers not working fine");
		  logger.log(LogStatus.PASS, "BH5_TransportOfPassengers working fine");
}
	@Test(priority=49)
	 public void BH6_TransportOfPassengers() throws InterruptedException {
		  logger = extReport.startTest("BH6_TransportOfPassengers");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH6_TransportOfPassengers(), "BH6_TransportOfPassengers not working fine");
		  logger.log(LogStatus.PASS, "BH6_TransportOfPassengers working fine");
}
	@Test(priority=50)
	 public void BH7_TransportOfPassengers() throws InterruptedException {
		  logger = extReport.startTest("BH7_TransportOfPassengers");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH7_TransportOfPassengers(), "BH7_TransportOfPassengers not working fine");
		  logger.log(LogStatus.PASS, "BH7_TransportOfPassengers working fine");
}
	@Test(priority=51)
	 public void BH8_TransportOfPassengers() throws InterruptedException {
		  logger = extReport.startTest("BH8_TransportOfPassengers");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH8_TransportOfPassengers(), "BH8_TransportOfPassengers not working fine");
		  logger.log(LogStatus.PASS, "BH8_TransportOfPassengers working fine");
}
	
//Testing for Ticket 199-Bahrain - VAT on supply of transport services-Transport of goods begins here
	
		@Test(priority=52)
		 public void BH1_TransportOfGoods() throws InterruptedException {
			  logger = extReport.startTest("BH1_TransportOfGoods");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH1_TransportOfGoods(), "BH1_TransportOfGoods not working fine");
			  logger.log(LogStatus.PASS, "BH1_TransportOfGoods working fine");
	}
		@Test(priority=53)
		 public void BH2_TransportOfGoods() throws InterruptedException {
			  logger = extReport.startTest("BH2_TransportOfGoods");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH2_TransportOfGoods(), "BH2_TransportOfGoods not working fine");
			  logger.log(LogStatus.PASS, "BH2_TransportOfGoods working fine");
	}
		@Test(priority=54)
		 public void BH3_TransportOfGoods() throws InterruptedException {
			  logger = extReport.startTest("BH3_TransportOfGoods");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH3_TransportOfGoods(), "BH3_TransportOfGoods not working fine");
			  logger.log(LogStatus.PASS, "BH3_TransportOfGoods working fine");
	}
		@Test(priority=55)
		 public void BH4_TransportOfGoods() throws InterruptedException {
			  logger = extReport.startTest("BH4_TransportOfGoods");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH4_TransportOfGoods(), "BH4_TransportOfGoods not working fine");
			  logger.log(LogStatus.PASS, "BH4_TransportOfGoods working fine");
	}
		@Test(priority=56)
		 public void BH5_TransportOfGoods() throws InterruptedException {
			  logger = extReport.startTest("BH5_TransportOfGoods");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH5_TransportOfGoods(), "BH5_TransportOfGoods not working fine");
			  logger.log(LogStatus.PASS, "BH5_TransportOfGoods working fine");
	}
		@Test(priority=57)
		 public void BH6_TransportOfGoods() throws InterruptedException {
			  logger = extReport.startTest("BH6_TransportOfGoods");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH6_TransportOfGoods(), "BH6_TransportOfGoods not working fine");
			  logger.log(LogStatus.PASS, "BH6_TransportOfGoods working fine");
	}
		@Test(priority=58)
		 public void BH7_TransportOfGoods() throws InterruptedException {
			  logger = extReport.startTest("BH7_TransportOfGoods");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH7_TransportOfGoods(), "BH7_TransportOfGoods not working fine");
			  logger.log(LogStatus.PASS, "BH7_TransportOfGoods working fine");
	}
		@Test(priority=59)
		 public void BH8_TransportOfGoods() throws InterruptedException {
			  logger = extReport.startTest("BH8_TransportOfGoods");
			  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
			  Assert.assertTrue(analysis.BH8_TransportOfGoods(), "BH8_TransportOfGoods not working fine");
			  logger.log(LogStatus.PASS, "BH8_TransportOfGoods working fine");
	}
	
//Testing for Ticket 245-Bahrain: TBE services begins here
	@Test(priority=60)
	 public void BH1_TBEservices() throws InterruptedException {
		  logger = extReport.startTest("BH1_TBEservices");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH1_TBEservices(), "BH1_TBEservices not working fine");
		  logger.log(LogStatus.PASS, "BH1_TBEservices working fine");
}
	@Test(priority=61)
	 public void BH2_TBEservices() throws InterruptedException {
		  logger = extReport.startTest("BH2_TBEservices");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH2_TBEservices(), "BH2_TBEservices not working fine");
		  logger.log(LogStatus.PASS, "BH2_TBEservices working fine");
}
	@Test(priority=62)
	 public void BH3_TBEservices() throws InterruptedException {
		  logger = extReport.startTest("BH3_TBEservices");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH3_TBEservices(), "BH3_TBEservices not working fine");
		  logger.log(LogStatus.PASS, "BH3_TBEservices working fine");
}
	@Test(priority=63)
	 public void BH4_TBEservices() throws InterruptedException {
		  logger = extReport.startTest("BH4_TBEservices");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH4_TBEservices(), "BH4_TBEservices not working fine");
		  logger.log(LogStatus.PASS, "BH4_TBEservices working fine");
}
	@Test(priority=64)
	 public void BH5_TBEservices() throws InterruptedException {
		  logger = extReport.startTest("BH2_TBEservices");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH5_TBEservices(), "BH5_TBEservices not working fine");
		  logger.log(LogStatus.PASS, "BH5_TBEservices working fine");
}
	@Test(priority=65)
	 public void BH6_TBEservices() throws InterruptedException {
		  logger = extReport.startTest("BH6_TBEservices");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH6_TBEservices(), "BH6_TBEservices not working fine");
		  logger.log(LogStatus.PASS, "BH6_TBEservices working fine");
}
	@Test(priority=66)
	 public void BH7_TBEservices() throws InterruptedException {
		  logger = extReport.startTest("BH7_TBEservices");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH7_TBEservices(), "BH7_TBEservices not working fine");
		  logger.log(LogStatus.PASS, "BH7_TBEservices working fine");
}
	@Test(priority=67)
	 public void BH8_TBEservices() throws InterruptedException {
		  logger = extReport.startTest("BH8_TBEservices");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH8_TBEservices(), "BH8_TBEservices not working fine");
		  logger.log(LogStatus.PASS, "BH8_TBEservices working fine");
}
	@Test(priority=68)
	 public void BH9_TBEservices() throws InterruptedException {
		  logger = extReport.startTest("BH9_TBEservices");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH9_TBEservices(), "BH9_TBEservices not working fine");
		  logger.log(LogStatus.PASS, "BH9_TBEservices working fine");
}
	@Test(priority=69)
	 public void BH10_TBEservices() throws InterruptedException {
		  logger = extReport.startTest("BH10_TBEservices");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH10_TBEservices(), "BH10_TBEservices not working fine");
		  logger.log(LogStatus.PASS, "BH10_TBEservices working fine");
}
//***Testing for Ticket 262- Bahrain: VAT treatment for services related to transport of goods and passengers 
	@Test(priority=70)
	 public void BH1_servicesRelatedToTransportOfGoods() throws InterruptedException {
		  logger = extReport.startTest("BH1_servicesRelatedToTransportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH1_servicesRelatedToTransportOfGoods(), "BH1_servicesRelatedToTransportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH1_servicesRelatedToTransportOfGoods working fine");
}
	@Test(priority=71)
	 public void BH2_servicesRelatedToTransportOfGoods() throws InterruptedException {
		  logger = extReport.startTest("BH2_servicesRelatedToTransportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH2_servicesRelatedToTransportOfGoods(), "BH2_servicesRelatedToTransportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH2_servicesRelatedToTransportOfGoods working fine");
}
	@Test(priority=72)
	 public void BH3_servicesRelatedToTransportOfGoods() throws InterruptedException {
		  logger = extReport.startTest("BH3_servicesRelatedToTransportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH3_servicesRelatedToTransportOfGoods(), "BH3_servicesRelatedToTransportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH3_servicesRelatedToTransportOfGoods working fine");
}
	@Test(priority=73)
	 public void BH4_servicesRelatedToTransportOfGoods() throws InterruptedException {
		  logger = extReport.startTest("BH4_servicesRelatedToTransportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH4_servicesRelatedToTransportOfGoods(), "BH4_servicesRelatedToTransportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH4_servicesRelatedToTransportOfGoods working fine");
}
	@Test(priority=74)
	 public void BH5_servicesRelatedToTransportOfGoods() throws InterruptedException {
		  logger = extReport.startTest("BH5_servicesRelatedToTransportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH5_servicesRelatedToTransportOfGoods(), "BH5_servicesRelatedToTransportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH5_servicesRelatedToTransportOfGoods working fine");
}
	@Test(priority=75)
	 public void BH6_servicesRelatedToTransportOfGoods() throws InterruptedException {
		  logger = extReport.startTest("BH6_servicesRelatedToTransportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH6_servicesRelatedToTransportOfGoods(), "BH6_servicesRelatedToTransportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH6_servicesRelatedToTransportOfGoods working fine");
}
	@Test(priority=76)
	 public void BH7_servicesRelatedToTransportOfGoods() throws InterruptedException {
		  logger = extReport.startTest("BH7_servicesRelatedToTransportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH7_servicesRelatedToTransportOfGoods(), "BH7_servicesRelatedToTransportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH7_servicesRelatedToTransportOfGoods working fine");
}
	@Test(priority=77)
	 public void BH8_servicesRelatedToTransportOfGoods() throws InterruptedException {
		  logger = extReport.startTest("BH8_servicesRelatedToTransportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH8_servicesRelatedToTransportOfGoods(), "BH8_servicesRelatedToTransportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH8_servicesRelatedToTransportOfGoods working fine");
}
////****VEN-286 Starts here****//	
	@Test(priority=78)
	 public void BH1_questionOfUandE() throws InterruptedException {
		  logger = extReport.startTest("BH1_questionOfUandE");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH1_questionOfUandE(), "BH1_questionOfUandE not working fine");
		  logger.log(LogStatus.PASS, "BH1_questionOfUandE working fine");
}
	@Test(priority=79)
	 public void BH2_questionOfUandE() throws InterruptedException {
		  logger = extReport.startTest("BH2_questionOfUandE");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH2_questionOfUandE(), "BH2_questionOfUandE not working fine");
		  logger.log(LogStatus.PASS, "BH2_questionOfUandE working fine");
}
	@Test(priority=80)
	 public void BH3_questionOfUandE() throws InterruptedException {
		  logger = extReport.startTest("BH3_questionOfUandE");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH3_questionOfUandE(), "BH3_questionOfUandE not working fine");
		  logger.log(LogStatus.PASS, "BH3_questionOfUandE working fine");
}
	@Test(priority=81)
	 public void BH4_questionOfUandE() throws InterruptedException {
		  logger = extReport.startTest("BH4_questionOfUandE");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH4_questionOfUandE(), "BH4_questionOfUandE not working fine");
		  logger.log(LogStatus.PASS, "BH4_questionOfUandE working fine");
}
	@Test(priority=82)
	 public void BH5_questionOfUandE() throws InterruptedException {
		  logger = extReport.startTest("BH5_questionOfUandE");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH5_questionOfUandE(), "BH5_questionOfUandE not working fine");
		  logger.log(LogStatus.PASS, "BH5_questionOfUandE working fine");
}
	@Test(priority=83)
	 public void BH6_questionOfUandE() throws InterruptedException {
		  logger = extReport.startTest("BH6_questionOfUandE");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH6_questionOfUandE(), "BH6_questionOfUandE not working fine");
		  logger.log(LogStatus.PASS, "BH6_questionOfUandE working fine");
}
	@Test(priority=84)
	 public void BH7_questionOfUandE() throws InterruptedException {
		  logger = extReport.startTest("BH7_questionOfUandE");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH7_questionOfUandE(), "BH7_questionOfUandE not working fine");
		  logger.log(LogStatus.PASS, "BH7_questionOfUandE working fine");
}
	@Test(priority=85)
	 public void BH8_questionOfUandE() throws InterruptedException {
		  logger = extReport.startTest("BH8_questionOfUandE");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH8_questionOfUandE(), "BH8_questionOfUandE not working fine");
		  logger.log(LogStatus.PASS, "BH8_questionOfUandE working fine");
}
	@Test(priority=86)
	 public void BH9_questionOfUandE() throws InterruptedException {
		  logger = extReport.startTest("BH9_questionOfUandE");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH9_questionOfUandE(), "BH9_questionOfUandE not working fine");
		  logger.log(LogStatus.PASS, "BH9_questionOfUandE working fine");
}
	@Test(priority=87)
	 public void BH10_questionOfUandE() throws InterruptedException {
		  logger = extReport.startTest("BH10_questionOfUandE");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH10_questionOfUandE(), "BH10_questionOfUandE not working fine");
		  logger.log(LogStatus.PASS, "BH10_questionOfUandE working fine");
}
//****183-Bahrain - export of goods-Movable tangible property / No installation****
	@Test(priority=88)
	 public void BH1_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH1_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH1_exportOfGoods(), "BH1_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH1_exportOfGoods working fine");
}
	@Test(priority=89)
	 public void BH2_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH2_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH2_exportOfGoods(), "BH2_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH2_exportOfGoods working fine");
}
	@Test(priority=90)
	 public void BH3_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH3_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH3_exportOfGoods(), "BH3_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH3_exportOfGoods working fine");
}
	@Test(priority=91)
	 public void BH4_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH4_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH4_exportOfGoods(), "BH4_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH4_exportOfGoods working fine");
}
	@Test(priority=91)
	 public void BH5_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH5_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH5_exportOfGoods(), "BH5_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH5_exportOfGoods working fine");
}
	@Test(priority=92)
	 public void BH6_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH6_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH6_exportOfGoods(), "BH6_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH6_exportOfGoods working fine");
}
	@Test(priority=93)
	 public void BH7_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH7_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH7_exportOfGoods(), "BH7_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH7_exportOfGoods working fine");
}
	@Test(priority=94)
	 public void BH8_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH8_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH8_exportOfGoods(), "BH8_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH8_exportOfGoods working fine");
}
	@Test(priority=95)
	 public void BH9_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH9_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH9_exportOfGoods(), "BH9_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH9_exportOfGoods working fine");
}
	@Test(priority=96)
	 public void BH10_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH10_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH10_exportOfGoods(), "BH10_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH10_exportOfGoods working fine");
}
	@Test(priority=97)
	 public void BH11_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH11_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH11_exportOfGoods(), "BH11_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH11_exportOfGoods working fine");
}
	@Test(priority=98)
	 public void BH12_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH12_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH12_exportOfGoods(), "BH12_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH12_exportOfGoods working fine");
}
	@Test(priority=99)
	 public void BH13_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH13_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH13_exportOfGoods(), "BH13_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH13_exportOfGoods working fine");
}
	@Test(priority=100)
	 public void BH14_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH14_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH14_exportOfGoods(), "BH14_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH14_exportOfGoods working fine");
}
	@Test(priority=101)
	 public void BH15_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH15_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH15_exportOfGoods(), "BH15_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH15_exportOfGoods working fine");
}
	@Test(priority=102)
	 public void BH16_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH16_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH16_exportOfGoods(), "BH16_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH16_exportOfGoods working fine");
}
	@Test(priority=103)
	 public void BH17_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH17_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH17_exportOfGoods(), "BH17_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH17_exportOfGoods working fine");
}
	@Test(priority=104)
	 public void BH18_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH18_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH18_exportOfGoods(), "BH18_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH18_exportOfGoods working fine");
}
	@Test(priority=105)
	 public void BH19_exportOfGoodsss() throws InterruptedException {
		  logger = extReport.startTest("BH19_exportOfGoods");
		  AnalysisPageBahrain1 analysis = PageFactory.initElements(driver, AnalysisPageBahrain1.class);
		  Assert.assertTrue(analysis.BH19_exportOfGoods(), "BH19_exportOfGoods not working fine");
		  logger.log(LogStatus.PASS, "BH19_exportOfGoods working fine");
}
}
