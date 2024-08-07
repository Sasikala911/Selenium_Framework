package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_XpathLogin {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sasikalathangam911@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("sasi@123");
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
