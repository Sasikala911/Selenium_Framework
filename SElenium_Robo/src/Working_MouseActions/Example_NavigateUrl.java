package Working_MouseActions;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_NavigateUrl {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	    // driver.navigate().to("https://www.selenium.dev/");
	     URL url=new URL("https://www.selenium.dev/");
	     driver.navigate().to(url);
	     Thread.sleep(3000);
	     System.out.println(driver.getTitle());
	     driver.close();
	}
}
