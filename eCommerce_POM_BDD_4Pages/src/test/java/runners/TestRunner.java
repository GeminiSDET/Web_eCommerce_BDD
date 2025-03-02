package runners;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/resources/features",
		glue= {"stepDefinitions"},
		plugin= {"preety","html:target/cucumber-reports.html"}
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}


