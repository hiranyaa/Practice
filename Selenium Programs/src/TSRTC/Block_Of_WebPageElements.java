package TSRTC;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Block_Of_WebPageElements {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	     WebDriver driver=null;
	     driver=new FirefoxDriver();
	     String url="https://tsrtconline.in/oprs-web/";
	     driver.get(url);
	     
	     driver.manage().window().maximize();
	     
	     // <div class="menu-wrap">	     
	     WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
	     
	     List<WebElement>headerBlockLinks=headerBlock.findElements(By.tagName("a"));
	     System.out.println("The total number of elements of the headerblock are :"+headerBlockLinks);
	     
	     for(int i=0;i<headerBlockLinks.size();i++)
	     { 
	    	  String headerBlockName=headerBlockLinks.get(i).getText();
	    	  System.out.println(headerBlockName);	 
	     } 	     	     
	   	}

}
