package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TDListTest {

	public static void main(String[] args) {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.td.com/ca/en/personal-banking");
		
		
		
		 List<WebElement>allLinks = driver.findElements(By.xpath("//ul[@class='cmp-footer__links']/li"));
		
		
		 System.out.println(allLinks.size());
			
			for(int i = 0; i<allLinks.size(); i++) {
		    System.out.println(allLinks.get(i).getText());
		
	}

}
}
