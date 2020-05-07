package ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_Operation {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream("./src/com/Excel/First.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("sheet2");
		
		Row r=sheet.createRow(2);
		
		Cell c=r.createCell(4);
		
		c.setCellValue("Hiru");
		
		FileOutputStream file1=new FileOutputStream("./src/com/Excel/First.xlsx");
		
		workbook.write(file1);
		
	}
}
