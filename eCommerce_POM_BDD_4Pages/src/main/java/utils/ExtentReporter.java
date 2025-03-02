package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporter {

	public static ExtentReports getReportObject() {
		ExtentSparkReporter reporter=new ExtentSparkReporter("extentReports.html");
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
	}
}

