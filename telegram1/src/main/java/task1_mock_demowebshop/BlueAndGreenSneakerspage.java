package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlueAndGreenSneakerspage {
	public BlueAndGreenSneakerspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//blue and green sneaker  product page elements
	
		//size change
		@FindBy(id = "product_attribute_28_7_10")
		private WebElement sizeselectoption;
		
		//color change
		@FindBy(id = "product_attribute_28_1_11_29")
		private WebElement colorchange;
		
		//add to cart button
		@FindBy(id = "add-to-cart-button-28")
		private WebElement addtocartbutton;
		
		//add to wish list button
		@FindBy(id = "add-to-wishlist-button-28")
		private WebElement addtowishbutton;
		
		//email to friend option
		@FindBy(xpath = "//input[@value=\"Email a friend\"]")
		private WebElement emailafrienddbutton;
		
		//add to compare list
		@FindBy(xpath = "//input[@value=\"Add to compare list\"]")
		private WebElement addtocomparelistbutton;
		
		//shopping cart button
		@FindBy(xpath = "//span[.='Shopping cart']")
		private WebElement shoppingcartbutton;
		
		//************************getter method starts******************//

		public WebElement getSizeselectoption() {
			return sizeselectoption;
		}

		public WebElement getColorchange() {
			return colorchange;
		}


		public WebElement getAddtocartbutton() {
			return addtocartbutton;
		}

		public WebElement getAddtowishbutton() {
			return addtowishbutton;
		}

		public WebElement getEmailafrienddbutton() {
			return emailafrienddbutton;
		}

		public WebElement getAddtocomparelistbutton() {
			return addtocomparelistbutton;
		}

		public WebElement getShoppingcartbutton() {
			return shoppingcartbutton;
		}
		//rate your reveiw
		@FindBy(linkText = "Add your review")
		private WebElement rateyourreviewbutton;

		public WebElement getRateyourreviewbutton() {
			return rateyourreviewbutton;
		}
	}

