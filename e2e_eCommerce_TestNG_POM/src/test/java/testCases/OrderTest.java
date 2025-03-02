package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.OrderConfirmationPage;
import utilities.BaseTest;

public class OrderTest extends BaseTest{
	
	@Test
	public void validateOrder() {
		OrderConfirmationPage orderConfirmationPage=new OrderConfirmationPage(driver);
		Assert.assertTrue(orderConfirmationPage.validateOrderSuccess());
	}
}
