package Automation.VatEngine;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class openbrowser {
	static WebDriver driver=null;
    @Test
    public static void main()//(String[] args) {
    
    { 
        // TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
driver = new ChromeDriver();
//driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59");
    driver.get("https://in.yahoo.com/?p=us");
    driver.manage().window().maximize();
    //driver.findElement(By.ById.id(""));

    String title= driver.getTitle();
    System.out.println(title);
    if (title.contentEquals("Yahoo"))
    {
        System.out.println("Pass");
    }
    else
    {
        System.out.println("Fail");
    }
        }
}
 /*   @Test


    public void testCase1() {
    
    System.out.println("This is the Test Case 1");

    }

    @Test

    public void testCase2() {

    System.out.println("This is the Test Case 2");

    }

    @BeforeMethod

    public void beforeMethod() {

    System.out.println("This will execute before every Method");

    }

    @AfterMethod

    public void afterMethod() {

    System.out.println("This will execute after every Method");

    }

    @BeforeClass

    public void beforeClass() {

    System.out.println("This will execute before the Class");

    }

    @AfterClass

    public void afterClass() {

    System.out.println("This will execute after the Class");

    }

    @BeforeTest

    public void beforeTest() {

    System.out.println("This will execute before the Test");

    }

    @AfterTest

    public void afterTest() {

    System.out.println("This will execute after the Test");

    }

    @BeforeSuite

    public void beforeSuite() {

    System.out.println("This will execute before the Test Suite");

    }

    @AfterSuite

    public void afterSuite() {

    System.out.println("This will execute after the After Suite");

    }
}
*/
