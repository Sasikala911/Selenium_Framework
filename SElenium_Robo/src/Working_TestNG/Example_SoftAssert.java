package Working_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM_Class.HomePage;
import Working_DataDrivenTesting.DataUtility;

public class Example_SoftAssert {
	@Test
	   public void testCase() throws IOException
	   {
	   SoftAssert sa=new SoftAssert();
       DataUtility datautility=new DataUtility();
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get(datautility.getDataFromProperties("url"));
	   
	   sa.assertEquals(driver.getTitle(), "Demo Web Shop");
	   //System.out.println("Home Page is displayed");
	   Reporter.log("Home Page is displayed",true);
	   
	   HomePage homepage=new HomePage(driver);
	   homepage.getLoginLink().click();
	   
	   sa.assertEquals(driver.getTitle(), "Demo Web Shop. Login");
	   System.out.println("Login Page is displayed");
	   
	   driver.close();
	   sa.assertAll();// we didn't use assertAll Method if testcase is failed also it will show passed   
}
}