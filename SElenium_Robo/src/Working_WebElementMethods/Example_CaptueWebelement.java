package Working_WebElementMethods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Example_CaptueWebelement {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	WebElement logo = driver.findElement(By.xpath("//img[@title='Flipkart']"));
	File src=logo.getScreenshotAs(OutputType.FILE);
	File tgt=new File("./Screenshot/flipkartlogo.png");
	FileHandler.copy(src, tgt);
	driver.close();
}
}
