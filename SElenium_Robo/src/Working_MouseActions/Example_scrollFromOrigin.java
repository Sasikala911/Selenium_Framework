package Working_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class Example_scrollFromOrigin {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.selenium.dev/documentation/webdriver/elements/locators/");
	     Thread.sleep(3000);
	     WebElement scrollwebelement = driver.findElement(By.xpath("//nav[@id='td-section-nav']"));
	     ScrollOrigin sc = ScrollOrigin.fromElement(scrollwebelement);
	     Actions act=new Actions(driver);
	     act.scrollFromOrigin(sc, 0, 200).perform();//down
	     Thread.sleep(3000);
	     act.scrollFromOrigin(sc, 0, -200).perform();//up
	     driver.close();
	 
}
}