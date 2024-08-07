package Working_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_singleselectDropdown {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
	Thread.sleep(3000);
	WebElement dropdown = driver.findElement(By.id("drop1"));
	Select s=new Select(dropdown);
	s.selectByIndex(3);
	Thread.sleep(3000);
	s.selectByValue("abc");
	Thread.sleep(3000);
	s.selectByVisibleText("doc 4");
	List<WebElement> opt = s.getOptions();
	for (WebElement options : opt) {
		System.out.println(options.getText());
	}
	driver.close();
	
}
}
