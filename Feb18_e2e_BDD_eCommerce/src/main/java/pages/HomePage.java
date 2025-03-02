package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".navbar-brand")
	WebElement homePageLogo;
	
	public boolean isHomePageDisplayed() {
		return homePageLogo.isDisplayed();
	}
	public boolean isLogoDisplayed() {
		return homePageLogo.isDisplayed();
	}
}
