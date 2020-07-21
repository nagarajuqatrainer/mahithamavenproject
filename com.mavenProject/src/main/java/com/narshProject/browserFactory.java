package com.narshProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import project.utilitites.library.configReader;

public class browserFactory {
	
	
	public static WebDriver driver;
	public String myurl = "https://www.mycontactform.com/";
	
	
	
	
	public static WebDriver getBrowser(String browserType,String AppUrl) {
	
		configReader config = new configReader();
		
		if(browserType.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",config.getChromePath());
		 driver =new ChromeDriver();
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	

		if(browserType.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",config.getFirefoxPath());
		 driver =new ChromeDriver();	
	}
		
		
		driver.get(AppUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
		
	}
	
	
	public void quitBrowser() {
		driver.quit();
	}
	

}
