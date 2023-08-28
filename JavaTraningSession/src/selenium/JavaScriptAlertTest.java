package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptAlertTest {

	public static void main(String[] args) throws InterruptedException {

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://echoecho.com/javascript4.htm");
		
		driver.findElement(By.name("B2")).click();
		Thread.sleep(3000);
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		
		al.accept();//click on selected button 
		//al.dismiss();//select on non-selected or close alret

	}

}
