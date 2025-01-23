package test;

import base.BaseTest;  // Import the BaseTest class
import org.junit.jupiter.api.Test;

import com.microsoft.playwright.Locator;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Firsttest extends BaseTest{
	
	public void testExamplePage() {
		//navigate to this url
		page.navigate("https://ecommerce-playground.lambdatest.io/index.php"); 
		System.out.println(page.title()); 
		Locator myAccount = page.locator("//a[contains(.,'My account')][@role='button']");
		myAccount.hover(); 
		
		//Locates the login and clicks
		page.locator("//a[contains(.,'Login')]").click(); 
		
		//Ensures that the page title is Account LOgin
		assertThat(page).hasTitle("Account Login"); 
	
		//it finds the text box that says place holder value as email address and fills in the value 
		page.getByPlaceholder("E-Mail Address").fill("learnbuildbreak"); 
		
		page.getByPlaceholder("Password").fill("Learntocode"); 
		
		//clicks on the button named login
		page.click("//input[@value='Login']"); 
		
	}
	
}
