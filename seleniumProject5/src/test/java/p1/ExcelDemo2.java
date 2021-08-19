package p1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDemo2 {

	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException {
		String path="./data/book1.xlsx";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++)
			{
				String v = wb.getSheet("sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(v);
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
	
		wb.close();
		
	}

	}
                                                                