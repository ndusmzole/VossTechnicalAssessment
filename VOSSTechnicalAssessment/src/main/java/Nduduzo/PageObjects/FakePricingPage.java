package Nduduzo.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FakePricingPage {
	
	WebDriver driver;
	
	public FakePricingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Fake Pricing Page")
	WebElement fakePricingLink;
	
	@FindBy(xpath="//div[@class='et_pb_pricing_table et_pb_pricing_table_1 et_hover_enabled']//a[@class='et_pb_button et_pb_pricing_table_button'][normalize-space()='Purchase']")
	WebElement basic;
	
	public void goTo() {
		fakePricingLink.click();
	}
	
	public void purchaseBasic() {
		basic.click();		
	}

}
