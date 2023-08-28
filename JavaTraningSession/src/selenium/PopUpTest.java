package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.aliexpress.com/");
		// Assume we don't get popup everytime
		//if popup --> Close Popup --> type computer in search box
		//if no popup --> type computer in search box
		List<WebElement> popUp1 = driver.findElements(By.className("_24EHh"));
		System.out.println(popUp1.size());
		
		if(popUp1.size()>0) {
			popUp1.get(0).click();
		}
		//List<WebElement> popUp1 = driver.findElements(By.className("_24EHh"));
		//System.out.println(popUp1.size());
		
		//if(popUp1.size()>0) {
			//popUp1.get(0).click();
		
	   
	    driver.findElement(By.id("search-key")).sendKeys("Computer");
		
		
		
		
		
		

	}

}
