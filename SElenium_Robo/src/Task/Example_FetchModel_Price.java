package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_FetchModel_Price 
    {
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rakeshb13.github.io/SeleniumHTMLPages/WebTable.html");
	Thread.sleep(4000);
	String iphone1 = driver.findElement(By.xpath("//td[.='Iphone 15 Pro']")).getText();
	String Price_iphone1 = driver.findElement(By.xpath("//td[.='Iphone 15 Pro']/following-sibling::td[2]")).getText();
	System.out.println("Brand   :"+iphone1 +"   Price   :"+Price_iphone1);
	String Note12pro = driver.findElement(By.xpath("//td[.='Note 12 Pro']")).getText();
	String Price_note12pro = driver.findElement(By.xpath("//td[.='Note 12 Pro']/following-sibling::td[2]")).getText();
	System.out.println("Brand   :"+Note12pro +"   Price   :"+Price_note12pro);
	String Nokiag42 = driver.findElement(By.xpath("//td[.='Nokia g42']")).getText();
	String Price_Nokiag42 = driver.findElement(By.xpath("//td[.='Nokia g42']/following-sibling::td[2]")).getText();
	System.out.println("Brand   :"+Nokiag42 +"   Price   :"+Price_Nokiag42);
	String SamsungGalaxys24 = driver.findElement(By.xpath("//td[.='Samsung Galaxy s24']")).getText();
	String Price_Samsung = driver.findElement(By.xpath("//td[.='Samsung Galaxy s24']/following-sibling::td[2]")).getText();
	System.out.println("Brand   :"+SamsungGalaxys24 +"   Price   :"+Price_Samsung);
	String Iphone15 = driver.findElement(By.xpath("//td[.='Iphone 15']")).getText();
	String Price_Iphone15= driver.findElement(By.xpath("//td[.='Iphone 15']/following-sibling::td[2]")).getText();
	System.out.println("Brand   :"+Iphone15+"   Price   :"+Price_Iphone15);
	
}
}