package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xerces.util.SynchronizedSymbolTable;

public class Read_MultipleData {

	public static void main(String[] args) throws IOException {

FileInputStream file = new FileInputStream("./src/com/Excel/First 1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		for(int i=0; i<=rowcount;i++)
			
		{
			Row r=sheet.getRow(i);
			
			int cellcount=r.getLastCellNum();
			
			for(int j=0;j<cellcount;j++)
				
			{
				String data=r.getCell(j).getStringCellValue();
				
				System.out.println();
				
				System.out.println(data +" " );
				
			}
			
			System.out.println();
		}
		
		
	}

}
