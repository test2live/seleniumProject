package com.flightBooking.page;

import org.openqa.selenium.By;
import org.openqa.selenium.webdriver;

import com.flightBooking.test.ChromeDriver;
import com.flightBooking.test.WebDriver;

public class commonpageHelper {
//https://blazedemo.com/
	public static final By Loc_IN_Name= By.id("inputName");
	public static final By Loc_IN_city= By.id("city");	
	public static final By Loc_IN_zipcode= By.id("zipCode");
	public static final By Loc_IN_CCcard= By.id("creditCardNumber");	
	public static final By Loc_IN_Nameoncard= By.id("nameOnCard");
	public static final By Loc_IN_Departure= By.tagName("fromport");
	public static final By Loc_IN_Destination= By.tagName("toport");
	public static final By LOC_IN_FindFlights = By.cssSelector("#btn btn-primary");
	public static final By LOC_IN_Checkbox = By.id("rememberMe");
	public static final By LOC_IN_ChooseFlight = By.xpath("//body[1]/div[2]/table[1]/tbody[1]/tr[2]/td[1]/input[1]");
	publci static final By LOC_IN_purchaseFlight = By.xpath("//body/div[2]/form[1]/div[11]/div[1]/input[1]");
	
	public void selectFromDropdown(String Departure) throws InterruptedException {
		new Select(CheckUtils.getElement(getTest(),Loc_IN_Departure));
	}
	
	public void selectToDropdown(String Destination) throws InterruptedException {
		new Select(CheckUtils.getElement(getTest(),Loc_IN_Destination));
	}
	
	public void findFlights() throws InterruptedException {
		new Select(CheckUtils.getElement(getTest(),LOC_IN_FindFlights));
	}
	
	public void launchURL() throws Exception{
		System.out.println("open the browser");
		WebDriver driver = new ChromeDriver();
		//String url="https://blazedemo.com";
		driver.get(url);
		System.out.println("url opened");
		driver.manager().window().maximize();
		waitUtils.wait(5);
		
	}
	
	public void refresh() {
		clickUtils.clickButtonOrFail(getTest(),url,"refresh the page");
		WaitUtils.waitForElementEnable(getTest(),url,3);
	}
	
	
	public void chooseFlight() {
		ClickUtils.clickbuttonOrFail(getTest(),LOC_IN_ChooseFlight,"choose the flight");
		waitUtils.wait(3);
	}
	
	
	public void nametextbox(String Value) throws InterruptedException {
		webElement nametext = checkUtils.getElement(getTest(),Loc_IN_Name);
		reporter.report("FillName","writing in to the box");
	}
	
	public void city(String Value) throws InterruptedException {
		webElement citytext = checkUtils.getElement(getTest(),Loc_IN_city);
		reporter.report("city text","writing in to the  city name in the box");
	}
	
	public void zipcode(String Value) throws InterruptedException {
		webElement zipcode = checkUtils.getElement(getTest(),Loc_IN_zipcode);
		reporter.report("zipcode","writing the zipcode  in to the box");
	}
	
	public void payment(String Value) throws InterruptedException {
		webElement cccard = checkUtils.getElement(getTest(),Loc_IN_CCcard);
		reporter.report("FillName","writing in to the box");
	}
	
	public void Nameoncard(String Value) throws InterruptedException {
		webElement nameoncard = checkUtils.getElement(getTest(),Loc_IN_Nameoncard);
		reporter.report("Name on card ","writing in to the box");
	}
	
	public void click_checkbox() {
		ClickUtils.clickbuttonOrFail(getTest(),LOC_IN_Checkbox,"choose the checkbox");
		waitUtils.wait(3);
	}
	
	public void purchase_flight() {
		ClickUtils.clickbuttonOrFail(getTest(),LOC_IN_purchaseFlight,"choose the checkbox");
		waitUtils.wait(3);
	}
}
	
}
