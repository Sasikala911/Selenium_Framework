package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebSHop_XpathRegister {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		driver.findElement(By.xpath("//label[@class='forcheckbox']")).click();
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("sasi");
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Kala");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sasikalathang@gmail.com");
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys("sasi@123");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("sasi@123");
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/registerresult/1"))
		{
			System.out.println("Register succesful");
		}
		else
			System.out.println("Register Fails");
		driver.close();
        
	}
}
