package WorkingwithXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_XpathbyForwardtrasversing {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Books')]")).click();
		if(driver.getCurrentUrl().equals("https://demowebshop.tricentis.com/books"))
		{
			System.out.println("Pass");
		}
		else
			System.out.println("Fail");
		driver.close();

	}

}
