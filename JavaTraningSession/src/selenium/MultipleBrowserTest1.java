package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import selenium.Xls_Reader;

public class MultipleBrowserTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xls_Reader d = new Xls_Reader("C:\\QA\\Testing\\NikulTest.xlsx");

		String browser = d.getCellData("Data1", "Browser", 2);//Chrome, Safari //We read this data from data file like excel or properties
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
