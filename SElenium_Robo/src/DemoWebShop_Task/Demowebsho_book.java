package DemoWebShop_Task;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Working_DataDrivenTesting.DataUtility;


public class Demowebsho_book {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		DataUtility datautil=new DataUtility();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(datautil.getDataFromProperties("url"));
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(datautil.getDataFromExcel("RegisterData", 1, 2));
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(datautil.getDataFromExcel("RegisterData", 1, 4));
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Books')]")).click();
		Thread.sleep(3000);
		WebElement fictionex = driver.findElement(By.xpath("//a[.='Fiction EX']"));
		String text = fictionex.getText();
		fictionex.click();
		Thread.sleep(3000);
		WebElement fictpage = driver.findElement(By.xpath("//h1[contains(text(),'Fiction EX')]"));
		String ficttext = fictpage.getText();
		System.out.println(ficttext);
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
