package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RateYourReveiwpage {
	public RateYourReveiwpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//objects present in element
	//review title
	@FindBy(id = "AddProductReview_Title")
	private WebElement reviewtitlebox;
	public WebElement getTeviewtitlebox() {
		return reviewtitlebox;
	}
	//review text
	@FindBy(id = "AddProductReview_ReviewText")
	private WebElement reviewtextbox;
	public WebElement getReviewtextbox() {
		return reviewtextbox;
	}
	//star rating 2star
	@FindBy(id = "addproductrating_2")
	private WebElement ratingoption2;
	public WebElement getRatingoption2() {
		return ratingoption2;
	}
	//star rating 4
	@FindBy(id = "addproductrating_4")
	private WebElement ratingoption4;
	public WebElement getRatingoption4() {
		return ratingoption4;
	}
	//submit button
	@FindBy(name = "add-review")
	private WebElement submitbuttonlink;
	public WebElement getSubmitbuttonlink() {
		return submitbuttonlink;
	}
}
