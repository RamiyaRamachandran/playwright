package com.qa.saucedemo.factory;

import com.microsoft.playwright.*;

public class PlaywrightFactory {
	
	//Creating reference variables 
	
	Playwright playwright; 
	Browser browser; 
	BrowserContext browserContext; 
	Page page; 
	
	public Page initBrowser(String browserName) {
			
		
		System.out.println("The name of the browser is: " + browserName); 
		
		playwright = Playwright.create(); 
		
		//Use multiple browsers
		switch (browserName) {
		case "chromium":
			browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)); 
		break; 
		case "safari":
			browser = playwright.webkit().launch(new BrowserType.LaunchOptions().setHeadless(false)); 
			break; 
		case "firefox":
			browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false)); 
			break; 
			
		default:
			System.out.println("Please use only the specified browsers like Chromium, Safari or Firefox!"); 
			break;
		
		}		
		
		
		browserContext = browser.newContext(); 
		
		page = browserContext.newPage(); 
		
		page.navigate("https://www.saucedemo.com/"); 
		
		return page; //returning the page class reference
		
		
	}
	
	
	
		
		
	
	
	
	
	
}
