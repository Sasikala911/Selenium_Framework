package Working_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_MovetoElement {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://naturalicecreams.in/");
	Thread.sleep(2000);
	WebElement products = driver.findElement(By.xpath("(//span[contains(text(),'Products')])[1]"));
	Actions a=new Actions(driver);
	a.moveToElement(products).perform();
	driver.close();

}
}
