package Working_WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ClearMethod {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver =new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demo.vtiger.com/vtigercrm/index.php");
     Thread.sleep(2000);
     WebElement dog = driver.findElement(By.id("username"));
     Thread.sleep(2000);
     dog.clear();
     Thread.sleep(2000);
     dog.sendKeys("Sasikala");
     driver.quit();
	}

}
