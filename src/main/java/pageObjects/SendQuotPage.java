package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testBase.TestBase;

public class SendQuotPage extends TestBase{

	@FindBy(id="email")
	WebElement txt_email;

	@FindBy(id="phone")
	WebElement txt_phone;
	
	@FindBy(id="username")
	WebElement txt_username;
	
	@FindBy(id="password")
	WebElement txt_password;
	
	@FindBy(id="confirmpassword")
	WebElement txt_confirmpassword;
	
	@FindBy(id="Comments")
	WebElement txt_Comments;
	
	@FindBy(id="sendemail")
	WebElement btn_send;
	
	public SendQuotPage() {
	PageFactory.initElements(driver, this);
	}
	
	public void sendQuote() {
		txt_username.sendKeys("Demo User");
		txt_email.sendKeys("DemoUse@demo.com");
		txt_password.sendKeys("123@demo");
		txt_confirmpassword.sendKeys("123@demo");
	}
	
	public void clickOnSendButton() {
		btn_send.click();
	}
}
