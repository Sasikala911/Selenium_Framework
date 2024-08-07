package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Iphone {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement iphonme = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		iphonme.sendKeys("Iphone");
		iphonme.sendKeys(Keys.ENTER);
		String title = driver.getTitle();
		if(title.equals(driver.getTitle()))
		{
			System.out.println("Iphone displayed");
		}
		else
		{
			
			System.out.println("Iphone is not displayed");
		}
		driver.close();
		//driver.findElement(By.xpath("//svg[.='Search Icon']")).click();
}
}