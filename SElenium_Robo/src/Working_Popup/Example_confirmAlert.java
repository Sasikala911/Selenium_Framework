package Working_Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_confirmAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println("Alert Msg: "+alt.getText());
		alt.dismiss();
		Thread.sleep(2000);
		String resultmsg = driver.findElement(By.id("result")).getText();
		Thread.sleep(2000);
		System.out.println("Result msg:"+resultmsg);
		driver.close();
	}	
}
