package Facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_To_FB_Application {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
	    FirefoxDriver driver = new FirefoxDriver();
	    driver.get("http://bing.com");
	   // System.out.println("launch Bing application");
	    driver.get("http://fb.com"); 
	    System.out.println("launch Facebook application ");
	    driver.quit();
	}

}
