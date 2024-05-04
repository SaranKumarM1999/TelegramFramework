package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressAddPage {
	public AddressAddPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//elements present in address add page
	
	//add new button
	@FindBy(xpath = "//input[@value=\"Add new\"]")
	private WebElement addnewaddresslink;

	public WebElement getAddnewaddresslink() {
		return addnewaddresslink;
	}

}
