package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	WebDriver driver;
	
	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(css = ".card-title")
    private List<WebElement> productTitles;

    @FindBy(css = ".card-body button:last-of-type")
    private List<WebElement> addToCartButtons;
    
    public void addProductsToCart(List<String> products) {
    	for(String product:products) {
    		for(int i=0;i<productTitles.size();i++) {
    			if(productTitles.get(i).getText().equalsIgnoreCase(product)) {
    				addToCartButtons.get(i).click();
    				break;
    			}
    		}
    	}
    }
	
}
