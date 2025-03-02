package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	protected static WebDriver driver;
	static ConfigReader config=new ConfigReader();
	
	@BeforeClass
	public static void setUp() {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(config.getProperty("baseURL"));
	}
	
	@AfterClass
	public static void teardown() {
		if(driver !=null) {
			driver.quit();
		}
	}
	public WebDriver getDriver() {
		return driver;
	}
}
