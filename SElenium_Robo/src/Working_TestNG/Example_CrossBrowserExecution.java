package Working_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Example_CrossBrowserExecution 
{
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void testCase(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if (browser.equals("edge")) 
		{
			driver=new EdgeDriver();
		}
		else if (browser.equals("firefox")) 
		{
			driver=new FirefoxDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.meesho.com/");
		System.out.println(browser +" : "+driver.getTitle());
		driver.close();
	}

}
