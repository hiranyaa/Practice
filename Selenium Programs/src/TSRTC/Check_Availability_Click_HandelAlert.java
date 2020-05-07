package TSRTC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Availability_Click_HandelAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	     WebDriver driver=null;
	     driver=new FirefoxDriver();
	     String url="https://tsrtconline.in/oprs-web/";
	     driver.get(url);
	     
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     
	     driver.findElement(By.id("searchbtn")).click();
	     
	     Alert alt=driver.switchTo().alert();
	     
	     String alert_messagetext=alt.getText();
	     
	     System.out.println("The Alert Message is : "+alert_messagetext);
	     Thread.sleep(10000);
	     
	     alt.accept();
	     
	     
	}

}
