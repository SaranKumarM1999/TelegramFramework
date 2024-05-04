package telegram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	//constructor load
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//private data
		@FindBy(linkText = "Register")
		private WebElement registerlink;
		
		@FindBy(linkText = "Log in")
		private WebElement loginlink;
		
		@FindBy(xpath = "//span[.='Shopping cart']")
		private WebElement shoppingcart;
		
		@FindBy(id="small-searchterms")
		private WebElement searchtextfield;
		
		@FindBy(css = "[value='Search']")
		private WebElement searchbutton;
		
		@FindBy(partialLinkText = "Computers")
		private WebElement computerssection;
		
		@FindBy(partialLinkText = "Electronics")
		private WebElement electronicssection;
		
		@FindBy(partialLinkText = "Apparel & Shoes")
		private WebElement ApparelShoesection;
		
		@FindBy(partialLinkText = "Digital downloads")
		private WebElement Digitaldownloadssection;
		
		@FindBy(partialLinkText = "Jewelry")
		private WebElement Jewelrysection;
		
		@FindBy(partialLinkText = "Gift Cards")
		private WebElement GiftCardssection;
		
		@FindBy(partialLinkText = "Books")
		private WebElement Bookssection;
		
		@FindBy(linkText = "My account")
		private WebElement myaccountsection;
		
		@FindBy(linkText = "Orders")
		private WebElement Orderssection;
		
		@FindBy(linkText = "Addresses")
		private WebElement Addressessection;
		
		//my orders link
		@FindBy(linkText = "Orders")
		private WebElement orderslink;

		public WebElement getRegisterlink() {
			return registerlink;
		}

		public WebElement getLoginlink() {
			return loginlink;
		}

		public WebElement getShoppingcart() {
			return shoppingcart;
		}

		public WebElement getSearchtextfield() {
			return searchtextfield;
		}

		public WebElement getSearchbutton() {
			return searchbutton;
		}

		public WebElement getComputerssection() {
			return computerssection;
		}

		public WebElement getElectronicssection() {
			return electronicssection;
		}

		public WebElement getApparelShoesection() {
			return ApparelShoesection;
		}

		public WebElement getDigitaldownloadssection() {
			return Digitaldownloadssection;
		}

		public WebElement getJewelrysection() {
			return Jewelrysection;
		}

		public WebElement getGiftCardssection() {
			return GiftCardssection;
		}

		public WebElement getBookssection() {
			return Bookssection;
		}

		public WebElement getMyaccountsection() {
			return myaccountsection;
		}

		public WebElement getOrderssection() {
			return Orderssection;
		}

		public WebElement getAddressessection() {
			return Addressessection;
		}

		public WebElement getOrderslink() {
			return orderslink;
		}
		
	
	

}
