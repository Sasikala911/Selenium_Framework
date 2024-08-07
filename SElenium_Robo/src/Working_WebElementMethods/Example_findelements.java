package Working_WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_findelements {
            public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
			Thread.sleep(2000);
			List<WebElement> allradiobuttons = driver.findElements(By.xpath("//li[@class='answer']//input"));
			for (WebElement radiobutton : allradiobuttons) 
			{
				radiobutton.click();
				Thread.sleep(3000);
			}
			driver.close();
            }
}

