package Xpath_Examples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Functionality_Of_Facebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		   
		WebDriver driver=null;
	    String url="https://fb.com";

		driver =new FirefoxDriver();
	    driver.get(url); 
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    WebElement email=driver.findElement(By.xpath("//input[@data-testid='royal-email]"));
	    email.sendKeys("srini");
	    
	    driver.findElement(By.xpath("//input[@class='inputtext' and @data-testid='royal-email]")).sendKeys("hello");
	    
	    
	    		
	    
	}

}
