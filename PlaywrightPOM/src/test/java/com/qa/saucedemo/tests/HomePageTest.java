package com.qa.saucedemo.tests;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.microsoft.playwright.Page;
import com.qa.saucedemo.factory.PlaywrightFactory;
import com.qa.saucedemo.pages.HomePage;

public class HomePageTest {
	
	PlaywrightFactory pf; 
	Page page; //Creating own page ref here in this class
	
	//creating a reference for on home phone page 
	
	HomePage homePage; 
	
	//@Before annotation	
	@BeforeTest	
	
	public void setUp() {
		
		pf = new PlaywrightFactory(); 
		page = pf.initBrowser("chromium"); //storing the page reference that's returned from the PW factory class		
		homePage = new HomePage(page); 
				
	}
	
	@Test
	public void homePageTitleTest() {
		
		String actualTitle = homePage.getHomePageTitle(); 
		Assert.assertEquals(actualTitle, "Swag Labs");
	}
	
	@Test
	public void homePageURLTest() {
		String actualURL = homePage.getHomePageUrl(); 
		Assert.assertEquals(actualURL, "https://www.saucedemo.com/");
	}

	@AfterTest
	public void tearDown() {
		
		page.context().browser().close();
		
	}

}
