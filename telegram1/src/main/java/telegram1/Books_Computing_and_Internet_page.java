package telegram1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Books_Computing_and_Internet_page {
	//constructor
	public Books_Computing_and_Internet_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//elements present in computing-and-internet-book  page
	
	//checking computing-and-internet-book
	@FindBy(xpath = "//div[@class=\"overview\"]/div[@class=\"product-name\"]")
	private WebElement computingAndInternetBook;

	public WebElement getComputingAndInternetBook() {
		return computingAndInternetBook;
	}

}
