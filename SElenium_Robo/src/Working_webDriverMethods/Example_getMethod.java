package Working_webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_getMethod {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	//Navigate to URL
	driver.get("https://www.zomato.com");
	//To Fetch to Title
    String title = driver.getTitle();
	System.out.println(title);
	//To Fetch the URL
	String url = driver.getCurrentUrl();
	System.out.println(url);
	//Fetch the Source Code
	String src = driver.getPageSource();
	System.out.println(src);
	//To close the Browser
	driver.close();
	
}
}
