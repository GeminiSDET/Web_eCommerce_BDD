package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css = "[placeholder='Select Country']")
    private WebElement countryField;

    @FindBy(css = ".btnn")
    private WebElement placeOrderButton;
    
    public void selectCountry(String country) {
    	countryField.sendKeys(country);
    }
    public void placeOrder() {
    	placeOrderButton.click();
    }
}
