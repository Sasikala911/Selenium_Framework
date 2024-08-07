package Task;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_register_propertyfiles {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./TestData/Commondata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String url = pro.getProperty("url");
		String email = pro.getProperty("email");
		String pwd = pro.getProperty("pwd");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("sasi");
		driver.findElement(By.id("LastName")).sendKeys("Kala");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.id("ConfirmPassword")).sendKeys("sasi@123");
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
