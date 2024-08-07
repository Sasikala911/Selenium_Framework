package Working_webDriverMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_quitMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/Multiple%20Windows.html");
	Thread.sleep(3000);
	driver.findElement(By.id("open-windows-button")).click();
	Thread.sleep(3000);
	//driver.close();
	driver.quit();
}
}
