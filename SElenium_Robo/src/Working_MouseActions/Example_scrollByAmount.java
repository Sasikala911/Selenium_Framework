package Working_MouseActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_scrollByAmount {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://naturalicecreams.in/");
	     Thread.sleep(5000);
	     Actions act =new Actions(driver);
	     act.scrollByAmount(0, 600).perform();//scroll down
	     Thread.sleep(5000);
	     act.scrollByAmount(0, 800).perform();//scroll down
	     Thread.sleep(5000);
	     act.scrollByAmount(0, -700).perform();//scroll up
	     driver.close();


	    
}
}