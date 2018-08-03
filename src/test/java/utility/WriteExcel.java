package utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import generic.AutoConstant;

public class WriteExcel implements AutoConstant {
	public static void writeInExcel(String PATH, String sheet, int row, int column, String data) throws Exception
	{
		FileInputStream file=new FileInputStream(PATH);
		Workbook wb= WorkbookFactory.create(file);
		Cell c = wb.getSheet(sheet).createRow(row).createCell(column);
		c.setCellValue(data);
		
		FileOutputStream fos = new FileOutputStream(PATH);
		wb.write(fos);
		
		wb.close();
		fos.close();
	}

}
