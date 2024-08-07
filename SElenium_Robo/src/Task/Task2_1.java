package Task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Task2_1 {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.twitter.com");
		String title = driver.getTitle();
		System.out.println("Title   :"+title);
		String url = driver.getCurrentUrl();
		System.out.println("URL   :"+url);
		driver.close();
	}
}
