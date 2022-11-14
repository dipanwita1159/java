package crossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v102.browser.Browser;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.mohs10.base.StartBrowser;

import dataRetrive.findby;
import framewoek.helper;

public class verifylogin {
	
	@Test
	public void verifylogin() {
		
		WebDriver driver=helper.startBrowser("firefox", "https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F&aff=27964");
	findby fb=PageFactory.initElements(driver,findby.class);
fb.
	driver.close();
	
	}
	@Test
public void verifylogin2() {
		
		WebDriver driver=helper.startBrowser("chrome", "https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F&aff=27964");
	findby fb=PageFactory.initElements(driver,findby.class);
	fb.log_wordPress("cdipanwita04@gmail.com","Dipanwita@1");
	driver.close();}
	
	
	@Test
	public void verifylogin3() {
			
			WebDriver driver=helper.startBrowser("edge", "https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F&aff=27964");
		findby fb=PageFactory.initElements(driver,findby.class);
		fb.log_wordPress("cdipanwita04@gmail.com","Dipanwita@1");
		driver.close();
	}
	
	

}
