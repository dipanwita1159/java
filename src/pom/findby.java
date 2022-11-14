package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import read_excel.Exceldata_config;

public class findby {
	WebDriver driver;
	public findby(WebDriver driver)
	{
	this.driver=driver;
	}
	//register//
@FindBy(xpath = "//a[normalize-space()='Register']")WebElement register;
@FindBy(xpath = "//input[@id='gender-female']")WebElement checkbox;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firstname;
@FindBy(xpath = "//input[@id='LastName']")WebElement Lastname;
@FindBy(xpath = "//input[@id='Email']")WebElement mail;
@FindBy(xpath = "//input[@id='Password']")WebElement passwrd;
@FindBy(xpath = "//input[@id='ConfirmPassword']")WebElement confpwd;
@FindBy(xpath = "//input[@id='register-button']")WebElement Rbutton;
//login//
@FindBy(xpath = "//a[normalize-space()='Log in']")WebElement login;
@FindBy(xpath = "//input[@id='Email']")WebElement userid;
@FindBy(xpath = "//input[@id='Password']")WebElement paswrd;
@FindBy(xpath = "//input[@value='Log in']")WebElement clicklogin;
//addTocart//
@FindBy(xpath = "//li[@class='inactive']//a[normalize-space()='Books']")WebElement book;
@FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Computing and Internet']")WebElement prdtclick;
@FindBy(xpath = "//input[@id='add-to-cart-button-13']")WebElement added;
//shoppingcart//
@FindBy(xpath = "//span[normalize-space()='Shopping cart']")WebElement Gotocart;
@FindBy(xpath = "//input[@id='termsofservice']")WebElement checkbox1;
@FindBy(xpath = "//button[@id='checkout']")WebElement checkout;
//logout//
/*@FindBy(xpath = "//input[@id='Email']")WebElement Email;
@FindBy(xpath = "//input[@id='Password']")WebElement pd;
@FindBy(xpath = "//input[@value='Log in']")WebElement lgin;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;
@FindBy(xpath = "//input[@id='FirstName']")WebElement Firsname;*/










public void register  (String firstname,String lastname,String email,String pwd,String conpwd) {
	register.click();
	checkbox.click();
	Firstname.sendKeys(firstname);
	Lastname.sendKeys(lastname);
	mail.sendKeys(email);
	passwrd.sendKeys(pwd);
	confpwd.sendKeys(conpwd);
	Rbutton.click();
	}





public void login(String Userid,String pwd ) {
login.click();
userid.sendKeys(Userid);
paswrd.sendKeys(pwd);
clicklogin.click();

}

public void addtoCart() {
book.click();
prdtclick.click();
added.click();
}

public void goToCart() {
Gotocart.click();;
checkbox1.click();
checkout.click();
}






}










