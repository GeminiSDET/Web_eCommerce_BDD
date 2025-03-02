package pages;

import java.util.List;

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
	@FindBy(css = ".cartSection h3")
    private List<WebElement> cartProductTitles;

    @FindBy(css = ".totalRow button")
    private WebElement checkoutButton;
    
    public boolean verifyProductInCart(String productName) {
    	return cartProductTitles.stream().anyMatch(title -> title.getText().equalsIgnoreCase(productName));
    }
    public void proceedToCheckout() {
    	checkoutButton.click();
    }
}
