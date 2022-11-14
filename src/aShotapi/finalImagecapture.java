package aShotapi;

import java.awt.Image;
import java.awt.image.BufferedImage;
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
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class finalImagecapture {
	@Test
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demowebshop.tricentis.com/register");
		 BufferedImage expected=ImageIO.read(new File("D://a//trainning season//datadriven_excle//imagef//image.png" ));
		 WebElement book=driver.findElement(By.xpath("//h1[normalize-space()='Register']"));
Screenshot book2=new AShot().takeScreenshot(driver);
		
		  BufferedImage actual=book2.getImage();
		  ImageDiffer imagedif=new ImageDiffer();
		  ImageDiff diff=imagedif.makeDiff(expected, actual);
	
	
	if (diff.hasDiff()==true){
	
	System.out.println("file is present");
	}
	else {System.out.println("Image not matched");}
	
	
	
	
	driver.close();
	}
	
	
	
	

	}


