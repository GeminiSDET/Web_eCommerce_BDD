package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css=".cartSection h3")
	private WebElement cartHeader;
	
	@FindBy(xpath = "//button[text()='Buy Now']")
	private WebElement buyNowButton;
	
	public boolean validateCartPage() {
		return cartHeader.isDisplayed();
	}
	public void proceedToCheckout() {
		buyNowButton.click();
	}
}
