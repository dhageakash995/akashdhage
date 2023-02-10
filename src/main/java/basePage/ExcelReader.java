package basePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	public  static void main(String []args) throws IOException
	{
	
	String str =	System.getProperty("user.dir");
	
	String newPath = "C:\\Users\\Dell\\eclipse-workspace\\mavenProj\\src\\test\\resources\\Book2.xlsx";
		FileInputStream fis=new FileInputStream(new File(newPath));  
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Sheet1"); 
		
		int rowNum = sheet.getLastRowNum();
		
		Row row = sheet.getRow(1);
		
		int  colNum = row.getLastCellNum();
		for(int i=1;i<=rowNum;i++)
		{
			row=sheet.getRow(i);
			
			for(int j=0;j<=colNum;j++)
			{
				System.out.println(row.getCell(j));
			}
		}
	}
}