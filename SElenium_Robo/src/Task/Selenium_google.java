package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenium_google {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Actions act=new Actions(driver);
        act.keyDown(Keys.NULL).sendKeys("Selenium").build().perform();
        act.keyUp(Keys.NULL).build().perform();
        Thread.sleep(2000);
        for(int i = 0;i<=3;i++)
        {
        	act.keyDown(Keys.ARROW_DOWN).build().perform();
            act.keyUp(Keys.ARROW_DOWN).build().perform();

        }
        act.keyDown(Keys.ENTER).build().perform();
        act.keyUp(Keys.ENTER).build().perform();
         driver.close();
        }
	}


