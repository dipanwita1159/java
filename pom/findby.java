package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class findby {
	WebDriver driver;
	public findby(WebDriver driver)
	{
	this.driver=driver;
	}
@FindBy(id="user_login")WebElement userid;
@FindBy(how=How.ID,using="user_pass")WebElement password;
@FindBy(id="wp-submit")WebElement loginbutton;


public void log_wordPress(String uid,String pwd) {
	userid.sendKeys(uid);
	password.sendKeys(pwd);
	loginbutton.click();
}





}




