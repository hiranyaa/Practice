package TimeAndDate_Application;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Capturing_First_ColumnData {

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");

       WebDriver driver=null;
       String url="https://www.timeanddate.com/worldclock/";
       
       driver =new FirefoxDriver();
       driver.get(url);
       
       driver.manage().window().maximize();
       
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
       // /html/body/div[1]/div[6]/section[1]/div
       
       // /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
    // /html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]
 // WebElement webTable=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr["+i+"]/td[1]"));
       
       String part1="/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table/tbody/tr[";
       String part2="]/td[1]";
       
       for(int i=1;i<=36;i++)
       {
    	   String CityName=driver.findElement(By.xpath(part1+i+part2)).getText();
    	   System.out.println(CityName);
       }
       driver.quit();       
       
       }

}
