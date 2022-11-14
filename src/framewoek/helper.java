package framewoek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class helper {
	 public static WebDriver driver;
public static WebDriver startBrowser(String browsername,String url) {
	if(browsername.equals("firefox")) {
		driver=new FirefoxDriver();
	}
	else if(browsername.equals("chrome")) {
		driver=new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	driver.get(url);
	return driver;
}
 

}
