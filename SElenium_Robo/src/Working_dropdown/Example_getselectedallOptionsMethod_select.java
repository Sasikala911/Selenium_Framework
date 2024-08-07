package Working_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Example_getselectedallOptionsMethod_select {
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
	      List<WebElement> allselectedoptions = s.getAllSelectedOptions();
	      for (WebElement allopt : allselectedoptions) {
			System.out.println(allopt.getText());
		}
	     System.out.println("Firest Selected :"+ s.getFirstSelectedOption().getText());
	     driver.close();
}
}