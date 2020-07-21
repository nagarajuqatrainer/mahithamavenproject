package project.utilitites.library;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReader {
	
	public Properties prop;
	
	public configReader() {
		
		
		try {
			//Calling the file
			File file = new File("./myFiles/login.properties");
			//Read data from file
			FileInputStream fis = new FileInputStream(file);
			prop = new Properties();
			prop.load(fis);
			
		}catch(Exception ex) {
			System.out.println("Exception is"+ex.getMessage());
		}
		
	}
	
	
	
	public String getChromePath() {
		return prop.getProperty("ChromeDriver");
		
	}
	
	public String getFirefoxPath() {
		return prop.getProperty("FirefoxDriver");
	}
	
	public String getChromeBrowser() {
		return prop.getProperty("Browser");
	}
	
	
	public String getAppUrl() {
		return prop.getProperty("url");
	}
	
	public String getUserName() {
		return prop.getProperty("username");
	}
	
	public String getPassword() {
		return prop.getProperty("password");
	}
	
	
	
	
	//Creating methods for Basic Contact Form page
	
	public String getyourName() {
		return prop.getProperty("yourname");
	}
	
	public String getYourEmail() {
		return prop.getProperty("maildata");
	}
	
	public String getMessage() {
		return prop.getProperty("yourmessage");
	}
	
	
	
	

}
