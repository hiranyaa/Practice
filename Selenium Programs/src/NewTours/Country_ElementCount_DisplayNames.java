package NewTours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Country_ElementCount_DisplayNames {

	public static void main(String[] args) {
		  System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		    WebDriver driver=null;
		    String url="http://newtours.demoaut.com";
		    driver =new FirefoxDriver();
		    driver.get(url);
		    driver.manage().window().maximize();
		    
		    // <a href="mercuryregister.php">REGISTER</a>
		    WebElement register=driver.findElement(By.linkText("REGISTER"));		    
		    register.click();
		    
		    WebElement Country=driver.findElement(By.name("country"));
		    List<WebElement>CountryNames= Country.findElements(By.tagName("option")); 
		   
		    int CountriesCount=CountryNames.size();
		    System.out.println("The Total Number Of Countries Are ::"+CountriesCount);
		    
		    for(int i=0;i<CountriesCount;i++)
		    {
		    	String CountryName=CountryNames.get(i).getText();
		    	System.out.println(CountryName);
		    }
		    driver.quit();
	}

}
