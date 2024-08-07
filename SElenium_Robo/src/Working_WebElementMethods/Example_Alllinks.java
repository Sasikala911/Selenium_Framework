package Working_WebElementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Alllinks {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		System.out.println("Size  :"+ alllinks.size());
		System.out.println("-------------");
		for (WebElement link : alllinks) {
			System.out.println(link.getText());
		}
		driver.close();
	
}
}