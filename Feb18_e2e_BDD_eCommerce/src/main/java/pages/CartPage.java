package pages;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".cart-section h3")
    List<WebElement> cartItems;
    
    @FindBy(css = ".cart-button") 
    private WebElement cartButton;

    public void goToCart() {
        cartButton.click();
    }
    
    public List<String> getCartItems() {
        return cartItems.stream().map(WebElement::getText).collect(Collectors.toList());
    }
    
    public void verifyProductInCart(String productName) {
        boolean isProductInCart = cartItems.stream()
        		.anyMatch(item -> item.getText().equalsIgnoreCase(productName));
        Assert.assertTrue("Product not found in the cart: " + productName, isProductInCart);
    }
}

