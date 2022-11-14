package crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Input{
	WebDriver driver;
	@Test
	public void register(String firstname,String lastname,String email,String pwd,String confPwd) {
	driver.get("https://demowebshop.tricentis.com/");
	//Find user name
	   WebElement register = driver.findElement(By.xpath("//input[@value='Log in']"));
	   register.click();
	WebElement ckeckbox=driver.findElement(By.xpath("//input[@id='gender-female']"));
	ckeckbox.click();
	WebElement Firstname=driver.findElement(By.xpath("//input[@id='FirstName']"));
	Firstname.sendKeys("munu");
	WebElement Lastname=driver.findElement(By.xpath("//input[@id='LastName']"));
	Lastname.sendKeys("banerjee");
	WebElement Emailid=driver.findElement(By.xpath("//input[@id='Email']"));
	Emailid.sendKeys("cdipanwita04@gmail.com");

	WebElement passwrd=driver.findElement(By.xpath("//input[@id='Password']"));
	passwrd.sendKeys("1234567");
	WebElement ConFrmpwd=driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
	ConFrmpwd.sendKeys("1234567");
	WebElement registerButton=driver.findElement(By.xpath("//input[@id='register-button']"));
	registerButton.click();
	
	}
	
@Test
public void login(String userid, String password) {
	driver.get("https://demowebshop.tricentis.com/");
	WebElement login=driver.findElement(By.xpath("//a[normalize-space()='Log in']"));
	login.click();
	WebElement user=driver.findElement(By.xpath("//input[@id='Email']"));
	user.sendKeys("cdipanwita04@gmail.com");
	WebElement passwd=driver.findElement(By.xpath("//input[@id='Password']"));
	passwd.sendKeys("1234567");
	WebElement button=driver.findElement(By.xpath("//input[@value='Log in']"));
	button.click();
}
public void 
	
}
