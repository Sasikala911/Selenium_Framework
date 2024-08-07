package Working_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_draganddropby {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement iphonme = driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		iphonme.sendKeys("Iphone");
		iphonme.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		WebElement point = driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']//div[@class='PYKUdo']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.dragAndDropBy(point, 80, 0).perform();
		
	}
}
