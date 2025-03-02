package utils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager implements ITestListener {
	
	private static ExtentReports extent;
	private static ExtentTest test;

	public static void setupReport() {
		ExtentSparkReporter  htmlReporter=new ExtentSparkReporter ("target/ExtentReport.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	public static void endReports() {
		extent.flush();
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		test=extent.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		test.pass("Test Passed: " + result.getMethod().getMethodName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.fail("Test Failed: " + result.getThrowable().getMessage());
	}
	@Override
	public void onFinish(ITestContext context) {
		endReports();
	}
}
