package OrangeHRM_Project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Count_Links {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		    WebDriver driver=null;
		    driver =new FirefoxDriver();
		    String url="https://opensource-demo.orangehrmlive.com/";
		   // String url="https://www.orangehrm.com/";
		    driver.get(url);
		    
		    // <input name="txtUsername" id="txtUsername" type="text">
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    
		    // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    
		    // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
		    driver.findElement(By.name("Submit")).click();
		    List<WebElement>Links=driver.findElements(By.tagName("a"));
		    int Links_Count=Links.size();
		    System.out.println("The total number of links on orange HRM :"+Links_Count);		    
		    driver.quit();
	}
}