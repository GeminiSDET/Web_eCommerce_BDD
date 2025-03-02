package stepDefinitions;

import java.util.Arrays;
import java.util.List;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.ProductPage;
import utils.BaseTest;
import org.testng.*;


public class AddToCartSteps extends BaseTest {
	
	ProductPage productPage;
	CartPage cartPage;
	
	@Given("User is on Home Page")
	public void User_is_on_Home_Page() {
		productPage=new ProductPage(driver);
	}
	
	@When("User adds 'Zara Coat 3' and 'Adidas Original' to the cart")
	public void User_adds_product_to_the_cart() {
		List<String> products= Arrays.asList("Zara Coat 3" , "Adidas Original");
		productPage.addProductsToCart(products);
	}
	
	@Then("The products should be added to the cart successfully")
	public void The_products_should_be_added_to_the_cart_successfully() {
		cartPage=new CartPage(driver);
		Assert.assertTrue(cartPage.verifyProductInCart("Zara Coat 3"),"Zara Coat 3 is not in the cart!");
		Assert.assertTrue(cartPage.verifyProductInCart("Adidas Original"), "Adidas Original is not in the cart!");
	}
}
