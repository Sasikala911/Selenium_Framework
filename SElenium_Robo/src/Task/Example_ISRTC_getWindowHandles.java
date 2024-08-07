package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_ISRTC_getWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(3000);
		WebElement scroll = driver.findElement(By.xpath("//span[.='Get Connected with us on social networks']"));
		Actions act=new Actions(driver);
		act.scrollToElement(scroll).perform();
		act.scrollByAmount(0, 400).perform();
		Thread.sleep(3000);
		List<WebElement> link = driver.findElements(By.xpath("//div[@class='text-center hidden-xs footer-icons']//a//i"));
		for (WebElement links : link) {
			links.click();
		}
		
}
}