package Working_MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_moveByOffset {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://naturalicecreams.in/");
     Thread.sleep(5000);
     WebElement products = driver.findElement(By.xpath("//ul[@id='menu-1438250855']//span[contains(text(),'Products')]"));
     Point location = products.getLocation();
     System.out.println("X :"+ location.getX());
     System.out.println("y :"+ location.getY());
     Actions act=new Actions(driver);
     act.moveByOffset(location.getX(), location.getY()).perform();
     driver.close();

     
	}

}
