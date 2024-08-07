package Task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exmaple_promppopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name=\"cusid\"]")).sendKeys("sasikala");
		driver.findElement(By.xpath("//input[@name=\"submit\"]")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println("Alert Msg: "+alt.getText());
		alt.accept();
		System.out.println("Alert Msg: "+alt.getText());
		alt.accept();
		Thread.sleep(2000);
	}	
}
