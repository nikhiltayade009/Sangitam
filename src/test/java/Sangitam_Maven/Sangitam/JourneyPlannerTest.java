package Sangitam_Maven.Sangitam;

import org.testng.annotations.Test;

import extentreport.Listenerclass;

public class JourneyPlannerTest extends Basetest
{

	
	@Test
	public void verifyPlannig() throws InterruptedException
	{	
	jp.planner();		
	}
	
	@Test
	public void verifySelectDate() throws InterruptedException
	{
		jp.selectDate();
	}
	
	
	@Test
	public void verifySearchBuses()
	{
		jp.searchBuses();
	}
	
	
	@Test
	public void verifySelectButton() 
	{
		jp.selectSeatbutton();
	}
	
	
	
	
	
	
}
