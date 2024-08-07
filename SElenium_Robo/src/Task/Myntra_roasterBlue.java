package Task;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra_roasterBlue {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		WebElement men = driver.findElement(By.xpath("//a[.='Men']"));
		Actions act=new Actions(driver);
		act.moveToElement(men).perform();
		WebElement tshirt = driver.findElement(By.xpath("//a[.='T-Shirts']"));
		act.moveToElement(tshirt).click().perform();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.xpath("//span[text()='Categories']/..//label[text()='Tshirts']")).click();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Brand']/..//label[text()='Roadster']"))));
		driver.findElement(By.xpath("//span[text()='Brand']/..//label[text()='Roadster']")).click();
		//WebElement scroll = driver.findElement(By.xpath("//span[.='Discount Range']"));
		//act.scrollToElement(scroll).perform();
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//span[text()='Color']/..//label[text()='Black']"))));
		driver.findElement(By.xpath("//span[text()='Color']/..//label[text()='Black']")).click();
		WebElement sort = driver.findElement(By.xpath("//span[.='Recommended']"));
		act.moveToElement(sort).perform();
		driver.findElement(By.xpath("//label[contains(text(),'Price: Low to High')]")).click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/myntra.png");
        FileHandler.copy(src, trg)	;	
        driver.close();



		

	}	
}
