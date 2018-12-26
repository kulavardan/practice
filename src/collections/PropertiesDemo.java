package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws Exception {
		
		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("E:\\Selenium\\Selenium\\Java\\Collections.prop");
		p.load(fis);

		String version=p.getProperty("java");
		String name=p.getProperty("sai");
		
		System.out.println(version);
		System.out.println(name);
	}

}
