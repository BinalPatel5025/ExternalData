package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadWritePropertiesFile {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream f= new FileInputStream("C:\\testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(f);
		
		String browser = prop.getProperty("browser");
		System.out.println(browser);
		String email = prop.getProperty("incorrectemail");
		System.out.println(email);
		
		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("defect"));
		System.out.println(prop.getProperty("testcase"));
		
		prop.setProperty("testing","automation");
		System.out.println(prop.getProperty("testing"));
		prop.setProperty("tool","selenium");
		System.out.println(prop.getProperty("tool"));
		
		FileOutputStream fo = new FileOutputStream("C:\\testing\\prop.properties");
		prop.store(fo, "Adding to Prop file");
		
		
		
		

	}

}
