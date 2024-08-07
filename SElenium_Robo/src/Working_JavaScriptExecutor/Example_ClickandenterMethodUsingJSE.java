package Working_JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ClickandenterMethodUsingJSE {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById('Email').value='sasikala@gmail.com';");
		Thread.sleep(3000);
		js.executeScript("document.getElementsByName('Password')[0].value='sasikala';");
		Thread.sleep(3000);
		//js.executeScript("document.getElementsByClassName('button-1 login-button')[0].click();");
		WebElement loginbutton = driver.findElement(By.xpath("//input[@value='Log in']"));
		js.executeScript("arguments[0].click();",loginbutton);
		


		
		
	}		
}
