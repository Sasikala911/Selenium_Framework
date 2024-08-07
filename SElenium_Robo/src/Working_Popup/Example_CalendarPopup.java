package Working_Popup;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_CalendarPopup {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		driver.findElement(By.id("datepicker")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@class,'ui-state-highlight')]")).click();
		driver.close();;
	}
}
