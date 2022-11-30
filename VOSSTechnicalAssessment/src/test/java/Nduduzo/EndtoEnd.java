package Nduduzo;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Nduduzo.PageObjects.FakePricingPage;
import Nduduzo.PageObjects.Forms;
import Nduduzo.PageObjects.LandingPage;
import Nduduzo.PageObjects.LogIn;
import Nduduzo.TestComponent.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class EndtoEnd extends BaseClass {
	
	WebDriver driver;
	LandingPage landing_page;
	LogIn l;
	
	@Test
	
	public void Q1() {
		
		// Q1 Browse to URL and maximize the browser window
				//String url="https://www.ultimateqa.com/automation/";
				
				//driver.get(url);
				
				//LandingPage landing_page = launchWebsite();
				driver = initializeDriver();
				landing_page = new LandingPage(driver);
				landing_page.goTo();
				
				// Q1 - Part2 - Verify Page Title
				String title = "Automation Practice - Ultimate QA";
				
				boolean isTitleValid = landing_page.getTitle().equalsIgnoreCase(title);
				
				System.out.println(isTitleValid);
		
	}
	

	@Test
	public  void Q2() {
	
		// Q4 login
		
		
	
		
			

	}
	
	@Test void Q3(){
		
		driver.manage().window().maximize();
		
	}
	
	@Test void Q4(){
		l = new LogIn(driver);
		l.goTo();
		l.signIn("Testing11@gmail.com", "@utomation1");
					
		}
	
	@Test void Q5(){
		// Q5 Log out
		l.signOut();	
		
	}
	
	@Test void Q6(){
		// Q6
		
				landing_page.goTo();
				String name = "Test";
				String text = "testing Testing";
				String capture = "13";
				
				Forms fill = new Forms(driver);
				fill.goTo();
				fill.fillForm1(name, text);
				fill.fillForm2(name, capture, text);
		
	}
	@Test void Q7(){
		
		// Q7
				landing_page.goTo();
				
				FakePricingPage basic = new FakePricingPage(driver);
				basic.goTo();
				basic.purchaseBasic();
		
	}
	
	public LandingPage launchWebsite() {
		driver = initializeDriver();
		LandingPage landing_page = new LandingPage(driver);
		landing_page.goTo();
		
		return landing_page;
	}
	
	

}
