package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class KeyaTest {

	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=j3RiSyVC_-U&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiajNSaVN5VkNfLVUiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY4NTU1ODgyMSwiaWF0IjoxNjg1NTU3NjIxLCJqdGkiOiI1ZTg0MjVmZi1lMDYzLTQ4ZTAtYTY0Ni04NzVmNzgwMmNmZDAiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.ssXxXRlH7hqeYd109RJZ99uxksZYIxU6Ez70ZC6fQ66Zdo0GORVMuiDXwjlggJGOwWITD0h53uR2aW-4ALE5Ie06xH4S4WMAV51RmWIUcGtNB7QwDXBshuM8mgw07ZW0--en_9GjMm10e0WHNXUgC2-kBVoQrx9qchhXFkJ2nKDCVwUx09EPZvcSC1Fps2H7DG4HjcqUKruciRzx9Vjuknus7aFAt7yEpmNVaINYYb0-cJyLFKOCipj_IkVscV9Wmm7x2Lz0X6HXp78wdNTjQ7W0bqq1IeITO6UsszppY11PWgz_E8q7Utp2me2FLRjLJ0dg5Nkrpdd82nZ0zZG5Rg&preferred_environment=");

		 driver.findElement(By.id("usernameInput-input")).sendKeys("shjhjggghgf@#%");//wrong email
		 driver.findElement(By.name("password")).sendKeys("gvcdhvcjgyuhuhsdv"+Keys.ENTER);//wrong password
		// driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);// to wait for error message 
		
		String expectedErr="Please enter a username or card number without special characters.";
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
				
		if(expectedErr.equals(actualErr)) {
			System.out.println("Test pass");
		}else {
			System.out.println("Test fail");
		}

	}

}
