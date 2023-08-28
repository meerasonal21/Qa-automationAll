package pages;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;
  
   /* WebElement email =   driver.findElement(By.id("usernameInput-input"));
    WebElement password =  driver.findElement(By.id("password"));
    WebElement loginButton =     driver.findElement(By.id("signIn"));
    WebElement emailErr =   driver.findElement(By.id("UsernameTextField__errors-usernameInput"));
    WebElement passwordErr =   driver.findElement(By.id("PasswordTextField__errors-password"));
    WebElement globalErr =   driver.findElement(By.id("globalError"));*/
	
    @FindBy(id = "usernameInput-input" )
    public WebElement email;
  
    @FindBy(name = "password")
    public WebElement password;
    
    @FindBy(id = "signIn" )
    public WebElement loginButton;
    
    @FindBy(id = "globalError" )
    public WebElement globalErr;
    
    @FindBy(id = "UsernameTextField__errors-usernameInput" )
    public WebElement emailErr;
    
    @FindBy(id = "PasswordTextField__errors-password" )
    public WebElement passwordErr;
    
    
	public void openBrowser() throws IOException {
	FileInputStream fi = new FileInputStream("C:\\QA\\Testing\\prop.properties");
	Properties prop = new Properties();
	prop.load(fi);
	
	String browser = prop.getProperty("browser");//Chrome, Safari //We read this data from data file like excel or properties
	if(browser.equals("Firefox")) {
		driver = new FirefoxDriver(); 
	}else if(browser.equals("Chrome")) {
		driver = new ChromeDriver();
	}else {
		driver = new SafariDriver();
	}
	PageFactory.initElements(driver, this);
	}
	
	public void openLoginPage() {
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=j3RiSyVC_-U&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiajNSaVN5VkNfLVUiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY4NTU1ODgyMSwiaWF0IjoxNjg1NTU3NjIxLCJqdGkiOiI1ZTg0MjVmZi1lMDYzLTQ4ZTAtYTY0Ni04NzVmNzgwMmNmZDAiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.ssXxXRlH7hqeYd109RJZ99uxksZYIxU6Ez70ZC6fQ66Zdo0GORVMuiDXwjlggJGOwWITD0h53uR2aW-4ALE5Ie06xH4S4WMAV51RmWIUcGtNB7QwDXBshuM8mgw07ZW0--en_9GjMm10e0WHNXUgC2-kBVoQrx9qchhXFkJ2nKDCVwUx09EPZvcSC1Fps2H7DG4HjcqUKruciRzx9Vjuknus7aFAt7yEpmNVaINYYb0-cJyLFKOCipj_IkVscV9Wmm7x2Lz0X6HXp78wdNTjQ7W0bqq1IeITO6UsszppY11PWgz_E8q7Utp2me2FLRjLJ0dg5Nkrpdd82nZ0zZG5Rg&preferred_environment=");	
	}
	public void closeBrowser() {
		driver.quit();
	}
	public void login(String a, String b) throws InterruptedException {
		  email.sendKeys(a);
		  password.sendKeys(b);
		  loginButton.click();
		  Thread.sleep(3000);
	}
	public String readEmailErr() {
		String actualErr = emailErr.getText();
		System.out.println(actualErr);
		return actualErr;
	}
	
	public String readPasswordErr() {
		  String actualErr = passwordErr.getText();
		  System.out.println(actualErr);
		  return actualErr;
	}
	public String readGlobalErr() {
		String actualErr = globalErr.getText();
		  System.out.println(actualErr);
		return actualErr;
	}

	}
		
	