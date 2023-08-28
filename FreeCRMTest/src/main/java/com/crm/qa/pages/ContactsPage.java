package com.crm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.crm.qa.base.TestBase;

public class ContactsPage extends TestBase {

	@FindBy(xpath = "//span[contains(@class,'selectable')]")
	WebElement contactsLabel;
	
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	WebElement createNewContact;


	@FindBy (name="first_name")
	WebElement firstName;
	

	@FindBy (name="last_name")
	WebElement lastName;
	
	@FindBy (className="search")
	WebElement company;
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveBtn;
	
	// Initializing the Page Objects:
		public ContactsPage() {
			PageFactory.initElements(driver, this);
		}
		
		
		public boolean verifyContactsLabel(){
			return contactsLabel.isDisplayed();
		}
		

        public void selectContactsByName(String name){
		driver.findElement(By.xpath("//div[@class='ui fitted read-only checkbox']")).click();
	}
        public void selectMultipleContactsTest(String name){
    		driver.findElement(By.xpath("//div[@class='ui fitted read-only checkbox']")).click(); 
        }
        public void clickOncreateNewContact(String ftName, String ltName, String comp) { //String comp){
        	createNewContact.click();
        	firstName.sendKeys(ftName);
        	lastName.sendKeys(ltName);
        	company.sendKeys(comp);
        	saveBtn.click();
        }


}
