package loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	
	WebDriver driver;
	
	
	 By email=By.xpath("//input[@id='user_login']");
	 By pwd=By.xpath("//input[@id='user_pass']");
	 By clickOnLogin=By.xpath("//input[@id='wp-submit']");
	 
	 
	 public loginpage(WebDriver driver) {
		 this.driver=driver;
		 
	 }
	 public void login(String userid,String pass) {
		 driver.findElement(email).sendKeys(userid);
		 driver.findElement(pwd).sendKeys(pass);
		 driver.findElement(clickOnLogin).click();
	 }
	 public void userName(String user) {
		 
		 driver.findElement(email).sendKeys(user);
		 
	 }
	 public void  password(String password) {
		 driver.findElement(pwd).sendKeys(password);
		 
	 }
	 public void clickOnLogin() {
		 driver.findElement(clickOnLogin).click();
	 }
	 

}
