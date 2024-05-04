package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	//constructor load
		public Welcomepage(WebDriver driver) {
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
			
			//gift card add to cart link
			@FindBy(xpath = "//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/2/1/1    ');return false;\"]")
			private WebElement laptoplink;

			public WebElement getLaptoplink() {
				return laptoplink;
			}
			
			//wishlist link
			@FindBy(xpath = "//span[.='Wishlist']")
			private WebElement wishlistlinkbutto;

			public WebElement getWishlistlinkbutto() {
				return wishlistlinkbutto;
			}
			//rockyboy30@gmail.com link to edit customer info
			@FindBy(linkText = "rockyboy30@gmail.com")
			private WebElement myaccountinfolink;

			public WebElement getMyaccountinfolink() {
				return myaccountinfolink;
			}

			//contact us link
			@FindBy(linkText = "Contact us")
			private WebElement contactuslink;

			public WebElement getContactuslink() {
				return contactuslink;
			}
			// welcome to our store word present in welcome page
			@FindBy(xpath = "//h2[@class=\"topic-html-content-header\"]")
			private WebElement welcometoourstoretext;

			public WebElement getWelcometoourstoretext() {
				return welcometoourstoretext;
			}
			
			//fallow us link present
			@FindBy(xpath = "//h3[.='Follow us']")
			private WebElement fallowuslinktext;

			public WebElement getFallowuslinktext() {
				return fallowuslinktext;
			}
			//Recently viewed products link
			@FindBy(linkText = "Recently viewed products")
			private WebElement Recentlyviewedproductslink;

			public WebElement getRecentlyviewedproductslink() {
				return Recentlyviewedproductslink;
			}
			//demowebshop logo
			@FindBy(xpath = "//img[@alt=\"Tricentis Demo Web Shop\"]")
			private WebElement demowebshoplogo;

			public WebElement getDemowebshoplogo() {
				return demowebshoplogo;
			}
			//news letter subscribe
			@FindBy(id = "newsletter-email")
			private WebElement newlettersubscribetextfeild;

			public WebElement getNewlettersubscribetextfeild() {
				return newlettersubscribetextfeild;
			}
			//newsletter-subscribe-button
			@FindBy(id = "newsletter-subscribe-button")
			private WebElement newslettersubscribebutton;

			public WebElement getNewslettersubscribebutton() {
				return newslettersubscribebutton;
			}
			//thankyousubscribe
			@FindBy(xpath = "//div[.='Thank you for signing up! A verification email has been sent. We appreciate your interest.']")
			private WebElement thankyousubscriberesult;

			public WebElement getThankyousubscriberesult() {
				return thankyousubscriberesult;
			}
			
			//logout link
			@FindBy(linkText = "Log out")
			private WebElement logoutlink;

			public WebElement getLogoutlink() {
				return logoutlink;
			}
}
			
