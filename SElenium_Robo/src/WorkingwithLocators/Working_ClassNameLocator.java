package WorkingwithLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Working_ClassNameLocator {

	public static void main(String[] args) {
		String ExpectHomepagetitle = "Demo Web Shop";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		String actualHomepagetitle = driver.getTitle();
		if(actualHomepagetitle.equals(ExpectHomepagetitle))
		{
			System.out.println("Navigate to Demo Web page");
		}
		else
			System.out.println("Navigation Fails");
		driver.findElement(By.className("ico-login")).click();
		if(driver.getCurrentUrl().contains("login"))
		{
			System.out.println("Navigate to login page");
		}
		else
			System.out.println("Navigation Fails");

         driver.close();
	}

}
