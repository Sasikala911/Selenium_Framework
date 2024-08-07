package Task;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop_AddtoCart_PropertyFiles {
	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream fis=new FileInputStream("./TestData/Commondata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String url = pro.getProperty("url");
		String email = pro.getProperty("email");
		String pwd = pro.getProperty("pwd");
		//Step1: Launch the application
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		//Step2:login as user
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Digital downloads')]")).click();
		if(	driver.getTitle().equals("Demo Web Shop. Digital downloads"))
		{
		System.out.println("Navigated to Digital Downloads Page Successfully");
		}
		else
		{
		System.out.println("Navigated to Digital Downloads Page Fail");
	    }
		//Step4:Add the products to the cart
		List<WebElement> atcButtons=driver.findElements(By.xpath("//input[@value='Add to cart']"));
		List<WebElement> pts=driver.findElements(By.xpath("//div[@class='product-grid']//h2/a"));
		ArrayList<String> pdt=new ArrayList<String>();
		for(WebElement atc:atcButtons)
		{
			atc.click();
			Thread.sleep(3000);
	    }
		for(WebElement pt:pts)
		{
			String text=pt.getText();
			pdt.add(text);
		}
		Thread.sleep(3000);
		WebElement shoppingCart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
		shoppingCart.click();
		if(	driver.getTitle().equals("Demo Web Shop. Shopping Cart"))
		{
		System.out.println("Navigate to Cart Page Successful");
		}
		else
		{
		System.out.println("Navigate to Cart Page Fail");
	    }
		List<WebElement> cartProductTexts=driver.findElements(By.xpath("//a[@class='product-name']"));
		ArrayList<String> cartProduct=new ArrayList<String>();
		for(WebElement cartProductText:cartProductTexts)
		{
		    String text=cartProductText.getText();
			cartProduct.add(text);
		}
		for(int i=0;i<=cartProductTexts.size()-1;i++)
		{
			{
				if(pdt.get(i).equals(cartProduct.get(i)))
				{
					System.out.println("Product is added to Cart Successfully");
				}
				else
				{
					System.out.println("Product is not added");

				}
			}
		}
		//Step5:Remove The Product from Cart
		List<WebElement> removecart=driver.findElements(By.xpath("//input[@name='removefromcart']"));
		for(WebElement removeCartAll:removecart)
		{
			removeCartAll.click();
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//input[@name='updatecart']")).click();
		if(driver.findElement(By.xpath("//div[contains(text(),'Your Shopping Cart is empty!')]")).isDisplayed())
				{
				System.out.println("Cart is null");
				}
		else
				{
				System.out.println("Cart is present");
				}
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		if(	driver.getTitle().equals("Demo Web Shop"))
		{
		System.out.println("Logout Successful");
		}
		else
		
		System.out.println("Logout Fail");



	}


}
