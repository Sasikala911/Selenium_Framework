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
import org.openqa.selenium.support.ui.Select;

public class Example_barbeque {
	public static void main(String[] args) throws InterruptedException, IOException {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.barbequenation.com/");
	     Thread.sleep(10000);
	     driver.findElement(By.id("header--todaysmenu")).click();
//	     Thread.sleep(10000);
//	     driver.findElement(By.id("restaurant-clear-all-voucher-filters")).click();
	     Thread.sleep(10000);
	     WebElement dropdown = driver.findElement(By.id("restaurant-country-filter-dropdown"));
	     dropdown.click();
	     Thread.sleep(3000);
	     Select s=new Select(dropdown);
	     s.selectByVisibleText("UAE");
	     Thread.sleep(10000);
	     WebElement hotel = driver.findElement(By.xpath("//div[@class=\"nearbyOutlets--card-image\"]//img[@alt=\"Restaurant in AL BARSHA\"]"));
	     Actions act=new Actions(driver);
	     act.moveToElement(hotel).perform();
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("//a[contains(text(),'Explore')]")).click();
	     Thread.sleep(10000);
	     WebElement loc = driver.findElement(By.xpath("//a[.='Locations']"));
	     Thread.sleep(3000);
	     act.scrollToElement(loc).perform();
	     TakesScreenshot ts=(TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			File tgt=new File("./Screenshot/gallery.png");
			FileHandler.copy(src, tgt);
	}	    
}
