package TimeAndDate_Application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dyanamic_WebTable {

	public static void main(String[] args) throws IOException  {


		System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");

	       WebDriver driver=null;
	       String url="https://www.timeanddate.com/worldclock/";
	       
	       driver =new FirefoxDriver();
	       driver.get(url);
	       
	       FileInputStream file=new FileInputStream("./src/com/TimeAndDate_Application/TimeAndDate Application.xlsx");
	       
	       XSSFWorkbook workbook=new XSSFWorkbook(file);
	       XSSFSheet sheet=workbook.getSheet("Sheet1");      
	    
	       
            WebElement webTable=driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div"));

	       List<WebElement>rows=webTable.findElements(By.tagName("tr"));
	       
	       for(int i=0;i<rows.size();i++)
	       {
	    	   
	    	   
		       List<WebElement>cols=webTable.findElements(By.tagName("td"));
		       Row row=sheet.createRow(i);

	         for(int j=0;j<cols.size();j++)
	    	   {
	    	  
	          String data=cols.get(j).getText();
	          
	          System.out.println(data +" ");
	    	  
	    	   Cell cell=row.createCell(j);    	    	   
	    	  cell.setCellValue(data);
	    	  System.out.println();  	       
	      
	       FileOutputStream file1=new FileOutputStream("./src/com/TimeAndDate_Application/TimeAndDate Application_1.xlsx");
	       workbook.write(file1);
	       
	     //  System.out.println();
	       }

	       }
	       driver.close();

	}


	}
