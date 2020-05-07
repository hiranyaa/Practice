package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Gmail_Base {

WebDriver driver=null;
	
	String url="www.gmail.com";
	
  @BeforeTest
  public void setUp()
  {
	  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.get(url);
	  
  }
  
  
 /*  @AfterTest
  public void Close()
  {
	  driver.quit();  */
  }


