package OrangeHRM_Project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPage {

	public static void main(String[] args) throws IOException, InterruptedException
	{	
    System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
    WebDriver driver=null;
    
    String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
    driver =new FirefoxDriver();
   
    driver.get(url);
    
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
  //  FileInputStream file=new FileInputStream("");

    FileInputStream file = new FileInputStream("./src/com/OrangeHRM_Project/Orange HRM.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		for(int i=1; i<=rowcount;i++)
			
		{
			Row r=sheet.getRow(i);
			
			int cellcount=r.getLastCellNum();	
			
			driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
			driver.findElement(By.id("btnLogin")).click();
			String Expected_Title = "Welcome Admin";
			System.out.println("The Expected Title of OrangeHrm Login Page is:"+Expected_Title);
			String actual_Title=driver.findElement(By.id("welcome")).getText();
			System.out.println("The Actual Title of OrangeHrm login page is:"+actual_Title);
			
			if(actual_Title.equalsIgnoreCase(Expected_Title))
			{
				System.out.println("Title Matched-PASS");
			}
			
			else
				
			{
				System.out.println("Title Not Matched-FAIL");
			}
			
	        Thread.sleep(3000);

			
   /* 
    
    // <input name="txtUsername" id="txtUsername" type="text">
    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
    
    // <input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
    driver.findElement(By.id("txtPassword")).sendKeys("Admin"); 
    
    // <input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
    driver.findElement(By.name("Submit")).click(); */
    
    driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']/b")).click();
    
   //  driver.findElement(By.tagName("PIM")).click();
    // driver.findElement(By.linkText("Add Employee")).click();
    
    driver.findElement(By.id("menu_pim_addEmployee")).click();
    
    // <input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
    
    driver.findElement(By.id("firstName")).sendKeys("Hiranya");
    
    // <input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
    
    driver.findElement(By.id("lastName")).sendKeys("Konakalla");
    
    // <input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0001" id="employeeId">
    
    String actual_value=driver.findElement(By.name("employeeId")).getAttribute("value");
    
    // <input type="button" class="" id="btnSave" value="Save">
    
    driver.findElement(By.id("btnSave")).click();
    
    // expected ---    menu_pim_addEmployee
    //  actual   ----  personal_txtEmployeeId
    
    
    String expected_value =driver.findElement(By.name("personal[txtEmployeeId]")).getAttribute("value");
    
    if(actual_value.equals(expected_value))
    {
    	System.out.println(" valid employeeId ");
    }
    else
    {
    	System.out.println("invalid employeeID");
    }
  //  driver.quit();
  }
}
	}

   
    
