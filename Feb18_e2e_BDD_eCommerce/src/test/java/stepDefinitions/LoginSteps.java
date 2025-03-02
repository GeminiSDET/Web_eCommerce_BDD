package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;
import utils.BaseTest;
import utils.ConfigReader;

public class LoginSteps extends BaseTest {
	WebDriver driver = getDriver();
	LoginPage loginPage = new LoginPage(driver);
	ConfigReader config=new ConfigReader();

	@Given("User is on the login page")
	public void userIsOnLoginPage() {
		driver.get(config.getProperty("baseURL"));
	}

	@When("User enters email {string} and password {string}")
	public void userEntersEmailAndPassword(String email,String password) {
		loginPage.enterEmail(email);
		loginPage.enterPassword(password);
		loginPage.clickLogin();
	}

	@Then("User should see {string}")
	public void userShouldSee(String message) {
		if(message.equals("Home Page should be visible")) {
			Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
		}
		else {
			Assert.assertTrue(loginPage.getErrorMessage().contains("Invaild login"));
		}
	}
}
