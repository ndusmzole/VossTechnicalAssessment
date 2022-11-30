package Nduduzo.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	WebDriver driver;
	
	
	
	public LogIn(WebDriver driver) {
		
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
	
	
	@FindBy(linkText="Login automation")
	WebElement loginLink;
	
	@FindBy(xpath="//input[@id='user[email]']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='user[password]']")
	WebElement password;
	
	@FindBy(tagName="button")
	WebElement loginBtn;
	
	@FindBy(css=".dropdown__toggle-button")
	WebElement dropDown;
	
	@FindBy(linkText="Sign Out")
	WebElement logoutLink;
	
	public void goTo() {
		loginLink.click();
	}
	
	public void signIn(String email, String password) {
		this.email.sendKeys(email);
		this.password.sendKeys(password);
		this.loginBtn.click();
	}
	
	public void signOut() {
		dropDown.click();
		logoutLink.click();
		
	}

	
	
	
		

}
