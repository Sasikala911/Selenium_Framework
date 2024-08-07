package Working_Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_multipleWindowHandles {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/Multiple%20Windows.html");
	Thread.sleep(3000);
	driver.findElement(By.id("open-windows-button")).click();
	Set<String> allSessionId = driver.getWindowHandles();
	Thread.sleep(3000);
	for (String allId : allSessionId) {
		driver.switchTo().window(allId);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println("------------------");
		Thread.sleep(3000);
	}
	
}
}
