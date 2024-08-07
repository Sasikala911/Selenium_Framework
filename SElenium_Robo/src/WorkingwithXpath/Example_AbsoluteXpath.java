package WorkingwithXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_AbsoluteXpath {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/4.DemoHTML.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/fieldset/div[1]/input[1]")).sendKeys("Sasikala");
		driver.findElement(By.xpath("/html/body/fieldset/div[1]/input[2]")).sendKeys("Sasikala@123");
		driver.findElement(By.xpath("/html/body/fieldset/div[1]/input[3]")).sendKeys("sasi@gmail.com");
		driver.findElement(By.xpath("/html/body/fieldset/div[2]/input[2]")).click();
		driver.findElement(By.xpath("/html/body/fieldset/div[3]/input[1]")).click();
		driver.findElement(By.xpath("/html/body/fieldset/div[3]/input[2]")).click();
		


		

	}

}
