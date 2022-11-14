package aShotapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class compare {
	@Test
	public static  void main() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books");
		//1st item click
		
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();
//2nd item
	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div[1]/div[2]/div[3]/div[2]/input[1]")).click();
	//cart
	driver.findElement(By.xpath("//span[normalize-space()='Shopping cart']")).click();
	//click
	driver.findElement(By.tagName("//a[@class='product-name'][normalize-space()='Computing and Internet']")).click();
	//compare
	driver.findElement(By.xpath("//input[@value='Add to compare list']")).click();
	 WebElement compare=driver.findElement(By.xpath("//tr[@class='product-price']//td[2]"));
	if(compare.getText() != null) {
		System.out.println("");
	}
		
	}
	
	
	
}
