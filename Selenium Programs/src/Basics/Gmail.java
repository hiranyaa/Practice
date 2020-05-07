package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {
				
		System.setProperty("webdriver.chrome.driver", "./dr/chromedriver.exe");
	    WebDriver	driver = new ChromeDriver();
	    
        String url="http://gmail.com";
	    
	    driver.get(url);
	   
		driver.manage().window().maximize();
		
		// id  ==  identifierId
		
		driver.findElement(By.id("identifierId")).sendKeys("hiranmaie0209@gmail.com");
		
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span/span")).click();
		
		driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("ammanana@123");
		
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/span/span"));
		
		
		
	}
}
		
