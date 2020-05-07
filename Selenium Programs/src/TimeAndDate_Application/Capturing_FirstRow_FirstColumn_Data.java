package TimeAndDate_Application;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_FirstRow_FirstColumn_Data {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");

		WebDriver driver=null;
		String url="https://www.timeanddate.com/worldclock/";
		
		driver = new FirefoxDriver();		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		
		WebElement cityName=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]"));
		
		String text_cityName=cityName.getText();
		
		System.out.println(text_cityName);
		
		driver.quit();
	}

}
