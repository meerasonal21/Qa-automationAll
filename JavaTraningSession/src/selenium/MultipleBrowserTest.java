package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowserTest {

	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream("C:\\QA\\Testing\\prop.properties");
		Properties prop = new Properties();
		prop.load(fi);
		
		String browser = prop.getProperty("browser");//Chrome, Safari //We read this data from data file like excel or properties
		WebDriver driver;

		
		if(browser.equals("Firefox")) {
			driver = new FirefoxDriver(); 
		}else if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}else {
			driver = new SafariDriver();
		}
		
		driver.get("https://www.facebook.com/"); 

		driver.findElement(By.id("email")).sendKeys("sdgssgsrgsdfhgesrhdsgayreyer"); 
		driver.findElement(By.id("pass")).sendKeys("sdggsdfhreyhfsdheteyhe");
		driver.findElement(By.name("login")).click();
		 
		
		
		
		
		
		
		
		}	
		
		

	}

