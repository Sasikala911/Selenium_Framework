package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_ClickandHoldOn {
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	Thread.sleep(3000);
	WebElement stockholm=driver.findElement(By.id("box2"));
	WebElement sweden=driver.findElement(By.id("box102"));
	WebElement washington=driver.findElement(By.id("box3"));
	WebElement us=driver.findElement(By.id("box103"));
	WebElement seoul=driver.findElement(By.id("box5"));
	WebElement southkorea=driver.findElement(By.id("box105"));
	WebElement rome=driver.findElement(By.id("box6"));
	WebElement italy=driver.findElement(By.id("box106"));
	WebElement oslo=driver.findElement(By.id("box1"));
	WebElement norway=driver.findElement(By.id("box101"));
	WebElement copenhagen=driver.findElement(By.id("box4"));
	WebElement denmark=driver.findElement(By.id("box104"));
	WebElement madrid=driver.findElement(By.id("box7"));
	WebElement spain=driver.findElement(By.id("box107"));

	Actions act=new Actions(driver);
	act.clickAndHold(stockholm).release(sweden).perform();
	Thread.sleep(3000);
	act.clickAndHold(washington).release(us).perform();
	Thread.sleep(3000);
	act.clickAndHold(seoul).release(southkorea).perform();
	Thread.sleep(3000);
	act.clickAndHold(rome).release(italy).perform();
	Thread.sleep(3000);
	act.clickAndHold(oslo).release(norway).perform();
	Thread.sleep(3000);
	act.clickAndHold(copenhagen).release(denmark).perform();
	Thread.sleep(3000);
	act.clickAndHold(madrid).release(spain).perform();


	}
}
