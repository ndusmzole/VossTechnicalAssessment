package Nduduzo.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forms {
	
	WebDriver driver;
	
	public Forms(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	// Form Link
	@FindBy(xpath="//a[normalize-space()='Fill out forms']")
	WebElement toFormFill;
	
	// Form 1
	
	@FindBy(xpath="//input[@id='et_pb_contact_name_0']")
	WebElement input1;
	
	@FindBy(xpath="//textarea[@id='et_pb_contact_message_0']")
	WebElement textarea1;
	
	@FindBy(xpath="//div[@id='et_pb_contact_form_0']//button[@name='et_builder_submit_button'][normalize-space()='Submit']")
	WebElement button1;
	
	
	// Form 2
	
	@FindBy(xpath="//input[@id='et_pb_contact_name_1']")
	WebElement input2;
	
	@FindBy(xpath="//textarea[@id='et_pb_contact_message_1']")
	WebElement textarea2;
	
	@FindBy(xpath="//input[@name='et_pb_contact_captcha_1']")
	WebElement input3;
	
	@FindBy(xpath="//div[@id='et_pb_contact_form_1']//button[@name='et_builder_submit_button'][normalize-space()='Submit']")
	WebElement button2;
	
	public void goTo() {
		toFormFill.click();
	}
	
	public void fillForm1(String name, String text) {
		
		input1.sendKeys(name);
		textarea1.sendKeys(text);
		button1.click();
				
	}
	
public void fillForm2(String name, String capture ,String text) {
		
		input2.sendKeys(name);
		input3.sendKeys(capture);
		textarea2.sendKeys(text);
		button2.click();
				
	}
	
	

}
