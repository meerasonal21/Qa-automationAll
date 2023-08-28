package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginTest {

	public static void main(String[] args) {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		//Email
		
		//Option 1. - className - class attribute - can not use when we have space - not working 
		//driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("hbjfjdsf");
		
		//Option 2. cssSelector - need to learn syntax
		//driver.findElement(By.cssSelector(null)).sendKeys("gfdhfgjdf");
		 
		//Option 3. id - id attribute - working
		//driver.findElement(By.id("email")).sendKeys("jfdfbf");
		
		//Option 4. linktext - for links only 
		//driver.findElement(By.linkText(null)).sendKeys("fff");
		
		//Option 5. name - name attribute - working  
		//driver.findElement(By.name("email")).sendKeys("hhjvjhgjfvjfu");
		
		//Option 6. partialLinkText - only for link
		//driver.findElement(By.partialLinkText(null)).sendKeys("grgreg");
		
		//Option 7. tagName -  not unique not first one 
		//driver.findElement(By.tagName("input")).sendKeys("fgfgfgdf");
		
		//option 8. xpath - need to learn syntax
		//driver.findElement(By.xpath(null)).sendKeys("dfhdbjfbdj");
		
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("vfvjhfj");
		
		//PASSWORD
		driver.findElement(By.name("pass")).sendKeys("hhhjvdjbius");
		
		//Login
		driver.findElement(By.tagName("button")).click();
		
		
		

	}

}
