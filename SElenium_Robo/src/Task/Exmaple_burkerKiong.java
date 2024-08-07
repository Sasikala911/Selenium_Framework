package Task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exmaple_burkerKiong {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.burgerking.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[.='Cart']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println("Alert Msg: "+alt.getText());
		alt.accept();
		driver.close();
	}		
}
