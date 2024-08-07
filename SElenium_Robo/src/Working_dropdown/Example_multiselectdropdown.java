package Working_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_multiselectdropdown {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/Notification%20and%20DropDowns.html");
      WebElement dropdown = driver.findElement(By.id("multiSelect"));
      Select s=new Select(dropdown);
      s.selectByIndex(8);
      s.selectByValue("Jeep");
      s.selectByVisibleText("Mercedes-Benz");
      Thread.sleep(3000);
      s.deselectByIndex(7);
      Thread.sleep(3000);
      s.deselectByValue("Mercedes");
      Thread.sleep(3000);
      s.deselectByVisibleText("Hyundai");
      Thread.sleep(3000);
      s.deselectAll();
      Thread.sleep(3000);
      driver.close();
      
      }

}
