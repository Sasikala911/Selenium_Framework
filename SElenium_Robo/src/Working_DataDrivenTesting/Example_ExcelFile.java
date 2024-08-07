package Working_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Example_ExcelFile {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\praka\\OneDrive\\Documents\\Selenium_Robowaves\\Book1.xlsx");
	//Access the Workbook
	Workbook book=WorkbookFactory.create(fis);
	//Access the Sheet
	Sheet sh = book.getSheet("Sheet1");
	//Access the Row
	Row row = sh.getRow(0);
	//Access the Cell
	Cell cell = row.getCell(0);
	//fetch String Value
	String value = cell.getStringCellValue();
	System.out.println(value);
	//fetch Numeric Value
	double value2 = sh.getRow(1).getCell(0).getNumericCellValue();
	System.out.println(value2);
	//fetch String and Numeric Value
	String value3 = sh.getRow(0).getCell(0).toString();
	System.out.println(value3);
	String value4 = sh.getRow(1).getCell(0).toString();
	System.out.println(value4);
	
}
}
