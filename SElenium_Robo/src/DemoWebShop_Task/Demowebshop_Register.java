package DemoWebShop_Task;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Working_DataDrivenTesting.DataUtility;


public class Demowebshop_Register {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		DataUtility datautil=new DataUtility();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(datautil.getDataFromProperties("url"));
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys(datautil.getDataFromExcel("RegisterData", 1, 0));
		driver.findElement(By.id("LastName")).sendKeys(datautil.getDataFromExcel("RegisterData", 1, 1));
		driver.findElement(By.id("Email")).sendKeys(datautil.getDataFromExcel("RegisterData", 1, 2));
		driver.findElement(By.id("Password")).sendKeys(datautil.getDataFromExcel("RegisterData", 1, 3));
		driver.findElement(By.id("ConfirmPassword")).sendKeys(datautil.getDataFromExcel("RegisterData", 1, 4));
		driver.findElement(By.name("register-button")).click();
		if(driver.findElement(By.className("result")).isDisplayed())
		{
			System.out.println("Register succesful");
		}
		else
			System.out.println("Register Fails");
		
         driver.close();
	}

}
