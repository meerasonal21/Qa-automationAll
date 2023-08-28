package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShotTest {

	public static void main(String[] args) throws IOException {
		
		FirefoxDriver driver =new FirefoxDriver();
		driver.get("https://www.mississauga.ca/");
		
		File screenShotFile = driver.getScreenshotAs(OutputType.FILE);
		//File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);This is for Webdriver
		FileUtils.copyFile(screenShotFile, new File("C:\\QA\\Testing\\screenshot.png"));
		

	}

}
