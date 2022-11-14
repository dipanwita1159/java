package library;

import java.io.File;


import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.Screenshot;

public class utility {


	public static Screenshot takeScreenShort( WebDriver driver,String screenshotname) throws Exception {
		try {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File scr=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scr, new File("D:\\a\\trainning season\\datadriven_excle\\screenshort\\"+screenshotname+".png"));
		System.out.println("ScreenShort taken");
		
		
	}
		catch( Exception e) {
			System.out.println("exception is " + e.getMessage());
		}
		return null;

}
}