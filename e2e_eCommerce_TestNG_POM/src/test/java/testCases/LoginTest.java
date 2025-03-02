package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import utilities.BaseTest;

public class LoginTest extends BaseTest{

	@Test
	public void validateLogin() {
		LoginPage loginPage=new LoginPage(driver);
		loginPage.login("azarriju88@gmail.com","Azar~!@#4");
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}
}
