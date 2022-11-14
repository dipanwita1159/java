package crossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class browser {
	WebDriver driver;

	/**
	 * This function will execute before each Test tag in testng.xml
	 * @param browser
	 * @throws Exception
	 */
	@Test
	@Parameters("browser")
	public void setup( String browser) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browser.equalsIgnoreCase("firefox")){
		//create firefox instance
			System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
			driver = new FirefoxDriver();
			Thread.sleep(3000);
		}
		//Check if parameter passed as 'chrome'
		else if(browser.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			//create chrome instance
			driver = new ChromeDriver();
			Thread.sleep(3000);
		}
		
		//Check if parameter passed as 'Edge'
				else if(browser.equalsIgnoreCase("Edge")){
					//set path to Edge.exe
					System.setProperty("webdriver.edge.driver","msedgedriver.exe");
					//create Edge instance
					driver = new EdgeDriver();
					Thread.sleep(3000);
				}
		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
				
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.close();
		Thread.sleep(5000);
	}
	
	/*
	 * @Test public void testParameterWithXML() throws InterruptedException{
	 * driver.get("https://www.demo.guru99.com/V4/"); //Find user name WebElement
	 * userName = driver.findElement(By.name("uid")); //Fill user name
	 * userName.sendKeys("guru99"); //Find password WebElement password =
	 * driver.findElement(By.name("password")); //Fill password
	 * password.sendKeys("guru99"); Thread.sleep(5000); }
	 */







}

