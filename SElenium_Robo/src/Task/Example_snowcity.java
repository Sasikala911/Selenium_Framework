package Task;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example_snowcity 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://snowcityblr.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"flex-col hide-for-medium flex-right\"]//a[@href=\"https://snowcityblr.com/contact-us/\"]")).click();
		Thread.sleep(8000);
        driver.switchTo().frame(0);
    	driver.findElement(By.xpath("//div[text()='Directions']")).click();
    	Thread.sleep(3000);
    	System.out.println("Title: "+driver.getTitle());
    	Thread.sleep(3000);	
    	Set<String> allwh = driver.getWindowHandles();
    	for (String all : allwh) {
			driver.switchTo().window(all);
		}
    	driver.findElement(By.xpath("//input[@placeholder='Choose starting point, or click on the map...']")).sendKeys("Banashankari");
    	
    	TakesScreenshot ts=(TakesScreenshot)driver;
    	File src=ts.getScreenshotAs(OutputType.FILE);
    	File trg= new File("./Screenshot/snowcity.png");
    	FileHandler.copy(src, trg);

    }
		

}
