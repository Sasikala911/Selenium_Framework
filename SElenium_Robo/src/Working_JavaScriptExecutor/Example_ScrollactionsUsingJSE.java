package Working_JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_ScrollactionsUsingJSE {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.zomato.com/");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,1000);");//down
	Thread.sleep(2000);
	js.executeScript("window.scrollBy(0,-600);");//up
	driver.close();

}
}
