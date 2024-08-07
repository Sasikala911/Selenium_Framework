package Working_TestNG;

import org.testng.annotations.Test;

public class Example_enabled 
{
	@Test
   public void addtoCartTestcase() 
   {
	   System.out.println("add to cart Test Case Pass");
   }
	@Test(enabled = false)
	public void addtoWishlistTestCase() 
	{
		   System.out.println("add to wishlist test cas fail");
	   }
}
