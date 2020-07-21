package loginPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;





public class loginPage {
	public WebDriver driver;
	
	
	//PageObjects
	@FindBy(name="user") WebElement uname;
	@FindBy(name="pass") WebElement pword;
	@FindBy(name="btnSubmit") WebElement button;
	
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	
	public void verifyLoginPage(String un,String pw) throws Exception {
		
		
		
		if(uname.isDisplayed()) {
			uname.sendKeys(un);
			System.out.println("Enter username");
			
			
		}
		else
		{
			System.out.println("Fails to enter");
		}
		
		
		if(pword.isDisplayed()) {
			pword.sendKeys(un);
			System.out.println("Enter username");
			
			
		}
		else
		{
			System.out.println("Fails to enter");
		}
		
	}
	
	public void verifyButton() throws Exception {
		if(button.isEnabled()) {
			button.click();
			
		}
	}
	
	
	
	
	
	
	
	
	
}
