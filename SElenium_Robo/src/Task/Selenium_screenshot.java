package Task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Selenium_screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.selenium.dev/");
	     Thread.sleep(3000);
	     WebElement downlo = driver.findElement(By.xpath("//span[.='Downloads']"));
	     downlo.click();
	     Thread.sleep(3000);
	     WebElement scr = driver.findElement(By.xpath("//h2[.='Maven Information']"));
	     Actions act=new Actions(driver);
	     act.scrollToElement(scr).perform();
	     driver.findElement(By.xpath("//a[.='releases']")).click();
	     Thread.sleep(3000);
	     TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File tgt=new File("./Screenshot/release.png");
			FileHandler.copy(src, tgt);
			
	}	   
}
