package Working_TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Example_DataProviders 
{
     @Test(dataProvider = "LoginData")
     public void testCadr(String email,String password ) throws InterruptedException
     {
    	 WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.get("https://demowebshop.tricentis.com/login");
 		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
 		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(password);
 		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
 		Thread.sleep(2000);
 		driver.close();
 		

     }
	
	@DataProvider(name="LoginData")
	public Object [][] dataSupply()
	{
		Object [][] arr=new Object[3][2];
		
		arr[0][0]="Admin1@gmail.com";
		arr[0][1]="Password1";
		
		arr[1][0]="Admin2@gmail.com";
		arr[1][1]="Password2";
		
		arr[2][0]="Admin3@gmail.com";
		arr[2][1]="Password3";
		
		return arr;
		
		
	}
}
