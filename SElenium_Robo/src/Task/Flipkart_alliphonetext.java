package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_alliphonetext {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement iphonme = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		iphonme.sendKeys("Iphone");
		iphonme.sendKeys(Keys.ENTER);
		List<WebElement> alltext = driver.findElements(By.xpath("//div[@class='col col-7-12']/div[@class='KzDlHZ']"));
		System.out.println(alltext.size());
		for (WebElement all : alltext) {
			System.out.println(all.getText());
		}
		driver.close();
	}
}
