package Facebook;

import org.apache.xerces.util.SynchronizedSymbolTable;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validating_Title {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.get("http://facebook.com");
	    System.out.println("The Title of Facebook HomePage Title :"+driver.getTitle());
	    String Expected_url="facebook.com";
	    System.out.println("The Expected Title of Facebook HomePage :"+Expected_url);
	    String Actual_url=driver.getCurrentUrl();
	    System.out.println("The Actual Title of Facebook HomePage :"+Actual_url);
	    if(Actual_url.contains(Expected_url))
	    {
	    	System.out.println("Sucessfully navigate to ");
	    }
	}
}
