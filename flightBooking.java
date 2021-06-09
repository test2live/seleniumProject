package com.flightBooking.test;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

import com.flightBooking.page.commonpageHelper;

public class flightBooking extends commonpageHelper {
	
	@Test
	public void firsttestcase_byDefault() throws IOException, Exception{
		commonpageHelper page = pageFactory.getPagePbject(commonpageHelper.class);
		page.launchURL();
		page.selectFromDropdown("Departure");
		page.selectToDropdown("Destination");
		page.findFlights();
		page.chooseFlight();
		page.nametextbox("sample");
		page.city("paris");
		page.zipcode("10001");
		page.payment("4111111111111111");
		page.Nameoncard("TEST");
		page.click_checkbox();
		page.purchase_flight();
		
		String message = "Thank you for your purchase today!";
		webElement  msg	 = driver.findElement(By.cssSelector("#body:nth-child(3) div.container div.container.hero-unit"));
		
		if (mas=message) {
			reporter.report("message is validated with purchased today ");
		}
	
		

		
	}
	
	
}