package Jquery;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery_DragAndDrop_Element {

	public static void main(String[] args) throws InterruptedException  {
		
		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		
	
		WebDriver driver=null;
		String url="https://jqueryui.com/droppable/";
		
		
		driver =new FirefoxDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("hhhh");
		
		
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		System.out.println("Identified the frame of the WebPage");
		
		WebElement drag_Element=driver.findElement(By.id("draggable"));
		
		
		WebElement drop_Element=driver.findElement(By.id("droppable"));

		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag_Element, drop_Element).perform();
		
		driver.switchTo().defaultContent();	 
		
	}

}
