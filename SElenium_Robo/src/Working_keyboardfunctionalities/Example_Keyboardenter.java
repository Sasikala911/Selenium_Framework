package Working_keyboardfunctionalities;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Keyboardenter {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement iphonme = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		iphonme.sendKeys("Iphone",Keys.ENTER);
		//iphonme.sendKeys(Keys.ENTER);
		driver.close();
}
}