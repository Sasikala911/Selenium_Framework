package Task;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebshop_Login_usingPropertiesfiles {
	public static void main(String[] args) throws IOException {
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
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();

		String title = "Demo Web Shop";

		if(title.equals(driver.getTitle()))
		{
			System.out.println("Login Successfull");
		}
		else
			System.out.println("Login Fails");
		
         driver.close();
	}
		
	}

