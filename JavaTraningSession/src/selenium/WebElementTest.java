package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("sdgssgsrgsdfhgesrhdsgayreyer"); 
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("sdggsdfhreyhfsdheteyhe");
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
		
		
		
	}

}
