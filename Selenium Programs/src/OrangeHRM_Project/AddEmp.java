package OrangeHRM_Project;

import java.io.FileInputStream;
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


		public class AddEmp 
		{
			
			public void Login() throws InterruptedException, IOException
			{
			 System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
				    WebDriver driver=null;
				    
				    String url="http://127.0.0.1/orangehrm-4.0/symfony/web/index.php/auth/login";
				    driver =new FirefoxDriver();
				   
				    driver.get(url);
				    
				    driver.manage().window().maximize();
				    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\Desktop\\Javascripts\\TestNG\\Excelfile\\AddMultiData.xlsx");
				XSSFWorkbook WorkBook = new XSSFWorkbook(file);
				XSSFSheet sheet = WorkBook.getSheet("Sheet1");
				
				int rowcount=sheet.getLastRowNum();
				for(int i=1;i<=rowcount ; i++)
				{
					Row row=sheet.getRow(i);
					int cellcount=row.getLastCellNum();
					
				driver.findElement(By.id("txtUsername")).sendKeys(row.getCell(0).getStringCellValue());
				driver.findElement(By.id("txtPassword")).sendKeys(row.getCell(1).getStringCellValue());
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
				
				WebElement PIM=driver.findElement(By.id("menu_pim_viewPimModule"));//menu_pim_viewPimModule
				
				Actions act = new Actions(driver) ;
				act.moveToElement(PIM).perform();
				//Thread.sleep(10000);
				
				driver.findElement(By.id("menu_pim_addEmployee")).click();
				Thread.sleep(10000);
				
				String Expected_AddTitle ="Add Employee";
		        System.out.println("The Expected AddEmployee TitlePage is:"+Expected_AddTitle);

				String actual_addTitle=driver.findElement(By.linkText("Add Employee")).getText();
				System.out.println("The actual title of AddEmployee TitlePage:"+actual_addTitle);
				if(actual_addTitle.equalsIgnoreCase(Expected_AddTitle)) 
				{
				System.out.println("Matched -PASSED");
				}
				else
				{
					System.out.println("NotMatched-FAILED");
				}
				
				driver.findElement(By.id("firstName")).sendKeys("indraja");
				driver.findElement(By.id("lastName")).sendKeys("jaladanki");
			
				
				
		        String Expected_Empid = driver.findElement(By.id("employeeId")).getAttribute("value") ;

		        System.out.println("The Expected FirstName is:"+Expected_Empid);
		        Thread.sleep(10000);

		        System.out.println("****************Profile Image ***************");

		     //   WebElement browse=driver.findElement(By.name("photofile"));
		       // browse.click();

		        driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\Lenovo\\Desktop\\orange.png");

		        java.lang.Runtime.getRuntime().exec("./autoITScripts/profileImageUpload.exe");

		        Thread.sleep(5000);

		       driver.findElement(By.id("btnSave")).click();

		       String actual_empid=driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
		       System.out.println("The actual FirstName:"+actual_empid);

		       if(actual_empid.equals(Expected_Empid))
		       {
			   System.out.println("Matched Empid - PASS");
			
		       }
		       else
		       {
			   System.out.println(" NotMatched Empid-FAIL");
		       }
			
		       driver.findElement(By.id("welcome")).click();
		       driver.findElement(By.linkText("Logout")).click();	
		
				}
			}
		}
		
