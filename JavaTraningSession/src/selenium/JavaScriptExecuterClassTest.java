package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		Thread.sleep(5000);
		
	    WebElement registration = driver.findElement(By.linkText("Registration"));
	    
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	   //Option 1: Scroll By x and Y coordinate
	   //System.out.println(registration.getLocation());
	 //jse.executeScript("window.scrollBy(0,2500)");
	    
	   //option 2 - Scroll until the element is in the view
	  //jse.executeScript("arguments[0].scrollIntoView(true);", registration);
		
		
	  //option 3 - Direct click using JavaScriptExecuterClass
	  		jse.executeScript("arguments[0].click()", registration);
		

	}

}
