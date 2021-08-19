package generic;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
	
	public static String getData(String path,String sheet, int row, int col)
	{
		String v=" ";
	try
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		v = wb.getSheet(sheet).getRow(row).getCell(col).getStringCellValue();
		wb.close();
	}
	catch(Exception e)
	{
		
	}
	return v;
	}

}
