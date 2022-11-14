package pom;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v102.browser.Browser;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import framewoek.helper;
import read_excel.Exceldata_config;
import read_excel.register;

public class verifylogin {
	
	
	
	@Test
	public void verifylogin() {
		
		WebDriver driver=helper.startBrowser("firefox", "https://demowebshop.tricentis.com/");
	findby fb=PageFactory.initElements(driver,findby.class);
	fb.register("dipanwita","chakraborty","cdipanwita04@gmail.com", "123456", "123456");
	fb.login("cdipanwita04@gmail.com","123456");
	driver.close();
	
	}
	@Test
public void verifylogin2() throws Exception {
		
		WebDriver driver=helper.startBrowser("chrome", "https://demowebshop.tricentis.com/");
	findby fb=PageFactory.initElements(driver,findby.class);
	fb.login("cdipanwita04@gmail.com", "123456");
	fb.addtoCart();
	
	Thread.sleep(3000);
	driver.close();}
	
	
	@Test
	public void verifylogin3() throws Exception {
			
			WebDriver driver=helper.startBrowser("edge", "https://demowebshop.tricentis.com/");
		findby fb=PageFactory.initElements(driver,findby.class);
		Thread.sleep(2000);
		fb.addtoCart();
		fb.goToCart();
		driver.close();
		
	
		
	}

}
