package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerSectionPage {
	//Computers page section class
		public ComputerSectionPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//elements links present in page 
		
		//Desktops section
		@FindBy(xpath = "//img[@alt=\"Picture for category Desktops\"]")
		private WebElement desktopsectiononcomputerspage;

		public WebElement getDesktopsectiononcomputerspage() {
			return desktopsectiononcomputerspage;
		}
		
		//Notebooks section
		@FindBy(xpath = "//img[@alt=\"Picture for category Notebooks\"]")
		private WebElement notebookssectiononcomputerspage;

		public WebElement getNotebookssectiononcomputerspage() {
			return notebookssectiononcomputerspage;
		}
		
		//Accessories section
		@FindBy(xpath = "//img[@alt=\"Picture for category Accessories\"]")
		private WebElement accessoriessectiononcomputerspage;
		
		public WebElement getAccessoriessectiononcomputerspage() {
			return accessoriessectiononcomputerspage;
		}
		
		//desktops page displayed or not
		@FindBy(xpath = "//div[@class=\"page-title\"]/h1")
		private WebElement desktoppagedisplayed;

		public WebElement getDesktoppagedisplayed() {
			return desktoppagedisplayed;
		}

}
