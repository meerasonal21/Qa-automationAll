package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {
	
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ebay.ca/");
		List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='hl-cat-nav__container']/li/a"));	
		 System.out.println(allOptions.size());
		 for(int i=0; i <allOptions.size();i++) {
			 System.out.println(allOptions.get(i).getText());
		 }
		
	}
		
		
		

	}

