package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

public class LoginSteps extends BaseTest {
	
	LoginPage loginPage;
	HomePage homePage;
	
	@Given("User is on Login Page")
		public void User_is_on_Login_Page() {
			driver.get("https://rahulshettyacademy.com/client");
			loginPage=new LoginPage(driver);
		}
	@When("User enters valied credentials and logs in")
	public void User_enters_valied_credentials_and_logs_in() {
		loginPage.login("azarriju88@gmail.com","Azar~!@#4");
	}
	
	@Then("User should be navigated to Home Page")
	public void User_should_be_navigated_to_Home_Page() {
		homePage=new HomePage(driver);
		Assert.assertTrue(homePage.isHomePageDisplayed());
	}
}
