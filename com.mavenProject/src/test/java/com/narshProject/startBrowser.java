package com.narshProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import loginPageObjects.loginPage;
import project.utilitites.library.configReader;

public class startBrowser {
  
	public static WebDriver driver;
	public configReader config;
	public browserFactory browser;
	
	
	
	
	@BeforeTest
	public void setUp() {
		config=new configReader();
		browser=new browserFactory();
	}
	
	@Test
  public void launchBrowser() throws Exception {
	  
	
	  WebDriver driver=browserFactory.getBrowser(config.getChromeBrowser(), config.getAppUrl());
	  loginPage login = PageFactory.initElements(driver, loginPage.class);
	  login.verifyLoginPage(config.getUserName(), config.getPassword());
	  login.verifyButton();
	  browser.quitBrowser();
  }
}
