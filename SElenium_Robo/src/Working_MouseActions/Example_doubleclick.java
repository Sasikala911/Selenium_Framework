package Working_MouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_doubleclick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement doubleclick = driver.findElement(By.xpath("//button[.='Double-Click Me To See Alert']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.doubleClick(doubleclick).perform();
		Alert popup = driver.switchTo().alert();
		Thread.sleep(2000);
		popup.accept();
		driver.close();
		
    
	}

}
