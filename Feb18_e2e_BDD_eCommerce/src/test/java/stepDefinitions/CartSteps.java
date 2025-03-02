package stepDefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import utils.BaseTest;

public class CartSteps extends BaseTest {
	WebDriver driver=getDriver();
	LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage = new CartPage(driver);
    
    @Given("User is logged in with {string} and {string}")
    public void userIsLoggedIn(String email, String password) {
    	driver.get("https://rahulshettyacademy.com/client");
    	loginPage.enterEmail(email);
    	loginPage.enterPassword(password);
        loginPage.clickLogin();
        Assert.assertTrue(homePage.isHomePageDisplayed(), "Login failed, Home Page not displayed.");
    }

    @When("User adds {string} and {string} to the cart")
    public void userAddsProductsToCart(String product1, String product2) {
    	productPage.addProductToCart(product1);
        productPage.addProductToCart(product2);
    }
    @Then("Both products should be present in the cart")
    public void bothProductsShouldBePresentInTheCart() {
    	cartPage.goToCart();
        List<String> cartItems = cartPage.getCartItems();
        Assert.assertTrue(cartItems.contains("Zara Coat 3"), "Zara Coat 3 is not in the cart.");
        Assert.assertTrue(cartItems.contains("Adidas Original"), "Adidas Original is not in the cart.");
    }
}
