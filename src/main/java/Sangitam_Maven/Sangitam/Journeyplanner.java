package Sangitam_Maven.Sangitam;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Journeyplanner
{

	public WebDriver driver;
	
	@FindBy(xpath = "//*[@title='Source']") 
	private WebElement Source;
	

	
	@FindBy(xpath = "//*[@class='select2-search__field']")
	private WebElement Destination_search;

	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_txtFromDate']")
	private WebElement Datepopup;
	
//	@FindBy(xpath = "//*[@class='day']")
//	private List<WebElement> fromdatelist ;
	
	
	
	
	
	@FindBy(xpath = "//*[@class='btnsearch submit']")
	private WebElement Search_Button;
	
	@FindBy(xpath = "//*[@id='ctl00_ContentPlaceHolder1_rptSingleJourney_ctl01_btnSelect']")
	private WebElement Select_Seat_button;
	
	Actions act = new Actions(driver);
	
	
	
	public Journeyplanner(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	public void planner() throws InterruptedException
	{
		
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		Thread.sleep(3000);
		
        act.click(Source).sendKeys("Dhule").sendKeys(Keys.ENTER).build().perform();
	
		
        Thread.sleep(3000);
		
		act.click(Destination_search).sendKeys("Pune").sendKeys(Keys.ENTER).build().perform();
		 
	}
	
	public void selectDate() throws InterruptedException 
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
		
		act.click(Datepopup);
		List<WebElement> fromdatelist = driver.findElements(By.xpath("//*[@class='day']"));
		
		
		
		int fromcount = fromdatelist.size();
		for(int i =0 ; i<fromcount; i++)
		{
			String fromvalue= fromdatelist.get(i).getText();
			if(fromvalue.equals("20"))
			{
				fromdatelist.get(i).click();
				break;
				
			}
			
		}
		
		
	}
		
		
		
		
	public void searchBuses()
	{		
	Search_Button.click();
	}
	
	
	public void selectSeatbutton()
	{
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		
	     Select_Seat_button.click();
	}
	
	
	
	
}
