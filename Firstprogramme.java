package pratcise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstprogramme {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.google.com/";
		
		driver.get(url);
		driver.manage().deleteAllCookies();
		String strUrl = driver.getCurrentUrl();
	      System.out.println("Current Url is:"+ strUrl);
	      driver.quit();
		

	}

	
}
 