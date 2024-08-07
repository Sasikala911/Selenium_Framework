package Working_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Exmaple_WritebackDataInExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\praka\\OneDrive\\Documents\\Selenium_Robowaves\\Book1.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh= book.createSheet("writeDatas");
		//Sheet sh= book.getSheet("writeDatas");//once we created sheet then we want to add datas we use getsheet
		sh.createRow(0).createCell(0).setCellValue("sumanth");
		sh.createRow(1).createCell(0).setCellValue("prakash");
		sh.createRow(2).createCell(0).setCellValue("prakash2");

		FileOutputStream fos=new FileOutputStream("C:\\Users\\praka\\OneDrive\\Documents\\Selenium_Robowaves\\Book1.xlsx");
		book.write(fos);
		fos.flush();
		System.out.println("Done");
		

		

		
		

}
}