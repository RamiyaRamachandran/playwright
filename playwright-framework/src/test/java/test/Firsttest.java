package test;

import base.BaseTest;  // Import the BaseTest class
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Firsttest extends BaseTest{
	
	public void testExamplePage() {
		//navigate to this url
		page.navigate("http://uitestingplayground.com/"); 
		
		//check if an element contains a specific text
		page.locator("text = Resources").click(); 
		//page.click(null); 
		
		//check if the element is visible
		boolean isElementVisible = page.locator("h1").isVisible(); 
		
		//Assert that the elementis visible
		assertTrue (isElementVisible, "Element is not visible"); 
		
	}
	
}
