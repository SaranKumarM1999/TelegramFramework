package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactUsPage {
public ContactUsPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
//objects present in page
//enquiry box
@FindBy(id = "Enquiry")
private WebElement enquirybox;
public WebElement getEnquirybox() {
	return enquirybox;
}
//send button
@FindBy(name = "send-email")
private WebElement sendbuttonlink;
public WebElement getSendbuttonlink() {
	return sendbuttonlink;
}

}
