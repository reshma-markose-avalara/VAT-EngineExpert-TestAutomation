package Automation.VatEngine;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	

WebDriver driver;
 
 
public Login(WebDriver ldriver)
{
this.driver=ldriver;
}
 
 
@FindBy(id="Login1_UserName") 
@CacheLookup
WebElement username; 
 
@FindBy(how=How.ID,using="Login1_Password")
@CacheLookup
WebElement password;
 
@FindBy(how=How.CSS,using="input[type='submit'][name*='Login'][value='Log In'][class='button']")
@CacheLookup
WebElement submit_button;
 
/*@FindBy(how=How.LINK_TEXT,using="Lost your password?")
@CacheLookup
WebElement forget_password_link;
 */
 
public WebDriver login_wordpress(String uid,String pass)
{
username.sendKeys(uid);
password.sendKeys(pass);
submit_button.click();
return driver;
}
}
