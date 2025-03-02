package testCases;

import org.testng.annotations.Test;
import pageObjects.CartPage;
import utilities.BaseTest;
import org.testng.Assert;

public class CartTest extends BaseTest {

	@Test
	public void validateCart() {
		CartPage cartPage=new CartPage(driver);
			Assert.assertTrue(cartPage.validateCartPage());
	}
}

