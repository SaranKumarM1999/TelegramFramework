package task1_mock_demowebshop;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;

public class IntegrationTest extends BaseClass{
	
	
	
	//test no.25
	//verify user can able to move from one section to other section
	@Test(groups = "integration")
	public void ConnectionTest_025() {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getApparelShoesection().click();
		ApperalAndShoesPage apperal=new ApperalAndShoesPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(apperal.getBlueandgreenSneakerproduct()));
		apperal.getBlueandgreenSneakerproduct().click();
		BlueAndGreenSneakerspage sneakers=new BlueAndGreenSneakerspage(driver);
		//wait.until(ExpectedConditions.elementToBeClickable(sneakers.getRateyourreviewbutton()));
		sneakers.getRateyourreviewbutton().click();
		RateYourReveiwpage rate=new RateYourReveiwpage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(rate.getTeviewtitlebox()));
		rate.getTeviewtitlebox().sendKeys("shoe");
		rate.getReviewtextbox().sendKeys("waste product");
		rate.getRatingoption2().click();
		rate.getSubmitbuttonlink().click();
		//driver.quit();
		System.out.println("test no.25 passed");
	}
	//Test no.26
	// verify user can able subscribe for newsletter.
	@Test(groups = "functional")
	public void SubscribeforNewsLetterTest() {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getNewlettersubscribetextfeild().sendKeys("rockyboy3007@gmail.com");
		welcome.getNewslettersubscribebutton().click();
		String subscriberesult=welcome.getThankyousubscriberesult().getText();
		System.out.println(subscriberesult);
		//driver.quit();

	}
	
}
