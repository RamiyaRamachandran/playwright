package base;

import com.microsoft.playwright.*; 

public class BaseTest {
	
      // using protected modifiers for encapsulation, access control and also declaring playright, browser, context, page
	
	protected Playwright playwright;
	protected Browser browser; 
	protected BrowserContext context; 
	protected Page page; 
	
	
	//create method to initialize it
	
	public void setUp() {
		
		playwright = Playwright.create(); 
		browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false)); 
		context = browser.newContext(); 
		page = context.newPage(); 
		
	}

	//for environment tear down and closing the browser
	
	public void tearDown() {
		
		if(browser != null) {
			
			browser.close(); 
		}
		
		if (playwright != null) {
			
			playwright.close(); 
		}
	}
	
}
	