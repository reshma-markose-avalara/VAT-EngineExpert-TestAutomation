package Automation.VatEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {
	public WebDriver driver = null;
	@BeforeClass
	public void beforeLogin()
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vat-expert.qa.dev.vr.avalara.net/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
  @Test
  public void validLogin() 
  {
	// Created Page Object using Page Factory
	  Login login_page=PageFactory.initElements(driver, Login.class);

	  // Call the method
	  login_page.login_wordpress("nitesh", "laddu&Chin2");
	  
	  }
}
