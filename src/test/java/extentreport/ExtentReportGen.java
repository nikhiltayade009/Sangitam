package extentreport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGen 
{

	static ExtentReports extent;
	
	public static ExtentReports extentReportGenerator()
	{
		
		String path = System.getProperty("User.dir")+"//-Reports//Sangitam_report.html";
		
		ExtentHtmlReporter repoter = new ExtentHtmlReporter(path);
		
		repoter.config().setTheme(Theme.DARK);
		
		
		
		repoter.config().setReportName("Sangitam Report");
		
		extent = new ExtentReports();
		
		extent.attachReporter(repoter);
		
		extent.setSystemInfo("Project name ", "Sangitam Web Test");
		
		extent.setSystemInfo("Environment", "Smoke");
		
		extent.setSystemInfo("Executed By", "Nikhil");
		
		return extent;
		
		
		
		
	}
	
	
	
	
	
}
