package DatePicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class datePicker2 {

	public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
        WebDriver driver=new FirefoxDriver();
        
        driver.get("https://www.expedia.ca/");
        
        driver.findElement(By.xpath("//*[@id=\"hotel-checkin-hp-hotel\"]")).click();
        
		String month="March 2019";
        String day="23";
        
        Thread.sleep(2000);
        
        while(true)
        {
        	String text=driver.findElement(By.xpath("//caption")).getText();
        	
        	if(text.equals(month))
        	{
        		break;
        	}
        	else
        	{
        		driver.findElement(By.xpath("//*[@id=\"hotel-checkin-wrapper-hp-hotel\"]/div/div/button[1]")).click();
        	}
        }
        driver.findElements(By.xpath("//*[@id=\"hotel-checkin-wrapper-hp-hotel\"]/div/div"));
	}

}
