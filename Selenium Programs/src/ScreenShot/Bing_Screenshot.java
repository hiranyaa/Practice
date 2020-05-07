package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Bing_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException { 
		
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		   
		WebDriver driver=null;
	    String url="http://bing.com";

		driver =new FirefoxDriver();
	    driver.get(url); 
	    
	   // driver.manage().window().maximize();
	    
	  //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 
	  
	    Thread.sleep(10000);
	File bing_Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(bing_Screenshot,new File("./Screenshot/bing.png"));
	
	driver.quit();
	}
}
