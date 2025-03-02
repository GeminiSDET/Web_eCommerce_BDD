package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import utils.BaseTest;

public class HomeSteps extends BaseTest {

	WebDriver driver = getDriver();
	LoginPage loginPage = new LoginPage(driver);
	HomePage homePage = new HomePage(driver);

	@Given("User navigates to Login Page")
    public void userNavigatesToLoginPage() {
        driver.get("https://rahulshettyacademy.com/client");
    }

	@When("User logs in with valid credentials {string} and {string}")
    public void userLogsInWithValidCredentials(String email, String password) {
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
	}
    @Then("User should be on Home Page")
	public void userShouldBeOnHomePage() {
    	Assert.assertTrue(homePage.isHomePageDisplayed(),"Home Page is not displayed");
    }

    @Then("Home Page should display the correct logo")
    public void homePageShouldDisplayCorrectLogo() {
    	Assert.assertTrue(homePage.isLogoDisplayed(),"Home Page logo is not displayed correctly");
    }
    
}
