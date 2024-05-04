package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	//constructor
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//elements present in register page
	
	//gender male
	@FindBy(id = "gender-male")
	private WebElement gender_male;

	public WebElement getGender_male() {
		return gender_male;
	}
	//gender female
	@FindBy(id = "gender-female")
	private WebElement gender_female;

	public WebElement getGender_female() {
		return gender_female;
	}
	//first name
	@FindBy(name = "FirstName")
	private WebElement first_name;

	public WebElement getFirst_name() {
		return first_name;
	}
	//last name
	@FindBy(name = "LastName")
	private WebElement last_name;
	
	public WebElement getLast_name() {
		return last_name;
	}
	//email
	@FindBy(id = "Email")
	private WebElement emailid;

	public WebElement getEmailid() {
		return emailid;
	}
	//password
	@FindBy(name = "Password")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	//confrim password
	@FindBy(name = "ConfirmPassword")
	private WebElement ConfirmPassword;

	public WebElement getConfirmPassword() {
		return ConfirmPassword;
	}
	//register button
	@FindBy(id = "register-button")
	private WebElement register_button;

	public WebElement getRegister_button() {
		return register_button;
	}

}
