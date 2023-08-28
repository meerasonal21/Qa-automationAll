package stepdefinations;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStepDefination {
	LoginPage lp = new LoginPage();
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
		lp.openBrowser();
	}
	@When("^title of login page is \"([^\"]*)\"$")
	public void title_of_login_page_is(String a) throws Throwable {
		String expectedTitle = a;
		String acutalTitle = lp.readTitle();
        Assert.assertEquals(expectedTitle, acutalTitle);
	}
	

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String email, String password) throws Throwable {
		 lp.enterEmailPassword(email,password);
		 
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
		lp.clickOnLoginButton();
		
	}

	@Then("^user get error for email$")
	public void user_get_error_for_email() throws Throwable {
    String expectedErr="Please enter a username or card number without special characters.";
	String actualErr = lp.readErr();
	Assert.assertEquals(expectedErr, actualErr);
	}

	@Then("^user quit$")
	public void user_quit() throws Throwable {
     lp.closeBrrowser();
	}


}
