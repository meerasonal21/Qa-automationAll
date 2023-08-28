package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
	
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//WebElement footer = driver.findElement(By.xpath("//ul[contains(@class,'uiList pageFooterLinkList ')]"));
	    //List<WebElement> allLinks = footer.findElements(By.tagName("a"));
	    
	   
	    
	    List<WebElement>allLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li"));		
				
				
        System.out.println(allLinks.size());
				
		for(int i = 0; i<allLinks.size(); i++) {
	    System.out.println(allLinks.get(i).getText());
		
		
		

	}
	}
}
