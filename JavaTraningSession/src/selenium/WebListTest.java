package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		//WebElement footer = driver.findElement(By.xpath("//div[@class='KxwPGc AghGtd']"));
		//List<WebElement> allLinks = footer.findElements(By.tagName("a"));
		
		
		System.out.println(allLinks.size());
		
		for(int i = 0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
		}
		
		
		
		
		
		
		

	}

}
