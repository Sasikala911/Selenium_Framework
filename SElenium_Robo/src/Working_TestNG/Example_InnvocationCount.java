package Working_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Example_InnvocationCount 
{  
	@Test(invocationCount = 3)
   public void testCase() throws InterruptedException 
   {
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.google.com");
	   Thread.sleep(3000);
	   System.out.println(driver.getTitle());
	   driver.quit();
   }
}
