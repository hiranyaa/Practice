package NewTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Register_getAttribute {

	public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
    WebDriver driver=null;
    String url="http://newtours.demoaut.com";
    driver =new FirefoxDriver();
    driver.get(url);
    driver.manage().window().maximize();
    
    // <a href="mercuryregister.php">REGISTER</a>
    WebElement register=driver.findElement(By.linkText("REGISTER"));
    
    String register_hrefurl=register.getAttribute("href");
    System.out.println(register_hrefurl);
    
    register.click();
    String actual_Registerurl=driver.getCurrentUrl();
    System.out.println(actual_Registerurl);
    
    if(actual_Registerurl.equals(register_hrefurl))
    {
    	System.out.println("Sucessfully navigate to Register webpage  -  PASS");
    	    }
    else {
    	System.out.println("Failed to reach Register webpage  -Fail ");
    }
     driver.quit();
	}
}
