package Working_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_scrollToElement {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.zomato.com/");
	     Thread.sleep(5000);
	     WebElement getzomato = driver.findElement(By.xpath("//h2[text()='Get the Zomato app']"));
	     Actions act =new Actions(driver);
	     act.scrollToElement(getzomato).perform();
	     Thread.sleep(3000);
	     WebElement investor = driver.findElement(By.xpath("//a[text()='Investor Relations']"));
	     act.scrollToElement(investor).perform();
	     driver.close();
}

}