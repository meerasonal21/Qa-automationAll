package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BestBuyTest {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bestbuy.ca/en-ca");
		
		driver.findElement(By.xpath("//span[@data-automation='x-shop']")).click();
		 
		List<WebElement> allOptions = driver.findElements(By.xpath("//div[@class='menu_3LP5u menuActive_3neTn']/div[1]/a"));
		System.out.println(allOptions.size());
		
		for(int i=0; i<allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}
		
		
		
		
		
		

	}

}
