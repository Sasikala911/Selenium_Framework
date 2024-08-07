package Task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Via_dropdown1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.via.com/");
		Thread.sleep(20000);
		driver.findElement(By.xpath("//input[@id=\"source\"]")).click();
		//driver.findElement(By.xpath("//button[.='No thanks!']")).click();
		//Alert popup = driver.switchTo().alert();
		//popup.dismiss();
		WebElement cruise = driver.findElement(By.xpath("//span[.='Cruise ']"));
		cruise.click();
		Thread.sleep(10000);
		WebElement destination = driver.findElement(By.id("hotelsCheckIn"));
		Select s=new Select(destination);
		s.selectByVisibleText("Amsterdam");
		Thread.sleep(2000);
		WebElement days = driver.findElement(By.id("operator"));
		Select s1=new Select(days);
		s1.selectByVisibleText("7 To 9 night(s)");
		Thread.sleep(2000);
		WebElement cruiselines = driver.findElement(By.id("cruiselines"));
		Select s2=new Select(cruiselines);
		s2.selectByValue("2: Object");
		Thread.sleep(2000);
		WebElement dates = driver.findElement(By.xpath("//select[@name='sailDate']"));
		Select s3=new Select(dates);
		//s3.selectByIndex(1);
		s3.selectByValue("5: Object");
		//s3.selectByVisibleText("Oct-2024");
		Thread.sleep(2000);
		WebElement travelers = driver.findElement(By.id("flightTravellersClass"));
		//Select s4=new Select(travelers);
		//s4.selectByIndex(0);
		travelers.click();
		driver.findElement(By.xpath("//input[@id='adultInput']/..//button[text()='+']")).click();
		driver.findElement(By.xpath("//button[text()='Done']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Search Cruise']")).click();
		Thread.sleep(20000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt=new File("./Screenshot/cruise.png");
		FileHandler.copy(src, tgt);
		driver.close();
		
		
}
}