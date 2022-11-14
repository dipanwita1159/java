package aShotapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import library.utility;
import read_excel.register;
import ru.yandex.qatools.ashot.Screenshot;

public class excelshetInput {
WebDriver driver;
	
	@Test(dataProvider = "passdata")
	public void wordpress(  String firstname,String lastname,String email,String password,String Confirmpwd) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//input[@id='gender-female']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(firstname);//create account
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(Confirmpwd);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		Screenshot image2=utility.takeScreenShort(driver, "registration successfull");
		
	
	Thread.sleep(3000);
	
		
	
	
	}
	
	
	
@DataProvider(name="passdata")
	public Object[][] passdata() {

register reg=new register("D:\\a\\trainning season\\datadriven_excle\\Read data\\register.xlsx");
int row=reg.getRowCount(0);
Object[][] data= new Object[row][6];
for(int i=0;i<row;i++) { 
data[i][0]=reg.getdata(0, i, 0);
data[i][1]=reg.getdata(0, i, 1);
data[i][2]=reg.getdata(0, i, 2);
data[i][3]=reg.getdata(0, i, 3);
data[i][4]=reg.getdata(0, i, 4);
data[i][5]=reg.getdata(0, i, 5);

}
return data;}



@AfterMethod
public void close() {
	driver.close();
}
}



