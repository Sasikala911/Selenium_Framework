package Working_webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Navigate {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://app.fireflink.com/");
	Thread.sleep(3000);
	driver.get("https://www.zomato.com");
	driver.navigate().back();
	Thread.sleep(3000);
	System.out.println("Fireflink Title :"+driver.getTitle());
	driver.navigate().forward();
	Thread.sleep(3000);
	System.out.println("Zomato Title :"+driver.getTitle());
	driver.navigate().refresh();
	Thread.sleep(3000);

	driver.close();


}
}
