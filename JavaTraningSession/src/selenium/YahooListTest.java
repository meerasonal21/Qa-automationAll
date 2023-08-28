package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://ca.yahoo.com/?guccounter=1");
		
		driver.findElement(By.xpath("//span[contains(text(),'Trending Now')]")).click();
		Thread.sleep(500);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='bd wafer-tabs-target']/div[1]//a"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size();i++) {
		System.out.println(allLinks.get(i).getText());
		}
		}
		
		
		

	}


