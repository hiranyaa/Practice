package NewTours;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Display_Names_Of_All_Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	     WebDriver driver=null;
	     driver=new FirefoxDriver();
	     String url="http://newtours.demoaut.com";
	     driver.get(url);
	     List<WebElement>Links=driver.findElements(By.tagName("a"));
	     int Links_Count=Links.size();
	     System.out.println("The total number of links on new Tours HomePage are :"+Links_Count);
	    for(int i=0; i<Links_Count; i++)
	    {
	    	String LinkName=Links.get(i).getText();
	    	System.out.println(i+" "+LinkName);
	    }
	    driver.quit();
	}
}
