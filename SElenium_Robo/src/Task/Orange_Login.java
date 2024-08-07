package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orange_Login {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
     Thread.sleep(4000);
     driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
     driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
     driver.findElement(By.xpath("//button[@type='submit']")).submit();
     if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index"))
     {
    	 System.out.println("Login Succesful");
     }
     else
     {
    	 System.out.println("Login Fails");
     }
     Thread.sleep(4000);
     driver.findElement(By.xpath("//p[text()='manda user']")).click();
     Thread.sleep(4000);
     driver.findElement(By.xpath("//a[text()='Logout']")).click();
     Thread.sleep(4000);
     if(driver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"))
     {
    	 System.out.println("Logout successful");
     }
     else
     {
    	 System.out.println("Logout Fails");
     }
     driver.close();
	}

}
