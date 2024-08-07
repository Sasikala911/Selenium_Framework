package Working_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_MultipleDataFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\praka\\OneDrive\\Documents\\Selenium_Robowaves\\Book1.xlsx");
	Workbook book=WorkbookFactory.create(fis);
	Sheet sh = book.getSheet("Registerdata");
	int lastrowNum = sh.getPhysicalNumberOfRows();
	System.out.println(lastrowNum);
	int lastcellNum = sh.getRow(0).getPhysicalNumberOfCells();
	System.out.println(lastcellNum);
	for(int i=0;i<lastrowNum;i++)
	{
		for(int j=0;j<lastcellNum;j++)
		{
			String value = sh.getRow(i).getCell(j).toString();
			System.out.print(value+ " ");
		}
		System.out.println();
	}
}
}
