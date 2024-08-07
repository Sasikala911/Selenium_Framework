package Working_Popup;

import java.awt.datatransfer.StringSelection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_FileUploadPopupUsingRobotClass {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://smallpdf.com/pdf-to-word");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Choose Files']")).click();
		StringSelection s=new StringSelection("C:\\Users\\praka\\Downloads\\Sasikala-T.pdf"); 
	}
}
