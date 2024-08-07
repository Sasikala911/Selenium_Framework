package Working_DataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Example_PropertiesFile {
public static void main(String[] args) throws IOException {
	FileInputStream fis=new FileInputStream("./TestData/Commondata.properties");
	Properties pro=new Properties();
	pro.load(fis);
	String value = pro.getProperty("url");
	System.out.println(value);
	String value1 = pro.getProperty("email");
	System.out.println(value1);
	String value2 = pro.getProperty("pwd");
	System.out.println(value2);
}
}
