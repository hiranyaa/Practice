package OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class OHRM_Login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./dr/chromedriver.exe");
		
	     ChromeDriver driver= new ChromeDriver();
		 
	     driver.get("http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login");
	 
	     driver.manage().window().maximize();
	     
	     driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	     
	     driver.findElement(By.id("txtPassword")).sendKeys("Admin");
	     
	     driver.findElement(By.id("btnLogin")).click();


	}

}
