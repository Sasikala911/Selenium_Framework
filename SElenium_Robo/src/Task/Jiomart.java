package Task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Jiomart {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jiomart.com/");
		Thread.sleep(2000);
		WebElement fashion = driver.findElement(By.xpath("//a[.='Fashion']"));
		Actions a=new Actions(driver);
		a.moveToElement(fashion).perform();
		Thread.sleep(2000);
		WebElement men = driver.findElement(By.xpath("//a[.='Men']"));
		Actions a1=new Actions(driver);
		a.moveToElement(men).perform();
		Thread.sleep(2000);
		WebElement footwear= driver.findElement(By.xpath("//a[.='Footwear']"));
		Actions a2=new Actions(driver);
		a.moveToElement(footwear).perform();
		footwear.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Popularity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Price: Low to High')]")).click();
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt=new File("./Screenshot/jiomart1.png");
		FileHandler.copy(src, tgt);
		driver.close();
		
		
	}

}
