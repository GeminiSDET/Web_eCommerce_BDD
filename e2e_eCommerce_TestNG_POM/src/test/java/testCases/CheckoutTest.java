package testCases;

import org.testng.annotations.Test;

import pageObjects.CheckoutPage;
import utilities.BaseTest;

public class CheckoutTest extends BaseTest{
	
	@Test
	public void placeOrder() {
		CheckoutPage checkoutPage=new CheckoutPage(driver);
		checkoutPage.selectCountry("India");
		checkoutPage.placeOrder();
	}

	
}
