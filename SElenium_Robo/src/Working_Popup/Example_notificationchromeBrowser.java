package Working_Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Example_notificationchromeBrowser {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications");
	opt.addArguments("--headless");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();
	driver.get("https://www.barbequenation.com/");
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	driver.close();
}
}
