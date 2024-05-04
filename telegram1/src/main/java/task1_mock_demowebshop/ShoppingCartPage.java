package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	// shopping cart class 
		public ShoppingCartPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//quantative count
		@FindBy(xpath = "//input[@class=\"qty-input valid\"]")
		private WebElement quantityoption;
		
		public WebElement getQuantityoption() {
			return quantityoption;
		}
		
		//updatecart for refresh
		@FindBy(name = "updatecart")
		private WebElement updatecartlink;
		
		public WebElement getUpdatecartlink() {
			return updatecartlink;
		}
		
		//CountryId select
		@FindBy(id = "CountryId")
		private WebElement CountryIdselect;
		
		public WebElement getCountryIdselect() {
			return CountryIdselect;
		}
		
		//StateProvinceId select
		@FindBy(id = "StateProvinceId")
		private WebElement StateProvinceIdselect;
		
		public WebElement getStateProvinceIdselect() {
			return StateProvinceIdselect;
		}
		
		//ZipPostalCode textfeild
		@FindBy(name = "ZipPostalCode")
		private WebElement ZipPostalCodetextfeild;
		
		public WebElement getZipPostalCodetextfeild() {
			return ZipPostalCodetextfeild;
		}
		
		//estimateshipping button
		@FindBy(name = "estimateshipping")
		private WebElement estimateshippingbutton;
		
		public WebElement getEstimateshippingbutton() {
			return estimateshippingbutton;
		}
		
		//termsofservice check box
		@FindBy(id = "termsofservice")
		private WebElement termsofservicecheckbox;
		
		public WebElement getTermsofservicecheckbox() {
			return termsofservicecheckbox;
		}
		
		//checkout button
		@FindBy(id = "checkout")
		private WebElement checkoutbutton;
		
		public WebElement getCheckoutbutton() {
			return checkoutbutton;
		}
		
		//verifying shopping cart page is opened or not
		@FindBy(xpath = "//div[@class=\"page-title\"]/h1")
		private WebElement shoppingcartpagepagedisplayedornot;

		public WebElement getShoppingcartpagepagedisplayedornot() {
			return shoppingcartpagepagedisplayedornot;
		}
			
}
