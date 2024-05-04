package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnCheapComputerPage {
	//constructor
	public BuildYourOwnCheapComputerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	// Build your own cheap computer
	//processor
	@FindBy(id = "product_attribute_72_5_18_65")
	private WebElement fastprocessoroptin;

	public WebElement getFastprocessoroptin() {
		return fastprocessoroptin;
	}
	
	//RAM
	@FindBy(id = "product_attribute_72_6_19_55")
	private WebElement fourgbramoption;

	public WebElement getFourgbramoption() {
		return fourgbramoption;
	}
	//hard disk
	@FindBy(id = "product_attribute_72_3_20_58")
	private WebElement fourhundredgbvarient;

	public WebElement getFourhundredgbvarient() {
		return fourhundredgbvarient;
	}
	//software
	@FindBy(id = "product_attribute_72_8_30_94")
	private WebElement officeusevarient;

	public WebElement getOfficeusevarient() {
		return officeusevarient;
	}
	//quantity
	@FindBy(id = "addtocart_72_EnteredQuantity")
	private WebElement quantitycount;
	public WebElement getQuantitycount() {
		return quantitycount;
	}

	//add to cart button
	@FindBy(id = "add-to-cart-button-72")
	private WebElement addtocartbutton;

	public WebElement getAddtocartbutton() {
		return addtocartbutton;
	}
	//add to compare 
	@FindBy(xpath = "//input[@value=\"Add to compare list\"]")
	private WebElement addtocomparebutton;

	public WebElement getAddtocomparebutton() {
		return addtocomparebutton;
	}
}
