package validateLogInPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import loginpage.loginpage;

public class verifyLogIn {
	
	@Test
	public void verify() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://wordpress.com/wp-login.php?redirect_to=https%3A%2F%2Fwordpress.com%2F&aff=27964");
		loginpage login=new loginpage(driver);
		
		driver.close();
	}

}
