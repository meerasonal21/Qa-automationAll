package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.ca/");
		
		
		WebElement singIn = driver.findElement(By.id("nav-link-accountList"));
		Actions builder = new Actions(driver);
		builder.moveToElement(singIn).build().perform();
		Thread.sleep(1500);
		
		
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']/a"));
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		
		}	
		

	}

}
