package Com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportsGenrators {
	
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		// ExtentSparkReporter ---> Title,Theme
		// ExtentReports ---> setup 
		String path="C:\\Users\\Dell\\eclipse-workspace\\DSS_Batch_MarchFramework\\Reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Automation Test Report");
		reporter.config().setReportName("DSS Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Project Name", "DSS Test");
		extent.setSystemInfo("Tool ", "Selenium WebDriver");
		extent.setSystemInfo("QA", "ABC");
		return extent;
		
		
	}

}
