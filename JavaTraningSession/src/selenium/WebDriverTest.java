package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		//ClassName objName = new ClassName();
		 //FirefoxDriver driver = new FirefoxDriver();//open new firefox 
		 //ParentClass(Interface)Name objName = new ClassName();
		WebDriver driver = new FirefoxDriver();
		 driver.get("https://www.facebook.com/");//Open facebook
		 
		 driver.findElement(By.id("email")).sendKeys("shjhjggghgf");//wrong email
		 driver.findElement(By.id("pass")).sendKeys("gvcdhvchsdv");//wrong password
		 driver.findElement(By.name("login")).click();
		 

	}

}
