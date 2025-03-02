package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import utilities.BaseTest;

public class ProductTest extends BaseTest {
	
	@Test
	public void addProductCart() {
		HomePage homePage=new HomePage(driver);
		homePage.addProductToCart("Zara Coat 3");
		homePage.addProductToCart("Adidas Original");
	}
}