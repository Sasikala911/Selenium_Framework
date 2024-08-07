package TestScripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Working_TestNG.BaseTest;

public class DigitalDownloadsTestCase extends BaseTest
{
	 @Test(groups = "smoke")
	  public void verify_User_Is_Navigate_DigitalDownloads() 
	  {
		 homePage.getDigitalDownloadsLink().click();
	  
		  //validation
		  Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Digital downloads");
		  Reporter.log("verify_User_Is_Navigate_DigitalDownloads is displayed",true);
		 
	  }		
}
