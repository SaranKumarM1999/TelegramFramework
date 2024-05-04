package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailAFriend {
	//constructor
	public EmailAFriend(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//elements present in this page
	@FindBy(id = "FriendEmail")
	private WebElement friendemailtextfeild;

	public WebElement getFriendemailtextfeild() {
		return friendemailtextfeild;
	}
	
	//friend email id
	@FindBy(id = "YourEmailAddress")
	private WebElement youremailaddresstextfeild;

	
	public WebElement getYouremailaddresstextfeild() {
		return youremailaddresstextfeild;
	}

	//send email
	@FindBy(xpath = "//input[@class=\"button-1 send-email-a-friend-button\"]")
	private WebElement sendmailbutton;

	public WebElement getSendmailbutton() {
		return sendmailbutton;
	}
	

}
