package Nduduzo.PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	
	
	String url="https://www.ultimateqa.com/automation/";
	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void goTo() {
		
		driver.get(url);
				
	}
	
	public String getTitle() {
		
		return driver.getTitle();
	}
	
	

}
