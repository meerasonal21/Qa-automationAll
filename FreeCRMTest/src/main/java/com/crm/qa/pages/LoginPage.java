package com.crm.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
      
	//Page Factory - OR:
	  
	   @FindBy(name ="email")
		WebElement email;
		
		@FindBy(name="password")
		WebElement password;
		
		@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")
		   WebElement loginBtn;
			
		@FindBy(xpath=("//a[@href='https://register.freecrm.com/register/']"))
		WebElement signUpBtn;
		
		@FindBy(xpath=("//a[@title='free crm home']"))
		WebElement crmLogo;
		
		@FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
		 WebElement submitBtn;
		    
		
		//Initializing the Page Objects:
		public LoginPage(){
			PageFactory.initElements(driver, this);
		}
		
		//Actions:
		public String validateLoginPageTitle(){
			return driver.getTitle();
		}
	
		public boolean validateCRMImage(){
			return crmLogo.isDisplayed();
		}
		public HomePage login(String em, String pwd){
			loginBtn.click();
			email.sendKeys(em);
			password.sendKeys(pwd);
			submitBtn.click();
			return new HomePage();
		}
		
	}