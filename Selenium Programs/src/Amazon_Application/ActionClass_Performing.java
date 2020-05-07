package Amazon_Application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass_Performing {

	public static void main(String[] args) throws InterruptedException {
		
      System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
      
      
      WebDriver driver=null;      
      String url="http://amazon.in";
      
      driver = new FirefoxDriver();
      driver.get(url);
      
      driver.manage().window().maximize();
      
      Thread.sleep(10000);
      
      WebElement helloSignIn=driver.findElement(By.id("nav-link-yourAccount"));
      
      Actions act=new Actions(driver);
      
      act.moveToElement(helloSignIn).perform();
      
      driver.findElement(By.linkText("Your Order")).click();     
      
	}

}
