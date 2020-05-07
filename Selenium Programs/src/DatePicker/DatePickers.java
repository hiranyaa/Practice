package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DatePickers {

	public static void main(String[] args) throws InterruptedException {
		
		String month="March 2019";
        String day="23";
        
        System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        
        driver.get("https://www.phptravels.net/");
        
        driver.findElement(By.xpath("//*[@id=\"dpd1\"]/div/input")).click();
        
        Thread.sleep(2000);
        
        while(true)
        {
        	String text=driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[2]")).getText();
        	
        	if(text.equals(month))
        	{
        		break;
        	}
        	else
        	{
        		driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/thead/tr[1]/th[1]")).click();
        	}
        }
        
        
        driver.findElement(By.xpath("/html/body/div[14]/div[1]/table/tbody/tr[4]/td[contains(text(),"+ day +")]"));
        driver.quit();
        
	}
     
}
