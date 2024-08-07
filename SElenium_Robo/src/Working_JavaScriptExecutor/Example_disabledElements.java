package Working_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_disabledElements {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/AllExamples.html");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement disabledtextfield = driver.findElement(By.xpath("//input[@placeholder='Disabled Text Feild']"));
		js.executeScript("arguments[0].value='selenium1234';", disabledtextfield);
		
		
	}
}
