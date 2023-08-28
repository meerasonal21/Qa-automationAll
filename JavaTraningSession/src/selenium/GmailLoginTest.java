package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-1190645513%3A1685807516538123&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ffgf=1&ifkv=Af_xneGWMIZxS1znIW0nVJUeLye9E00b3ielC5vl4qlQI6SiQ6xwJwSsIBCOOGERsWdiDS0nnPQyLw&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		
		driver.findElement(By.id("identifierId")).sendKeys("gdsvdjhsjsyuvjsdgasjdgjasgdjashd");
		//driver.findElement(By.id("identifierNext")).click();
		
		//Thread.sleep(3000);
		//String expectedErr= "Couldn’t find your Google Account";
		//String actualErr = driver.findElement(By.xpath("))"
		//System.out.println(actualErr);
		
		//if(expectedErr.equals(actualErr)) {
			System.out.println("Test Pass");
		//}else {
			System.out.println("Test Fail");
		}
			

		
		
		
		
	}


