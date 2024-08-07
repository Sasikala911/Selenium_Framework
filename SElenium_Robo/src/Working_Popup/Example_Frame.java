package Working_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_Frame {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dream11.com/");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Actions act=new Actions(driver);
		act.scrollByAmount(0, 400).perform();
		//by webelement
//		WebElement frameElement = driver.findElement(By.xpath("//iframe[@id=\"send-sms-iframe\"]"));
//		driver.switchTo().frame(frameElement);//by webelement
		//by index
//		driver.switchTo().frame(0);
		//by id
		driver.switchTo().frame("send-sms-iframe");
		driver.findElement(By.id("regEmail")).sendKeys("7708422805");
		act.scrollByAmount(0, -400).perform();
		//switch control from frame to immediate nested frame
		//driver.switchTo().parentFrame();
		//switch control from frame to default nested frame
		driver.switchTo().defaultContent();
		driver.findElement(By.id("hamburger")).click();
	}
}
