package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "userEmail")
	private WebElement emailField;

	@FindBy(id = "userPassword")
	private WebElement passwordField;

	@FindBy(id = "login")
	private WebElement loginButton;
	
	public void login(String email,String password) {
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		loginButton.click();
	}
}
