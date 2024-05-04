package task1_mock_demowebshop;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;

public class RecentelyViewed extends BaseClass {
	//test no.24
	////verify that "Recently viewed products products" is visible.
	@Test(groups = "integration")
	public void RecentelyViewedItemsTest() {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		Welcomepage welcome=new Welcomepage(driver);
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,1500);");
		welcome.getRecentlyviewedproductslink().click();
		RecentelyViewEdItemsPage recentitemspage=new RecentelyViewEdItemsPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(recentitemspage.getRecentelyvieweditemstext()));
		String recenttext=recentitemspage.getRecentelyvieweditemstext().getText();
		//verify recentely viewed page is opened or not
		//Hard Assert - hard assert will stop if execution is stopped
	
		Assert.assertEquals(recenttext, recenttext);
		//Soft Assert-soft assert will continue if execution is failed
		//SoftAssert soft=new SoftAssert();
		//soft.assertEquals(recenttext, "books");
		SoftAssert actual=new SoftAssert();
		actual.assertEquals(recenttext, "Recently viewed products");
		getwebpagescreenshot(driver);
		
		
		System.out.println(recenttext + " -page opened");
		//driver.quit();
		System.out.println("test no.024 passed");
		actual.assertAll();
	 }
	

}
