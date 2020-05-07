package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FB_Login_Logout {

	public static void main(String[] args) throws InterruptedException {
		
		 ChromeOptions options = new ChromeOptions();
		    
		 options.addArguments("--disable-notifications");
		
	     System.setProperty("webdriver.chrome.driver","./dr/chromedriver.exe");
	
	     WebDriver driver =new ChromeDriver(options);
		
	  //  ChromeDriver driver=new ChromeDriver(); 
	   
	    String url="http://facebook.com";
	    
	    driver.get(url);
	    
	    driver.manage().window().maximize();
	    
	    Thread.sleep(5000);
	    	    
	    driver.findElement(By.id("email")).sendKeys("hiranmaie0209@gmail.com");	    

	    driver.findElement(By.id("pass")).sendKeys("gupta@jhansi123");	    
	    	    
	    WebElement LogIn_Button=driver.findElement(By.id("loginbutton"));
	    LogIn_Button.click();
	    
	    WebElement LogOut_Menu=driver.findElement(By.id("logoutMenu"));
	    LogOut_Menu.click();	
	    
        WebDriverWait wd= new WebDriverWait(driver,5);
	    
	    WebElement LogOut_Button=wd.until(ExpectedConditions.elementToBeClickable(By.linkText("Log Out"))); 

	    LogOut_Button.click();

	}
}
