package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnPC {
	//constructor

	public BuildYourOwnPC(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//elements present in build your own pc
	
		//Processor options
		@FindBy(id = "product_attribute_74_5_26_82")
		private WebElement fastoption;
		
		public WebElement getFastoption() {
			return fastoption;
		}

		//Ram varients option
		@FindBy(id = "product_attribute_74_6_27_85")
		private WebElement eightgbramvarient;

		public WebElement getEightgbramvarient() {
			return eightgbramvarient;
		}
		
		//Hard disk varient
		@FindBy(id = "product_attribute_74_3_28_87")
		private WebElement fourhundredgb;

		public WebElement getFourhundredgb() {
			return fourhundredgb;
		}
		
		//software type list
		@FindBy(xpath = "//label[.='Other Office Suite  [+40.00]']")
		private WebElement otherofficesuite;

		public WebElement getOtherofficesuite() {
			return otherofficesuite;
		}
		
		//add to cart button 
		@FindBy(id = "add-to-cart-button-74")
		private WebElement addtocartonexpensivepcpage;

		public WebElement getAddtocartonexpensivepcpage() {
			return addtocartonexpensivepcpage;
		}
		
		//email a friend button
		@FindBy(xpath = "//input[@value=\"Email a friend\"]")
		private WebElement emailfriend;

		public WebElement getEmailfriend() {
			return emailfriend;
		}
		//quantity count
		@FindBy(id = "addtocart_74_EnteredQuantity")
		private WebElement quantitycounttextbox;

		public WebElement getQuantitycounttextbox() {
			return quantitycounttextbox;
		}
		//add to compare 
		@FindBy(xpath = "//input[@value=\"Add to compare list\"]")
		private WebElement addtocomparebutton;

		public WebElement getAddtocomparebutton() {
			return addtocomparebutton;
		}
		
		//The product has been added to your cart notification.
		@FindBy(xpath = "//p[@class=\"content\"]")
		private WebElement Theproducthasbeenaddedtocartnotification;

		public WebElement getTheproducthasbeenaddedtocartnotification() {
			return Theproducthasbeenaddedtocartnotification;
		} 
}
