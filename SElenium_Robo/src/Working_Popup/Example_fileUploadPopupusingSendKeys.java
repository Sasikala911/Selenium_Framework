package Working_Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_fileUploadPopupusingSendKeys {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531");
	Thread.sleep(3000);
	WebElement scrol = driver.findElement(By.xpath("//button[.='Register now']"));
	Actions act=new Actions(driver);
	act.scrollToElement(scrol).perform();
	driver.findElement(By.xpath("//p[.='  I have work experience (excluding internships)']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type=\"file\"]")).sendKeys("C:\\Users\\praka\\Downloads\\Sasikala-T.pdf");
	
}
}