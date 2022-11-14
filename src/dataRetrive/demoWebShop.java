package dataRetrive;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
@Test
public class demoWebShop {
	public static void main() throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demowebshop.tricentis.com/computing-and-internet");
		WebElement book=driver.findElement(By.xpath("//*[@id=\"main-product-img-13\"]"));
		  Screenshot book1=new AShot().takeScreenshot(driver);
		
		  ImageIO.write(book1.getImage(), "png",new File("D:\\a\\trainning season\\datadriven_excle\\screenshort2.png"));

	File f=new File("D:\\a\\trainning season\\datadriven_excle\\screenshort2.png");
	if (f.exists())
	{ 
	System.out.println("file is present");
	}
	else {System.out.println("Image not matched");}
	
	
	
	
	driver.close();
	}
	
	
	
	}


