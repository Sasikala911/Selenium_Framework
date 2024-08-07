package Working_MouseActions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Pause;

public class Ezxample_Contextclick {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(2000);
		WebElement rightclickbtn= driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act=new Actions(driver);
		act.contextClick(rightclickbtn).perform();
		Thread.sleep(2000);
		WebElement quit = driver.findElement(By.xpath("//span[text()='Quit']"));
		act.moveToElement(quit).pause(3000).click().perform();
		Thread.sleep(2000);
		driver.close();
	}
}
