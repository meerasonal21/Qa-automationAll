package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonTest {

	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/htmlforms10.htm");
		
		List<WebElement> allRadio = driver.findElements(By.name("group1"));
		System.out.println(allRadio.size());
		
		for(WebElement a : allRadio) {
			System.out.println(a.getAttribute("value")+"-----"+a.isSelected());
		}
		
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		allRadio.get(2).click();
		System.out.println("-------------------------------------");
		
		for(WebElement a : allRadio) {
			System.out.println(a.getAttribute("value")+"-----"+a.isSelected());
		}
		
		
		
	}

}
