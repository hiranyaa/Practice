package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Logout {

	public static void main(String[] args) throws InterruptedException {


	     System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	     
	     WebDriver driver= new ChromeDriver();
	 
	     driver.get("https://www.facebook.com/");
	 
	     Thread.sleep(5000);
	 
	     driver.manage().window().maximize();
	 
	     Thread.sleep(5000);
	 
	     driver.findElement(By.id("email")).sendKeys("guptakonakalla@gmail.com");
	 
	     driver.findElement(By.id("pass")).sendKeys("9494336236");
	 
	   // click ok Login Button
	 
	     driver.findElement(By.id("u_0_b")).click();
	 
	     
	     driver.findElement(By.xpath("//*[@id='userNavigationLabel']")).click();
	 
	     Thread.sleep(2000);
	 
	    // click On Log out Button 
	     driver.findElement(By.id("userNavigationLabel")).click();
	 
	     driver.findElement(By.xpath("//*[@id=\"js_3v\"]/div/div/ul/li[10]/a/span/span")).click();
	     
	     WebDriverWait wait = new WebDriverWait(driver,8);
		    
		    WebElement LogOut_Button=wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out"))); 

		    LogOut_Button.click();
	}

}
