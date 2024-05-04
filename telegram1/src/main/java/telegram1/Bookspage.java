package telegram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookspage {
	//constructor load
	public Bookspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//elements present in books page
	
	//  --"Books"-- word is displayed or not 
	@FindBy(xpath = "//div[@class=\"page-title\"]/h1")
	private WebElement pagetitle;

	public WebElement getPagetitle() {
		return pagetitle;
	}
	
	//---computing and internet is displayed
	@FindBy(xpath = "//h2[@class=\"product-title\"]/a[@href=\"/computing-and-internet\"]")
    private WebElement computingandinternetbook;

	public WebElement getComputingandinternetbook() {
		return computingandinternetbook;
	}	
	
}
