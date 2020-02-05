package com.practies;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyFileReading2 {

	Properties prop;
	
	@Test
	public void read() {
		String filePath=System.getProperty("user.dir")+"/src/test/java/com/practies/Example.properties";
	
		try {
			FileInputStream fis=new FileInputStream(filePath);
			prop=new Properties();
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String value=prop.getProperty("username");
		System.out.println(value);
		String value1=prop.getProperty("password");
		System.out.println(value1);
		System.out.println(prop.size());
	}
}