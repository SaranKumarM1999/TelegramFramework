package telegram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//contructor
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//elements prsent in login page
	
	//email link
	@FindBy(id = "Email")
	private WebElement emailtextfeildlink;

	public WebElement getEmailtextfeildlink() {
		return emailtextfeildlink;
	}
	
	//password link
	@FindBy(id = "Password")
	private WebElement passwordtextfeildlink;

	public WebElement getPasswordtextfeildlink() {
		return passwordtextfeildlink;
	}
	
	//submit button
	@FindBy(xpath = "//input[@value=\"Log in\"]")
	private WebElement submitbuttonloginpage;

	public WebElement getSubmitbuttonloginpage() {
		return submitbuttonloginpage;
	}
	

}
