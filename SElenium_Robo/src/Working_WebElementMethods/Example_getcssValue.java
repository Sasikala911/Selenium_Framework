package Working_WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_getcssValue {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("sasikalathangam911@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("sasi");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
         WebElement errormsg = driver.findElement(By.xpath("//div[@class='validation-summary-errors']"));
         String text = errormsg.getText();
         System.out.println(text);
         String color = errormsg.getCssValue("color");
         System.out.println(color);
         String font = errormsg.getCssValue("font");
         System.out.println(font);
         String fontsize = errormsg.getCssValue("font-size");
         System.out.println(fontsize);
         driver.close();
	}

}
