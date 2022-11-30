package Nduduzo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Nduduzo.PageObjects.LandingPage;
import Nduduzo.PageObjects.LogIn;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestEndToEnd {
	
	WebDriver driver;
	
	@BeforeTest
	public void testSetUp() {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
	}
	
	@Test	
	public void question1() { // Browse to URL https://www.ultimateqa.com/automation/ and verify page Title
		System.out.println("Q1");
//		LandingPage landing_page = new LandingPage(driver);
//		landing_page.goTo();
//		
//		// Q1 - Part2 - Verify Page Title
//		String title = "Automation Practice - Ultimate QA";
//		
//		boolean isTitleValid = landing_page.getTitle().equalsIgnoreCase(title);
//		
//		System.out.println(isTitleValid);
		
		
		
	}
	
	@Test
	public void question2() { // Take screenshot of the page
		System.out.println("Q2");
		
	}
	
	@Test
	public void question3() { // Maximize the browser window
		System.out.println("Q3");
		
	}
	
	@Test
	public void question4() { // Log in to the page via "Login automation"
		driver.get("https://www.ultimateqa.com/automation/");
		System.out.println("Q4");
		LogIn l = new LogIn(driver);
		l.goTo();
		l.signIn("Testing11@gmail.com", "@utomation1");
	
		
	}
	
	@Test
	public void question5() { // Logout from the page
		System.out.println("Q5");
		
	}
	
	@Test
	public void question6() { // Browse to "Fill out forms" page and complete all forms followed by submit action
		System.out.println("Q6");
		
	}
	
	@Test
	public void question7() { // Browse to the "Fake Pricing Page" and Purchase the Basic package
		System.out.println("Q7");
		
	}

}
