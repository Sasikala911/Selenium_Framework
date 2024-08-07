package WorkingwithXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_XpathByAttribute {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sasikala");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("sasikala!23");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		Thread.sleep(4000);
		String message = driver.findElement(By.xpath("//div[contains(text(),'Sorry, your password was incorrect. Please double-check your password.')]")).getText();
		System.out.println(message);
		driver.close();


		

	}

}
