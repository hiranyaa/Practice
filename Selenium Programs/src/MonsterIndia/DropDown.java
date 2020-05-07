package MonsterIndia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
      
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		
		WebDriver driver=null;
		String url="https://my.monsterindia.com/sponsered_popup.html";
		
		driver=new FirefoxDriver();
		driver.get(url);
		
		WebElement CurrentLocation=driver.findElement(By.className("border_grey1"));
		
		Select s=new Select(CurrentLocation);
		
		s.selectByVisibleText("Chennai");
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		Select s1=new Select(industry);
		
		s1.selectByIndex(1);
		s1.selectByValue("4"); 		
		
	}

}
