package Facebook;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_Functionality {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	   
		WebDriver driver=null;
	    String url="https://fb.com";

		driver =new FirefoxDriver();
	    driver.get(url); 
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    Actions act=new Actions(driver);
	    act.sendKeys(Keys.TAB).perform();
	    
	    act.sendKeys("Hello").perform();
	    
	    act.sendKeys(Keys.ENTER).perform();
	}

}
