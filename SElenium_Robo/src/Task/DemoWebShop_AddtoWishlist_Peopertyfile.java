package Task;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_AddtoWishlist_Peopertyfile {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./TestData/Commondata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String url = pro.getProperty("url");
		String email = pro.getProperty("email");
		String pwd = pro.getProperty("pwd");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Books')]")).click();
		Thread.sleep(3000);
		WebElement fictionex = driver.findElement(By.xpath("//a[.='Fiction EX']"));
		fictionex.click();
		Thread.sleep(3000);
		WebElement fictpage = driver.findElement(By.xpath("//h1[contains(text(),'Fiction EX')]"));
		String ficttext = fictpage.getText();
		driver.findElement(By.xpath("//input[@value='Add to wishlist']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[.='Wishlist']")).click();
		Thread.sleep(3000);
		WebElement fictextwish = driver.findElement(By.xpath("//a[.='Fiction EX']"));
		String ficttextwish = fictextwish.getText();
		if(ficttext.equals(ficttextwish))
		{
			System.out.println("Fiction EX book present in wishlist");
		}
		else
			System.out.println("not present");
		driver.close();
	}
}
