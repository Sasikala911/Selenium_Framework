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

public class Example_myntra {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	WebElement men=driver.findElement(By.xpath("//div[@class='desktop-navLink']//a[text()='Men']"));
	Actions act=new Actions(driver);
	WebElement tshirt=driver.findElement(By.xpath("//ul[@class='desktop-navBlock']//a[@href='/men-tshirts']"));
	act.moveToElement(men).pause(3000).click(tshirt).perform();
	WebElement roadster=driver.findElement(By.xpath("//span[text()='Brand']/..//input[@value='Roadster']"));
	act.click(roadster).perform();
	Thread.sleep(3000);

	TakesScreenshot ts=(TakesScreenshot)driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File trg=new File("./Screenshot/myntra.png");
	FileHandler.copy(src, trg);
	driver.close();
	}
	}

