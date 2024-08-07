package WorkingwithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Idlocator {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	//Locate the webelement using id locator
	WebElement email = driver.findElement(By.id("email"));
	//to pass the value of the element
	email.sendKeys("sasi@gmail.com");
	WebElement pwd = driver.findElement(By.id("pass"));
	//to pass the value of the element
	pwd.sendKeys("sasi@123");
}
}
