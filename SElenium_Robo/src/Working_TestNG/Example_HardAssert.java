package Working_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Class.HomePage;
import Working_DataDrivenTesting.DataUtility;

public class Example_HardAssert 
{
   @Test
   public void testCase() throws IOException
   {
	   DataUtility datautility=new DataUtility();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get(datautility.getDataFromProperties("url"));
	   //Compare the exact Title
	  // Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
	   
	   //compare the dynamic contains title
	   Assert.assertTrue(driver.getTitle().equals("Demo Web Shop"));
	   System.out.println("Home Page is displayed");
	   
	   HomePage homepage=new HomePage(driver);
	   homepage.getLoginLink().click();
	   
	   Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
	   System.out.println("Login Page is displayed");
	   
	   
//	   Assert.assertEquals(driver.getTitle(), "Demo Web Shop. L");//Assertion Error
//	   System.out.println("Login Page is displayed");
	   
	   driver.close();
	   
   }


}
