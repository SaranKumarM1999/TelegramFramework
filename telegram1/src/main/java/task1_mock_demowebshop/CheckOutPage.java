package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage {
	//check out page load
		public CheckOutPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//elemnets present in the page
		@FindBy(id = "billing-address-select")
		private WebElement billingaddresschoose;
		
		public WebElement getBillingaddresschoose() {
			return billingaddresschoose;
		}

		//billing address continue button
		@FindBy(xpath = "//input[@onclick=\"Billing.save()\"]")
		private WebElement billingaddresscontinuebuttom;
		
		public WebElement getBillingaddresscontinuebuttom() {
			return billingaddresscontinuebuttom;
		}

		//billing address
		@FindBy(xpath = "//div[@id='checkout-step-billing']//input[@class=\"button-1 new-address-next-step-button\"]")
		private WebElement continuebutton;
		
		public WebElement getContinuebutton() {
			return continuebutton;
		}
		
		//billing adress continue button
		@FindBy(xpath = "//input[@onclick=\"Billing.save()\"]")
		private WebElement shippingaddressbutton;
		
		public WebElement getShippingaddressbutton() {
			return shippingaddressbutton;
		}
		
		//shipping address choose option
		@FindBy(id = "shipping-address-select")
		private WebElement shiipinaddressselect;
		
		public WebElement getShiipinaddressselect() {
			return shiipinaddressselect;
		}

		//shipping address continue button
		@FindBy(xpath = "//input[@onclick=\"Shipping.save()\"]")
		private WebElement shippingaddresscontinuebutton;
		
		public WebElement getShippingaddresscontinuebutton() {
			return shippingaddresscontinuebutton;
		}

		//shipping method
		@FindBy(id = "shippingoption_1")
		private WebElement shippingmethodselect;
		
		public WebElement getShippingmethodselect() {
			return shippingmethodselect;
		}	
		
		//shipping method continue button
		@FindBy(xpath = "//input[@onclick=\"ShippingMethod.save()\"]")
		private WebElement shippingmethodcontinue;
		
		public WebElement getShippingmethodcontinue() {
			return shippingmethodcontinue;
		}
		
		//cash on delivery
		@FindBy(xpath = "//label[.='Cash On Delivery (COD) (7.00)']")
		private WebElement cashondeliveryoption;
		
		public WebElement getCashondeliveryoption() {
			return cashondeliveryoption;
		}
		
		//cash on delivery continue button
		@FindBy(xpath = "//input[@onclick=\"PaymentMethod.save()\"]")
		private WebElement cashondeliverycontinuebutton;
		
		public WebElement getCashondeliverycontinuebutton() {
			return cashondeliverycontinuebutton;
		}
		
		//payment information
		@FindBy(xpath = "//input[@onclick=\"PaymentInfo.save()\"]")
		private WebElement codinformation;
		
		public WebElement getCodinformation() {
			return codinformation;
		}

		
		//confrim order
		@FindBy(xpath = "//input[@onclick=\"ConfirmOrder.save()\"]")
		private WebElement confirmorder;
		
		public WebElement getConfirmorder() {
			return confirmorder;
		}
		//payment information continue button
		@FindBy(xpath = "//input[@onclick=\"PaymentInfo.save()\"]")
		private WebElement paymentinfocontinuebutton;

		public WebElement getPaymentinfocontinuebutton() {
			return paymentinfocontinuebutton;
		}
		//confirm  order continue button
		@FindBy(xpath = "//input[@onclick=\"ConfirmOrder.save()\"]")
		private WebElement confrimordercontinuebutton;

		public WebElement getConfrimordercontinuebutton() {
			return confrimordercontinuebutton;
		}
}
