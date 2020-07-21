package com.narshProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class startBrowser {
  
	public static WebDriver driver;
	
	
	@Test
  public void launchBrowser() throws Exception {
	  
	  System.out.println("Test maven project");
	  
	  System.setProperty("webdriver.chrome.driver", "./myDrivers/chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  driver.quit();
	  
  }
}
