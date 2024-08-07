package Working_synchronisation;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Example_implicitWait {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/products_page/23");
		String producttitle = driver.findElement(By.xpath("//h2[.='roadster']")).getText();
		System.out.println("producttitle  :"+ producttitle);
		driver.findElement(By.id("Check Delivery")).sendKeys("560086");
		//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Check"))));
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofSeconds(1));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("Check"))));
		
	    driver.findElement(By.id("Check")).click();
	    String result = driver.findElement(By.id("Check Delivery-helper-text")).getText();
	    System.out.println(result);driver.close();
		
	}	
}
