package WorkingwithXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_DependentIndependent {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://demowebshop.tricentis.com/");
      Thread.sleep(2000);
      driver.findElement(By.partialLinkText("Books")).click();
      String price = driver.findElement(By.xpath("//a[text()='Health Book']/../..//span[@class='price actual-price']")).getText();
      System.out.println(price);
      driver.quit();
	}

}
