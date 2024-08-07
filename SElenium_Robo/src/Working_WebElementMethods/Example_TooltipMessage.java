package Working_WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Example_TooltipMessage {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.flipkart.com/");
    Thread.sleep(3000);
     String title = driver.findElement(By.xpath("//a[text()='cart']")).getAttribute("title");
     System.out.println(title);
	}

}
