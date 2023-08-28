package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage  extends TestBase {
  //  @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    //WebElement submitBtn;
    
    @FindBy(xpath = "//span[@class='user-display']")
	@CacheLookup
	WebElement userNameLabel;

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	//@FindBy(xpath = "//a[contains(text(),'New Contact')]")
	//WebElement newContactLink;
	
	@FindBy(xpath = "//button[contains(text(),'Create')]")
	WebElement createNewContact;
	
	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	
	
	//Initializing the Page Objects:
	public HomePage(){
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	

    public boolean verifyCorrectUserName(){
    	//submitBtn.click();
		return userNameLabel.isDisplayed();
	}
    public ContactsPage clickOnContactsLinks() {
	contactsLink.click();
	return new ContactsPage();
    }
    

    public DealsPage clickOnDealsLinks() {
    	dealsLink.click();
    	return new DealsPage();
        }
    public TasksPage clickOnTasksLinks() {
    	tasksLink.click();
    	return new TasksPage();
        }

 public void createNewContact() {
	 contactsLink.click();
	 Actions action = new Actions(driver);
     action.moveToElement(createNewContact).build().perform();
     createNewContact.click();
 
 }











}










