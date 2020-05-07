package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capture_Screenshot_Of_All_Links {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	     WebDriver driver=null;
	     String url="http://newtours.demoaut.com";

	     driver=new FirefoxDriver();
	     driver.get(url);
	    
	     List<WebElement>Links=driver.findElements(By.tagName("a"));
	    
	     int Links_Count=Links.size();
	     System.out.println("The total number of links on new Tours HomePage are :"+Links_Count);
	   
	     for(int i=0; i<Links_Count; i++)
	    {
	    	String LinkName=Links.get(i).getText();
	    	System.out.println(i+" "+LinkName);
	    	
	    	Links.get(i).click();
	    	
	    	System.out.println(driver.getTitle());
	    	System.out.println(driver.getCurrentUrl());
	    	System.out.println();
           
           File bing_Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       	
       	   FileUtils.copyFile(bing_Screenshot, new File("./Screenshot/"+LinkName+".png"));
                
       	    driver.navigate().back();

           Links=driver.findElements(By.tagName("a"));
	    }
       driver.quit();
	}
}
