package WorkingwithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_CssSelector {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
//		WebElement search = driver.findElement(By.cssSelector("[class='search-box-text ui-autocomplete-input']"));
//         search.sendKeys("Helooooo");
//         Thread.sleep(3000);
//         search.clear();
//         Thread.sleep(3000);
//         driver.findElement(By.cssSelector("input[value='Search store']")).sendKeys("Goooddd");
		 WebElement dot = driver.findElement(By.cssSelector("#small-searchterms"));
	      dot.sendKeys("Morninggggg");
	      Thread.sleep(3000);
	      dot.clear();
	      Thread.sleep(3000);
	      driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("Eveninggg");
	      
	}

}
