package Xpath_Examples;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Check_Radio_buttons_EchoEcho_Application {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		   
		WebDriver driver=null;
	    String url="http://www.echoecho.com/htmlforms10.htm";

		driver =new FirefoxDriver();
	    driver.get(url); 
	    
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	    WebElement radioButtonsblock=driver.findElement(By.xpath("/html/body/div/"));
	    
	   List<WebElement>gropu1_radioButtons=radioButtonsblock.findElements(By.name("group1"));
	    
	    System.out.println("The group1 radio buttons :"+gropu1_radioButtons);
	    
	    for(int i=0;i<gropu1_radioButtons.size();i++)
	    {
	    	gropu1_radioButtons.get(i).click();
	    	
	    	for(int j=0;j<gropu1_radioButtons.size();j++)
	    	{
	    		System.out.println(gropu1_radioButtons.get(i).getAttribute("value")+ " - "+gropu1_radioButtons.get(j).getAttribute("checked"));
	    		
	    	}
	    }
	   driver.quit(); 
	}

}
