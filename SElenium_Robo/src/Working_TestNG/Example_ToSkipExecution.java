package Working_TestNG;

import org.testng.annotations.Test;

public class Example_ToSkipExecution 
{
   @Test
   public void registerTestCase() 
   {
	   System.out.println("Register test Case");
   }
   
   @Test
   public void loginTestCase() 
   {
	   System.out.println("Login test Case");
   }
}
