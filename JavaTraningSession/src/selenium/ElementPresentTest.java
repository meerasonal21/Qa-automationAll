package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//We don't use WebElement to verify Element Present or not
		/*if(driver.findElement(By.linkText("Aboutasfsadfasgg")).isDisplayed()) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element Not Present");
		}*/
		
		//Use List to verify Element present or not
		List<WebElement> element = driver.findElements(By.linkText("AboutsdfsdgZFeaf"));
		System.out.println(element.size());
		
		if(element.size()>0) {
			System.out.println("Element Present");
		}else {
			System.out.println("Element Not Present");
		}
		
		
		

	}

}
