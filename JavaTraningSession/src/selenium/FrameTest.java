package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		List<WebElement> sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable Present");
		}else {
			System.out.println("sortable not Present");
		}
		
		List<WebElement> draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable not Present");
		}
		
		driver.switchTo().frame(0);//index
		//driver.switchTo().frame("demo frame");//worksonly with name or id.in this case no name or id so we dont use.
		//driver.switchTo().frame(driver.findElement(By.className("demo-free")));//Webelement
	    System.out.println("------------------------------------After switching to frame------------------");
	    
	    sortable = driver.findElements(By.linkText("Sortable"));
		System.out.println(sortable.size());
		
		if(sortable.size()>0) {
			System.out.println("sortable Present");
		}else {
			System.out.println("sortable not Present");
		}
		
		 draggable = driver.findElements(By.id("draggable"));
		System.out.println(draggable.size());
		
		if(draggable.size()>0) {
			System.out.println("draggable Present");
		}else {
			System.out.println("draggable not Present");
	
	
	
		}
	    System.out.println("-----------------Switching to main page--------------");
	    driver.switchTo().defaultContent();	
	
	
	sortable = driver.findElements(By.linkText("Sortable"));
	System.out.println(sortable.size());
	
	if(sortable.size()>0) {
		System.out.println("sortable Present");
	}else {
		System.out.println("sortable not Present");
	}
	
	 draggable = driver.findElements(By.id("draggable"));
	System.out.println(draggable.size());
	
	if(draggable.size()>0) {
		System.out.println("draggable Present");
	}else {
		System.out.println("draggable not Present");

	
	
}
	
	}
}
	
