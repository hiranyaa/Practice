package NewTours;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Export_Data_Application_To_ExceelSheet {

	public static void main(String[] args) throws IOException {

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
		    
		    FileInputStream file = new FileInputStream("./src/com/Excel/Newtours Apllication Data to ExcelSheet.xlsx");
			
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			XSSFSheet sheet = workbook.getSheet("sheet1");
		    
		    for(int i=0;i<CountriesCount;i++)
		    {
		    	
		    	String CountryName=CountryNames.get(i).getText();
		    	System.out.println(CountryName);
		    	
		    	FileOutputStream file1=new FileOutputStream("./src/com/Excel/Newtours Apllication Data to ExcelSheet.xlsx");
				
				workbook.write(file1);
		    }
		    driver.quit();
	}

}
