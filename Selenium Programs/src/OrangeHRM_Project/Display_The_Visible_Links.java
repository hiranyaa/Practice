package OrangeHRM_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Display_The_Visible_Links {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		    WebDriver driver=null;
		    driver =new FirefoxDriver();
		    String url="https://opensource-demo.orangehrmlive.com/";
		    driver.get(url);
		    
		    // <input name="txtUsername" id="txtUsername" type="text">
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    
		    // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    
		    // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		    driver.findElement(By.name("Submit")).click();
		    driver.quit();
		   
		    System.out.println("Sucessfully Login");
		    List<WebElement>Links=driver.findElements(By.tagName("a"));
		    
		     int Links_Count=Links.size();
		     System.out.println("The total number of links on new Tours HomePage are :"+Links_Count);
		     
		     for(int i=0;i<Links.size();i++)
		     {
		    	 if(Links.get(i).isDisplayed())
		    	 {
		    	  String LinkName=Links.get(i).getText();
		    	  System.out.println(LinkName);
		    	 }
		    	 }
		    driver.quit();
		    
		  //  System.out.println("To Links Of the Webpage are :"+Links.size());
		    
	}

}
