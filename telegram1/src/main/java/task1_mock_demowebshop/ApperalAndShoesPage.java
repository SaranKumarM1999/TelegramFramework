package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApperalAndShoesPage {
	
	public ApperalAndShoesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//@private items
	
		//sortby list link dropdown list
		@FindBy(name = "products-orderby")
		private WebElement sortbysection;
		
		//display size link dropdown
		@FindBy(name = "products-pagesize")
		private WebElement displaysection;
		
		//products view grid type or portryte
		@FindBy(name = "products-viewmode")
		private WebElement viewassection;
		
		                      /*----products link-----*/
		
		//blue jeans product
		@FindBy(linkText = "Blue Jeans")
		private WebElement Bluejeansproduct;
		
		//Blue and green Sneaker product
		@FindBy(linkText = "Blue and green Sneaker")
		private WebElement BlueandgreenSneakerproduct;
		
		//Casual Golf Belt product
		@FindBy(linkText = "Casual Golf Belt")
		private WebElement CasualGolfBeltproduct;
		
		//50's Rockabilly Polka Dot Top JR Plus Size product
		@FindBy(partialLinkText  = "50's Rockabilly Polka Dot")
		private WebElement rockabillyproduct;
		
		//Denim Short with Rhinestones product
		@FindBy(partialLinkText = "Denim Short with Rhine")
		private WebElement DenimShortproduct;
		//private data over
		
		
		//---------------************************--------------------------//
		
			//getter help starts

		public WebElement getSortbysection() {
			return sortbysection;
		}

		public WebElement getDisplaysection() {
			return displaysection;
		}

		public WebElement getViewassection() {
			return viewassection;
		}

		public WebElement getBluejeansproduct() {
			return Bluejeansproduct;
		}

		public WebElement getBlueandgreenSneakerproduct() {
			return BlueandgreenSneakerproduct;
		}

		public WebElement getCasualGolfBeltproduct() {
			return CasualGolfBeltproduct;
		}

		public WebElement getRockabillyproduct() {
			return rockabillyproduct;
		}

		public WebElement getDenimShortproduct() {
			return DenimShortproduct;
		}

}
