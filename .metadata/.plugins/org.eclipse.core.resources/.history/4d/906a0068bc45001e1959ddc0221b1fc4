/*
 * @author Meera Patel
 * 
 */
package com.crm.qa.testcases;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Arrays;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	TestUtil testUtil;
	ContactsPage contactsPage;

    String sheetName = "contacts";

    
	
	public ContactsPageTest(){
		super();
	}
	
	@BeforeMethod
	public void setUp() throws AWTException{
		initialization();
		 Robot robot = new Robot();
		testUtil = new TestUtil();
		contactsPage = new ContactsPage();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
	    contactsPage = homePage.clickOnContactsLinks();
	    
	
	}
	@Test(priority=1)
	public void verifyContactsPageLabel() {
		Assert.assertTrue(contactsPage.verifyContactsLabel(), "contacts label is missing on the page");
	}
	@Test(priority=2)
	public void selectContactsTest() {
		  int destinationX = 300;
	        int destinationY = 200;

	        try {
	            Robot robot = new Robot();
	            robot.mouseMove(destinationX, destinationY);
	        } catch (AWTException e) {
	            e.printStackTrace();
	        }

		contactsPage.selectContactsByName("test2 test2");  
	}
	
	@Test(priority=3)
	public void selectMultipleContactsTest() { 
		int destinationX = 400;
        int destinationY = 300;

        try {
            Robot robot = new Robot();
            robot.mouseMove(destinationX, destinationY);
        } catch (AWTException e) {
            e.printStackTrace();
        }
	        contactsPage.selectContactsByName("test2 test2");
	        contactsPage.selectContactsByName("ui uiii");
	}
	@DataProvider(name = "getCRMTestData")
	public Object[] [] getCRMTestData() throws InvalidFormatException {
		Object data [] [] = TestUtil.getTestData(sheetName);
		return data;
	}
	@Test(priority=4, dataProvider="getCRMTestData") 
	public void validateCreateNewContact( String firstName, String lastName, String company){//, String company) {
		homePage.clickOnContactsLinks();
		int destinationX = 500;
        int destinationY = 400;

        try {
        	
            Robot robot = new Robot();
            robot.mouseMove(destinationX, destinationY);
        } catch (AWTException e) {
            e.printStackTrace();
        }
		//contactsPage.clickOncreateNewContact("Tom","Peter");//"Google" );
        contactsPage.clickOncreateNewContact(firstName,lastName,company);
	
	
	
	}
	
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	
	
	
}
