package Working_TestNG;

import org.testng.annotations.Test;

public class Example_MultipleTestAnnotations 
{
  @Test(priority = 1)
   public void register() 
  {
	   System.out.println("Registration Done");
   }
  
  @Test(priority = 2)
  public void login() {
	   System.out.println("Login Done");
  }
  @Test(priority = 3)
  public void searchProduct() {
	   System.out.println("Searching Product");
  }
  @Test(priority = 4)
  public void addToCart() {
	   System.out.println("product added to cart");
  }
  @Test(priority = 5)
  public void placeOrder() {
	   System.out.println("Order Placed");
  }
}
