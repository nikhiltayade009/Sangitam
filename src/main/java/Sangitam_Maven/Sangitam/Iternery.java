package Sangitam_Maven.Sangitam;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iternery 
{

	public WebDriver driver;
	
	@FindBy(xpath = "//*[text()='30L']")
	private WebElement Seatno;
	
	
	@FindBy(xpath = "//*[@title='Select Pickup Point']")
	private WebElement Pickup_Point;
	
	@FindBy(xpath = "//*[@title='Select Drop Point']")
	private WebElement Drop_Point;
	
	@FindBy(xpath = "//*[@name='ddlg']")
	private WebElement Gender;
	
	@FindBy(xpath = "//*[text()='CONTINUE']")
	private WebElement Continue_Button;
	
	public Iternery(WebDriver driver)
	{
		this.driver= driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void iternaryplan()
	{
		
		Actions act = new Actions(driver);
		
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

		
		act.click(Seatno);
		
		act.click(Pickup_Point).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		act.click(Drop_Point).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		act.click(Gender).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	   Continue_Button.click();
		
		
		
	}
	
}
