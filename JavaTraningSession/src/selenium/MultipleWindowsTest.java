package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
	
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1526458437%3A1687016620594024&continue=https%3A%2F%2Faccounts.google.com%2F&ffgf=1&followup=https%3A%2F%2Faccounts.google.com%2F&ifkv=Af_xneHyZTfBwDHG7gI3u5V0mssAIQ5s25sG8kaIERJ2P1zVkFEybJV_wFwuVRD2wHtFrttvQ4_jkQ&passive=1209600&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(2000);
		
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(allWindows.size());
		
		Iterator<String> iter = allWindows.iterator();
		String miniwindow = iter.next();
		String childwindow = iter.next();
		System.out.println(miniwindow);
		System.out.println(childwindow);
		
		driver.switchTo().window(childwindow);
		System.out.println(driver.getTitle());//help page
		driver.close();//will close only child window or current window 
		Thread.sleep(3000);
		
		driver.switchTo().window(miniwindow);
		System.out.println(driver.getTitle());//gmail page
		driver.quit();//kill driver and close everything
		
		
		
		
		
		

	}

}
