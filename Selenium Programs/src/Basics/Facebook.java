package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {


	     System.setProperty("webdriver.chrome.driver", "./dr/chromedriver.exe");
	     
	     ChromeDriver driver= new ChromeDriver();
	 
	     driver.get("www.facebook.com");
	 
	     driver.manage().window().maximize();
	 
	     Thread.sleep(5000);
	 
	     driver.findElement(By.id("email")).sendKeys("guptakonakalla@gmail.com");
	 
	     driver.findElement(By.id("pass")).sendKeys("9494336236");
	 
	   // click ok Login Button
	 
	     driver.findElement(By.xpath("//*[@id=\"u_0_4\"]")).click();
	 
	     
	     driver.findElement(By.xpath("//*[@id=\"js_25\"]/div/div/ul/li[10]/a/span/span")).click();
	 
	     Thread.sleep(2000);
	 
	    // click On Log out Button 
	 
	     driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();


	}

}
