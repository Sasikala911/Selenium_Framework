package Task;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Name_clear {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Actions act=new Actions(driver);
        act.keyDown(Keys.NULL).sendKeys("sasikala").build().perform();
        act.keyUp(Keys.NULL).build().perform();
        Thread.sleep(2000);
//        for(int i = 0;i<=7;i++)
//        {
//        	act.keyDown(Keys.BACK_SPACE).build().perform();
//            act.keyUp(Keys.BACK_SPACE).build().perform();
//
//        }
        WebElement search = driver.findElement(By.id("APjFqb"));
        search.sendKeys(Keys.CONTROL+"a",Keys.BACK_SPACE);
        Thread.sleep(2000);
        act.keyDown(Keys.NULL).sendKeys("virat").build().perform();
        act.keyUp(Keys.NULL).build().perform();
        act.keyDown(Keys.ENTER).build().perform();
        act.keyUp(Keys.ENTER).build().perform();
        TakesScreenshot ts=(TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File tgt=new File("./Screenshot/virat.png");
		FileHandler.copy(src, tgt);
		driver.close();
        
        
}
}