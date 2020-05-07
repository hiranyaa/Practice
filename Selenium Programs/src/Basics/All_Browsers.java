package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Browsers {

	public static void main(String[] args) {
		
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver(options);
		driver.get("wwww.fb.com");
		
		driver.findElement(By.id("email")).sendKeys("guptakonakalla@gmail.com");;
		
		driver.findElement(By.id("pass")).sendKeys("9494336236");
			
		driver.findElement(By.id("loginbutton")).click();
		driver.manage().window().maximize();
		
		

	//	System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	//	FirefoxDriver driver =new FirefoxDriver();
		
	//	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	//	ChromeDriver dr=new ChromeDriver();
		
	//	driver.get("https:fb.com");
		
	//	driver.findElement(By.id("email")).sendKeys("guptakonakalla@gmail.com");;
		
	//	driver.findElement(By.id("pass")).sendKeys("9494336236");
		
	//	driver.findElement(By.id("loginbutton")).click();
		
	//	driver.findElement(By.xpath("//*[@id=\"userNavigationLabel\"]")).click();
		
	//	ChromeOptions options = new ChromeOptions();
		
	//    driver.findElement(By.xpath("/html/body/div[26]/div/div/div/div/div[1]/div/div/ul/li[10]/a/span/span")).click();
		

	}

}
