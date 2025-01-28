package com.qa.saucedemo.pages;

import com.microsoft.playwright.Page;

public class HomePage {
	
	private Page page; //this ref is from Playwright library. this is private so it cannot be used outside of this class to avoid null point exception errors when used outside accidentally
	
	//Create a ape constructor to reference to the local page variable
	public HomePage(Page page) {
		this.page = page; 
		
	}
	
	//Page action methods. Do not add assertions here it will be done in the HomePageTest class and not in the HomePage.java (page layer)
	//capturing the home page title 
	public String getHomePageTitle() {
		
		String title = page.title(); 
		System.out.println("The title of home page is: " + title); 
		return title; 
		
	}
	
	public String getHomePageUrl() {
		
		String url = page.url();
		System.out.println("The url of the home page is: " + url); 
		return url; 
	}
	
	
	

}
