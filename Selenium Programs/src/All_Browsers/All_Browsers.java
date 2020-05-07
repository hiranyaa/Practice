package All_Browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class All_Browsers {

	public static void main(String[] args) {
		
		// firefox 
		
		System.setProperty("webdriver.gecko.driver","./Driver/geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		
		//  Chrome
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();
		
		// Opera
		
	//	System.setProperty("webdriver.opera.driver", "/Driver/operadriver.exe");
	//	OperaDriver driver2 = new OperaDriver();
		
		// Edge
		
	//	EdgeDriver driver3 = new EdgeDriver();
		
		
	}

}
