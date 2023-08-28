package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ChromeDriverTest {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		 
		Thread.sleep(3000);
		driver.findElement(By.name("lastname")).sendKeys("hdfydjsd");
		driver.findElement(By.name("reg_email__")).sendKeys("5682685655");
		driver.findElement(By.id("password_step_input")).sendKeys("hsjshkdsj");
		
		WebElement month = driver.findElement(By.id("month"));
		Select m = new Select(month);
		m.selectByVisibleText("Jul");
		
		WebElement day = driver.findElement(By.id("day"));
		Select d = new Select(day);
		d.selectByVisibleText("20");
		
		WebElement year = driver.findElement(By.id("year"));
		Select y = new Select(year);
		y.selectByValue("2000");
		
		
		driver.findElement(By.name("websubmit")).click();

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
