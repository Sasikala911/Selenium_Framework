package Working_Popup;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.xml.crypto.Data;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_calendderPopupUsingJAva {
public static void main(String[] args) throws InterruptedException {
	Calendar cal=Calendar.getInstance();
	cal.add(Calendar.DAY_OF_MONTH, -1);
	//cal.add(Calendar.DAY_OF_YEAR, 1);
	//cal.add(Calendar.MONTH, 1);
	Date date=cal.getTime();
	SimpleDateFormat format=new SimpleDateFormat("MM/dd/yyyy");
	String modate=format.format(date);
	//System.out.println(modate);
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("datepicker")).sendKeys(modate,Keys.ESCAPE);
		
}
}
