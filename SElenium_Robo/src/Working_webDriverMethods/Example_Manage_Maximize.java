package Working_webDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_Manage_Maximize {

	public static void main(String[] args) throws InterruptedException {
    WebDriver driver=new ChromeDriver();
    
    //To Maximize
    driver.manage().window().maximize();
    driver.get("https://skillrary.com/");
    Thread.sleep(2000);
    
    //To Minimize
    driver.manage().window().minimize();
    Thread.sleep(2000);
    
    //Fullscreen
    driver.manage().window().fullscreen();
    Thread.sleep(2000);
    
    
    driver.close();
	}

}
