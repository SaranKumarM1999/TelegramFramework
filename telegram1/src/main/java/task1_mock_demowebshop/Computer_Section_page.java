package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Computer_Section_page {
	//class for computer items 
		public Computer_Section_page(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//elements present in the page
		
		//build your own pc cheap link
		@FindBy(linkText = "Build your own cheap computer")
		private WebElement buildyourownpccheaplink;

		public WebElement getBuildyourownpccheaplink() {
			return buildyourownpccheaplink;
		}
		
		//Build your own computer
		@FindBy(linkText = "Build your own computer")
		private WebElement buildyourowncomputerlink;

		public WebElement getBuildyourowncomputerlink() {
			return buildyourowncomputerlink;
		}
		
		//Build your own expensive computer
		@FindBy(linkText = "Build your own expensive computer")
		private WebElement buildyourownexpensivecomputer;

		public WebElement getBuildyourownexpensivecomputer() {
			return buildyourownexpensivecomputer;
		}
		
		//Simple Computer link
		@FindBy(linkText = "Simple Computer")
		private WebElement simplecomputerlink;

		public WebElement getSimplecomputerlink() {
			return simplecomputerlink;
		}

}
