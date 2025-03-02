package pageObjects;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".card-body")
	private List<WebElement> productList;
	
	@FindBy(xpath="//button[@class='btn btn-custom' and @fdprocessedid='ktfk5d']")
	private WebElement cartButton;
	
	public void addProductToCart(String productName) {
		productList.stream().filter(p->p.getText().contains(productName)).findFirst()
		.ifPresent(p->p.findElement(By.cssSelector(".btn.w-10.rounded")).click());
		
	}
	public void navigateToCart() {
		cartButton.click();
	}
}
