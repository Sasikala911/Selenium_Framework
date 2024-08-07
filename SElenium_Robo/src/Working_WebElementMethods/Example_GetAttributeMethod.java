package Working_WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_GetAttributeMethod {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver =new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://sso.godaddy.com/");
	     Thread.sleep(2000);
	     WebElement username = driver.findElement(By.id("username"));
	     username.sendKeys("sasikala");
	     Thread.sleep(2000);
	     String value = username.getAttribute("value");
	     System.out.println(value);
	     
}
}