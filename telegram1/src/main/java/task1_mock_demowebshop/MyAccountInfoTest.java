package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountInfoTest {
	//constructor
	
	public MyAccountInfoTest(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//objects present in page
	
	//first name
	@FindBy(xpath = "//label[.='First name:']")
	private WebElement firstnametextfeild;

	public WebElement getFirstnametextfeild() {
		return firstnametextfeild;
	}
	//last name
	@FindBy(xpath = "//label[.='Last name:']")
	private WebElement lastnametextfeild;

	public WebElement getLastnametextfeild() {
		return lastnametextfeild;
	}
	//email rename
	@FindBy(xpath = "//label[.='Email:']")
	private WebElement emailidtextfeild;

	public WebElement getEmailidtextfeild() {
		return emailidtextfeild;
	}
	//save button account info
	@FindBy(name = "save-info-button")
	private WebElement savebuttononaccountinfo;

	public WebElement getSavebuttononaccountinfo() {
		return savebuttononaccountinfo;
	}
	
	//To change password elements
	//change password button link
	@FindBy(linkText = "Change password")
	private WebElement Changepasswordlink;

	public WebElement getChangepasswordlink() {
		return Changepasswordlink;
	}
	//OldPassword link
	@FindBy(id = "OldPassword")
	private WebElement OldPasswordtextfeild;

	public WebElement getOldPasswordtextfeild() {
		return OldPasswordtextfeild;
	}
	//NewPassword
	@FindBy(id = "NewPassword")
	private WebElement NewPasswordtextfeild;

	public WebElement getNewPasswordtextfeild() {
		return NewPasswordtextfeild;
	}
	//confirm password
		@FindBy(xpath = "//label[.='Confirm password:']")
		private WebElement confirmpasswordtextfeild;

		public WebElement getConfirmpasswordtextfeild() {
			return confirmpasswordtextfeild;
		}
		// change password button link
		@FindBy(xpath = "//input[@value=\"Change password\"]")
		private WebElement changepasswordbutton;

		public WebElement getChangepasswordbutton() {
			return changepasswordbutton;
		}
		//password changed successfully
		@FindBy(xpath = "//div[@class=\"result\"]")
		private WebElement passwordchangedsuccessfullytext;

		public WebElement getPasswordchangedsuccessfullytext() {
			return passwordchangedsuccessfullytext;
		}
}
