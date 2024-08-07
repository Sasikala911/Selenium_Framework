package POM_Class;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Working_DataDrivenTesting.DataUtility;


public class Example_AddtoCart {
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	 DataUtility datautil=new DataUtility();
	 //Launch the application and navigate to Test URL
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get(datautil.getDataFromProperties("url"));
	 
	 //navigate to login page
	 HomePage hp=new HomePage(driver);
	 hp.getLoginLink().click();
	 //validation
	 if(driver.getTitle().equals("Demo Web Shop. Login"))
	 {
		 
		 System.out.println("login Page displayed");
	 }
	 else
	 {
		 System.out.println("Login Pge is not displayed");
	 }
	 //Performing login
	 LoginPage lp=new LoginPage(driver);
	 lp.getEmailTextField().sendKeys(datautil.getDataFromProperties("email"));
	 lp.getPasswordTextField().sendKeys(datautil.getDataFromProperties("pwd"));
	 lp.getLoginButton().click();
	 //verify user is logged in or not
	boolean result = hp.getLogoutLink().isDisplayed();
	if(result)
	{
		System.out.println("Test Case pass");
	}
	else
	{
		System.out.println("Testcase Fail");
	}
	//Navigate to digitaldownloadsPage
	hp.getDigitalDownloadsLink().click();
	 //validation
	 if(driver.getTitle().equals("Demo Web Shop. Digital downloads"))
	 {
		 
		 System.out.println("Digital downloads Page displayed");
	 }
	 else
	 {
		 System.out.println("Digital downloads Page is not displayed");
	 }
	 //get all the products text
	 DigitalDownloadsPage dp=new DigitalDownloadsPage(driver);
	 List<WebElement> allproducttext = dp.getDigitalAllProductsLink();
	 for (WebElement allpdttext : allproducttext)
	 {
		String textallpdts = allpdttext.getText();
		allproducttext.add(allpdttext);
	}
	 //performing add to cart
	 List<WebElement> addtocartall = dp.getAddtoCartDigitalButton();
	 for (WebElement addtocartallpdt : addtocartall) {
		addtocartallpdt.click();
		Thread.sleep(2000);	}
	 //Navigate shopping cart
	 hp.getShoppingCartLink().click();
	//validation
		 if(driver.getTitle().equals("Demo Web Shop. Shopping Cart"))
		 {
			 
			 System.out.println("Shopping Cart Page displayed");
		 }
		 else
		 {
			 System.out.println("Shopping Cart Page is not displayed");
		 }
		//gettextfromall products
		 ShoppingCartPage sp=new ShoppingCartPage(driver);
		 List<WebElement> alldigitalpdt = sp.getAddtoCartDigitalText();
		 for (WebElement allpdt : alldigitalpdt) {
			String digitalpdttext = allpdt.getText();
			alldigitalpdt.add(allpdt);
		}
 
			
		 //removing the product
	
		 List<WebElement> allchk = sp.getRemoveFromCartCheckbox();
		 for (WebElement allcheckbox : allchk) {
			allcheckbox.click();
		}
		 sp.getUpdateShoppingCartButton().click();
		 //logout
		 hp.getLogoutLink();
		 driver.close();
		 
}	
}
