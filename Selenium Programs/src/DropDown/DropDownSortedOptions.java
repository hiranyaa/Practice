package DropDown;

import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSortedOptions {

	public static void main(String[] args) {
		
			  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			  WebDriver driver = new ChromeDriver();

			  driver.get("https://testautomationpractice.blogspot.com/");

			  WebElement element = driver.findElement(By.xpath("//*[@id=\"animals\"]"));
			  Select se = new Select(element);

			  ArrayList originalList = new ArrayList();

			  for (WebElement e : se.getOptions()) {
			   originalList.add(e.getText());
			  }
			  System.out.println("originalList:" + originalList);

			  ArrayList tempList = originalList;
			  Collections.sort(tempList); // When you change one list, it changes the other list as well.

			  System.out.println("originalList:" + originalList);
			  System.out.println("tempList:" + tempList);


			  if (originalList == tempList) {
			   System.out.println("Dropdown sorted");
			  } else {
			   System.out.println("Dropdown NOT sorted");
			  }
			  driver.close();
			 }
			}

