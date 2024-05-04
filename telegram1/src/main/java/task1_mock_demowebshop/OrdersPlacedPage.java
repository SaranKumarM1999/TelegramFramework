package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPlacedPage {
	public OrdersPlacedPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//objects present in page
	//download link for ordered product
	@FindBy(xpath = "//input[@onclick=\"setLocation('/orderdetails/1693984')\"]")
	private WebElement invoicedownloadlink;

	public WebElement getInvoicedownloadlink() {
		return invoicedownloadlink;
	}

}
