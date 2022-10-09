package Sangitam_Maven.Sangitam;

import org.openqa.selenium.WebDriver;

//import org.apache.hc.client5.http.nio.ManagedAsyncClientConnection;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Basetest
{

	
	public static WebDriver driver;
	
	public Journeyplanner jp;
	
	public Iternery i;
	
	
	
	
	
	
	@BeforeSuite
	public void initbrowser()
	{
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		
		driver = new ChromeDriver(options);
	
		driver.manage().window().maximize();
		
		
		driver.get("https://sangitambus.in/index.aspx");
		
	
		
	}
	
	
	@BeforeClass
	public void objectCreation()
	{
		
		jp = new Journeyplanner(driver);
		
		
		i = new Iternery(driver);
		
		
		
	}
	
	
	
	
	
	
}
