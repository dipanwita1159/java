package pratcise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automating_calender {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
driver.get("https://www.irctc.co.in/nget/train-search");
Thread.sleep(5000);
driver.findElement(By.tagName("button")).click();
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[2]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"jDate\"]/span/div/div/div[1]/a[1]/span")).click();
		
	List<WebElement> date=driver.findElements(By.xpath("//td[@class=\"ng-tns-c58-10 ui-datepicker-current-day ui-datepicker-today ng-star-inserted\"]"));
		 for(WebElement ele:date) {
			 String Dates=ele.getText();
			 if(Dates.equalsIgnoreCase("28"))
			 { ele.click();
			 break;
			 }
		Thread.sleep(2000);
		
		}
		}

	
		
	}
		
	


