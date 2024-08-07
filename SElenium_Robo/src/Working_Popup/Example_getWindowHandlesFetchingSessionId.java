package Working_Popup;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_getWindowHandlesFetchingSessionId {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(3000);
	String mainPageId = driver.getWindowHandle();
	System.out.println("Main Id: "+mainPageId);
	System.out.println("Title of the Main Page  :"+driver.getTitle());
	driver.findElement(By.partialLinkText("Facebook")).click();
	Thread.sleep(3000);
	Set<String> allSessionId = driver.getWindowHandles();
	for (String allId : allSessionId) {
		driver.switchTo().window(allId);
		System.out.println(allId);
		System.out.println(driver.getTitle());
	}
	
	
}
}
