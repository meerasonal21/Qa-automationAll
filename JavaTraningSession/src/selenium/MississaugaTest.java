package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MississaugaTest {

	

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.mississauga.ca/");

	  driver.findElement(By.xpath("//button[contains(text(),'Our organization')]")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> allLinks= driver.findElements(By.xpath("//ul[@class='main-nav-links']/li[3]//li"));
		System.out.println(allLinks.size());
		
		for(int i=0; i<allLinks.size(); i++) {
			System.out.println(allLinks.get(i).getText());
	    }
		
	}
		
		
	}


