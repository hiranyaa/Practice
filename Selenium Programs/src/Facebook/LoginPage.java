package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
    WebDriver driver=null;
    driver =new FirefoxDriver();
    String url="https://fb.com";
    driver.get(url); 		    
   // <input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
    driver.findElement(By.id("email")).sendKeys("guptakonakalla@gmail.com");

    //<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
    driver.findElement(By.id("pass")).sendKeys("9494336236");

    //<button value="1" id="loginbutton" name="login" tabindex="0" type="submit">Log In</button>
	driver.findElement(By.id("loginbutton")).click();
	}

}
