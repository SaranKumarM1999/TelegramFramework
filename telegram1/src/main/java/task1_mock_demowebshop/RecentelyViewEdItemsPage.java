package task1_mock_demowebshop;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecentelyViewEdItemsPage {
 public RecentelyViewEdItemsPage(WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 
 //objects present in page
 ////h1[.='Recently viewed products']
 @FindBy(xpath = "//h1[.='Recently viewed products']")
 private WebElement recentelyvieweditemstext;

public WebElement getRecentelyvieweditemstext() {
	return recentelyvieweditemstext;
}
 
}
