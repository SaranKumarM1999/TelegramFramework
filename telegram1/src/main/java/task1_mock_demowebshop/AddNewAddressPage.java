package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewAddressPage {
	public AddNewAddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//elements present in add new address 
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
	//email
	@FindBy(xpath = "//label[.='Email:']")
	private WebElement emailtextfeild;
	public WebElement getEmailtextfeild() {
		return emailtextfeild;
	}
	//company
	@FindBy(xpath = "//label[.='Company:']")
	private WebElement companytextfeild;
	public WebElement getCompanytextfeild() {
		return companytextfeild;
	}
	//address country
	@FindBy(name = "Address.CountryId")
	private WebElement addresscountrydropdown;
	public WebElement getAddresscountrydropdown() {
		return addresscountrydropdown;
	}
	//city
	@FindBy(xpath = "//label[.='City:']")
	private WebElement citytextfeild;
	public WebElement getCitytextfeild() {
		return citytextfeild;
	}
	//address1
	@FindBy(name = "Address.Address1")
	private WebElement address1textfeild;
	public WebElement getAddress1textfeild() {
		return address1textfeild;
	}
	//address2
	@FindBy(name = "Address.Address2")
	private WebElement address2textfeild;
	public WebElement getAddress2textfeild() {
		return address2textfeild;
	}
	//zipcode
	@FindBy(xpath = "//label[.='Zip / postal code:']")
	private WebElement zipcodetextfeild;
	
	public WebElement getZipcodetextfeild() {
		return zipcodetextfeild;
	}

	//phone number
	@FindBy(xpath = "Phone number:")
	private WebElement phonenumbertextfeild;
	public WebElement getPhonenumbertextfeild() {
		return phonenumbertextfeild;
	}
	//save button
	@FindBy(xpath = "//input[@class=\"button-1 save-address-button\"]")
	private WebElement savebuttonaddresspage;
	public WebElement getSavebuttonaddresspage() {
		return savebuttonaddresspage;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
