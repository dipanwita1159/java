package com.mohs10.reuse;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;

import com.mohs10.base.StartBrowser;
import com.mohs10.ActionDriver.Action;
import com.mohs10.or.HomePage;

	public class CommonFuns {
		
		public Action aDriver;
		public WebDriver driver;
		
		public CommonFuns()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
		// Registration process
				/*public void Register(String Firstname, String Lastname, String Email, String Pwd, String ConfirmPwd) throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Register in DemoWeb shop");
					aDriver.navigateToApplication("https://demowebshop.tricentis.com/");
					aDriver.click(HomePage.lnkRegister, "Register link");
					aDriver.click(HomePage.rbGender, "Radio button Gender");
					aDriver.type(HomePage.txtFirstname,  Firstname, "FirstName text box");
					aDriver.type(HomePage.txtLastname, Lastname, "LastName text box");
					aDriver.type(HomePage.txtEmail, Email, "Email text box");
					aDriver.type(HomePage.txtPassword, Pwd, "password text box");
					aDriver.type(HomePage.txtConfirmpassword, ConfirmPwd, "confirm password text box");
					aDriver.click(HomePage.btnRegister, "Register button");
					aDriver.click(HomePage.btnContinue, "Continue button");*/
				
				
	/*
	 * //Login process
	 * 
	 * public void logIn(String email, String pwd) throws Exception {
	 * StartBrowser.childTest =
	 * StartBrowser.parentTest.createNode("Login to DemoWeb shop");
	 * aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
	 * aDriver.click(HomePage.lnkLogin, "Login link");
	 * aDriver.type(HomePage.txtemail, email, "email text box");
	 * aDriver.type(HomePage.txtpwd, pwd, "password text box");
	 * aDriver.click(HomePage.btnlogin, "Login button");
	 * aDriver.click(HomePage.lnkLogout, "Logout link");
	 * 
	 * // //invalid login process
	 * 
	 * public void invalidLogIn(String email, String pwd) throws Exception {
	 * StartBrowser.childTest = StartBrowser.parentTest.
	 * createNode("Login to DemoWeb shop with invalid credentials");
	 * aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
	 * aDriver.click(HomePage.lnkLogin, "Login link");
	 * aDriver.type(HomePage.txtemail, email, "email text box");
	 * aDriver.type(HomePage.txtpwd, pwd, "password text box");
	 * aDriver.click(HomePage.btnlogin, "Login button"); }
	 */
		
		
			
				/*
				 * //News button public void Pagedown() throws Exception
				 * 
				 * { StartBrowser.childTest =StartBrowser.parentTest.createNode("Page down");
				 * aDriver.navigateToApplication("http://demowebshop.tricentis.com/"); Actions
				 * a=new Actions(driver); a.sendKeys(Keys.PAGE_DOWN).perform();
				 * a.sendKeys(Keys.PAGE_DOWN).perform(); }
				 * 
				 * public void Newsbtn() throws Exception { StartBrowser.childTest =
				 * StartBrowser.parentTest.createNode("News button");
				 * aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
				 * aDriver.click(HomePage.btnNews, "Performed click operation on News button");
				 * }
				 */
				/*
				 * //Blog Link public void Blogbtn() throws Exception { StartBrowser.childTest =
				 * StartBrowser.parentTest.createNode("Blog buttton");
				 * aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
				 * aDriver.click(HomePage.btnBlog, "Performed click operation on Blog button");
				 */
			  
			  
				
				  //Categories 
		/*public void Categories() throws Exception {
				  StartBrowser.childTest =
				  StartBrowser.parentTest.createNode("Category links");
				  aDriver.navigateToApplication("https://www.demo.guru99.com/V4/");
				  aDriver.click(HomePage.lnkbook, "Performed click operation on books link");
				  aDriver.click(HomePage.addtocart,"added to cart");
				  
				  aDriver.click(HomePage.lnkApparelandShoes, "null");
				  aDriver.click(HomePage.dress,"dress added");
				  aDriver.click(HomePage.dressclick, "null"); // aDriver.click(HomePage.mobile,"null"); // aDriver.click(HomePage.clickonmobile, "null");
				  aDriver.click(HomePage.lnkShoppingCart,"cart");
				  aDriver.click(HomePage.remove, "null"); aDriver.click(HomePage.adclick,
				  "null"); aDriver.click(HomePage.checkout, "null");*/
		
			  
			  
              
			  //shopping cart entry
			  /*public void Shopping(String email,String pwd) throws Exception {
					StartBrowser.childTest =
							  StartBrowser.parentTest.createNode("shopping cart");
					aDriver.navigateToApplication("https://demowebshop.tricentis.com/");
					aDriver.click(HomePage.shop, "pwd");
					aDriver.type(HomePage.email, email, "email");
					aDriver.type(HomePage.password, pwd, "pwd");*/
			   
			 
			  
			
			   /*aDriver.click(HomePage.
			  lnkElectronics,"Performed click operation on Electronics Link");
			  aDriver.click(HomePage.
			  lnkApparelandShoes,"Performed click operation on Apparel and Shoes Link");
			  aDriver.click(HomePage.
			  lnkDigitaldownloads,"Performed click operation on Digital Downloads Link");
			  aDriver.click(HomePage.lnkJewelry,"Performed click operation on Jewelry Link"
			  ); aDriver.click(HomePage.
			  lnkGiftCards,"Performed click operation on Gift Cards Link");
			  
			
			  */
	
	public void compare() throws Exception {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("compareproducts");
		aDriver.navigateToApplication("https://demowebshop.tricentis.com/");
		//1st item
		aDriver.click(HomePage.computerclick,"mouseover");
		
		aDriver.click(HomePage.dekstop, "dekstop click");
		
		aDriver.click(HomePage.product1, "product1 click");
		
		aDriver.click(HomePage.compare1, "add to compare click");
	//2nd item	
aDriver.click(HomePage.computerclick,"mouseover");
		
		aDriver.click(HomePage.dekstop, "dekstop click");
		
		
		aDriver.click(HomePage.product2,"product 2 click");
		aDriver.click(HomePage.compare2, "add to compare click");
		
		if(HomePage.price!=HomePage.price) {
			aDriver.click(HomePage.remove,"product removed");
		}
		else{ System.out.println("the value is same");}
			
		
	
			  
			  }
			  
			  
			  }
			  
			  
			  
			  
			  
			 