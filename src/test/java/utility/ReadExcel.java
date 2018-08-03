package utility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

import generic.AutoConstant;

public class ReadExcel implements AutoConstant {
	public static String getCellValue(String PATH,String sheet, int row, int column)
	{
		String v="";
		try 
		{
			FileInputStream file = new FileInputStream(PATH);
			Workbook wb= WorkbookFactory.create(file);
			 Cell c = wb.getSheet(sheet).getRow(row).getCell(column);
			 v= c.getStringCellValue();
			
		}
		catch(Exception e)
		{
			Reporter.log("something is wrong", true);
		}
		
		return v;
	}
}