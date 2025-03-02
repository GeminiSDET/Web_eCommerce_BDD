package pages;

import java.util.List;
import java.util.Optional;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".card-body b")
	List<WebElement> productNames;

	@FindBy(css = ".btn.w-10.rounded")
	List<WebElement> addToCartButtons;
	
	public void addProductToCart(String productName) {
		Optional<WebElement> product=productNames.stream().filter(p->p.getText().equalsIgnoreCase(productName))
		.findFirst();
		
		product.ifPresent(p-> addToCartButtons.get(productNames.indexOf(p)).click());
	}
}
