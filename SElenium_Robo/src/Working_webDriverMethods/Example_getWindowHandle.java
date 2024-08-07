package Working_webDriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_getWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/Multiple%20Windows.html");
		Thread.sleep(3000);
		System.out.println("Title :"+driver.getTitle());
		//To fetch the Session Id of the main tab
		String sessionId=driver.getWindowHandle();
		System.out.println("Session id of the main tab  :"+sessionId);
		
		driver.findElement(By.id("open-windows-button")).click();
		Thread.sleep(3000);
		//To fetch the Session Id of the all Opened tabs
		Set<String> allsessionid = driver.getWindowHandles();
		System.out.println("Size   :"+allsessionid.size());
			System.out.println(allsessionid);
		
		driver.quit();

	}

}
