package Working_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Example_DependsonMethods 
{
	   @Test
	   public void register() 
	   {
		   System.out.println("Registration Done");
		   Assert.fail();//intentionaly failed Testcases we use Assert.fail
		 
	   }
	  
	  @Test(dependsOnMethods = "register")
	  public void login() 
	  {
		   System.out.println("Login Done");
	  }
}
