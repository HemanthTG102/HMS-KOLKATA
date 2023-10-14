package generic_scripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
	public static String fetchData(int r,int c,String p) throws Exception
	{
		FileInputStream fis=new FileInputStream(p);
		
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		Row row = sheet.getRow(r);
		
		Cell cell = row.getCell(c);
		
		String data = cell.toString();
		
		return data;
	}
}
