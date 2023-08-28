package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CSSSelectorTest {

	public static void main(String[] args) {
		
		//ClassName objName = new ClassName();
		 FirefoxDriver driver = new FirefoxDriver();//open new firefox 
		 driver.get("https://www.facebook.com/");//Open facebook
		 
		 driver.findElement(By.cssSelector("input[id='email']")).sendKeys("asdgsdfyhdfsyhsetdfhsdfhsdgh");
		 driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("segsgerhdfsghdfshsreh");
		 driver.findElement(By.cssSelector("button[name='login']")).click();
		
		
		
		
		
		
	}

}
