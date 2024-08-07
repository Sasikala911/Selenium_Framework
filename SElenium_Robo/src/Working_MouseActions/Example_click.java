package Working_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_click {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.iplt20.com/");
		Thread.sleep(2000);
		WebElement videos = driver.findElement(By.xpath("//div[@class='align-items-center']//a[@data-element_text='VIDEOS']"));
		Actions a=new Actions(driver);
		Thread.sleep(2000);
		a.moveToElement(videos).perform();
		WebElement magicmoments = driver.findElement(By.xpath("//ul[@class='dropdown arrow-top']//a[@data-element_text='MAGIC MOMENTS']"));
		a.moveToElement(magicmoments).click().perform();
		driver.close();
}
}