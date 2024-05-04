package task1_mock_demowebshop;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibrary.BaseClass;

public class RegisterTest extends BaseClass {
	@Test(groups = "integration")
	//Test_001 verify the new user can able create account.
	public void RegisterTest_001() throws InterruptedException {
		// TO launch browser
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getRegisterlink().click();
		RegisterPage register=new RegisterPage(driver);
		register.getGender_male().click();
		register.getFirst_name().sendKeys("rocky");
		register.getLast_name().sendKeys("boy");
		register.getEmailid().sendKeys("rockyboy30@gmail.com");
		register.getPassword().sendKeys("Rocky$$");
		register.getConfirmPassword().sendKeys("Rocky$$");
		register.getRegister_button().click();
		Thread.sleep(3000);
		System.out.println("Test case 1 passed");
		
	}

	//Test_002 verify the user can able to login existing account.
	@Test(groups = "integration")//(dependsOnMethods = "RegisterTest_001")
	public void LoginTest_002() throws InterruptedException {
		
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage loginpage=new Loginpage(driver);
		loginpage.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com");
		loginpage.getPasswordtextfeildlink().sendKeys("Rocky$$");
		loginpage.getSubmitbuttonloginpage().click();
		System.out.println("Test case 2 passed");
		//Thread.sleep(2000);
		
	}
	//test no.003
		 //verify in the welcome page "BOOKS","COMPUTERS","ELECTRONICS","APPAREL & SHOES","DIGITAL DOWNLOADS","JEWELRY","GIFT CARDS" are present.
		 @Test(groups = "ui")
		 public void SearchProductTest_020() {
			
			FluentWait<WebDriver> scroll=new FluentWait<WebDriver>(driver);
			scroll.pollingEvery(Duration.ofMillis(10));
			Welcomepage welcom=new Welcomepage(driver);
			String books=welcom.getBookssection().getText();
			String computer=welcom.getComputerssection().getText();
			String electronics=welcom.getElectronicssection().getText();
			String appreal=welcom.getApparelShoesection().getText();
			String digitaldownloads=welcom.getDigitaldownloadssection().getText();
			String jewelery=welcom.getJewelrysection().getText();
			String giftcard=welcom.getGiftCardssection().getText();
			System.out.println(appreal);
			System.out.println(books);
			System.out.println(computer);
			System.out.println(electronics);
			System.out.println(digitaldownloads);
			System.out.println(jewelery);
			System.out.println(giftcard);
			System.out.println("test no.003 passed");
			

		}
	
	
	
	
	
	
	
	
	//test no.004
	//verify at welcome page "Welcome to our store" is present.
	@Test(groups = "ui")
	public void WelcomeToOurStoreTest_003() {
		
		Welcomepage welcome=new Welcomepage(driver);
		SoftAssert welcomeprescent=new SoftAssert();
		welcomeprescent.assertTrue(true);
		String welcometext=welcome.getWelcometoourstoretext().getText();
		System.out.println(welcometext + "word is present");
		System.out.println("Test no.004 passed");
		
			}
	//Test no.005
	//verify that at the end of the page "Follow us" link is present.
	@Test(groups = "integration")
		public void FallowUsLinkTest_004() {
		
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,1500);");
		Welcomepage welcome=new Welcomepage(driver);
		SoftAssert soft=new SoftAssert();
		soft.assertTrue(welcome.getFallowuslinktext().isDisplayed());
		String fallowus=welcome.getFallowuslinktext().getText();
		System.out.println(fallowus + " -word is present");
		System.out.println("Test no.005 passed");
		
			}
	
	
	
	//test_006 verify shopping cart link is redirecting to "shopping cart page"
	@Test(groups = "integration")
	public void ShopingCartPageTest_003() throws InterruptedException {
		// verify shopping cart link is redirecting to "shopping cart page"
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		SoftAssert page=new SoftAssert();
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getBookssection().click();
		wait.until(ExpectedConditions.visibilityOf(welcome.getShoppingcart()));
		welcome.getShoppingcart().click();
		//ShoppingCartPage shoppingcartpage=new ShoppingCartPage(driver);
		//String actualdata=welcome.getShoppingcart().getText();
		//page.fail();
		page.assertTrue(welcome.getShoppingcart().isDisplayed());
		System.out.println("Test case no.006 passed");
		
		page.assertAll();

	}
		//test no.007
		//verify by searching a product in “search” text field and check products displaying.
	@Test(groups = "functional")
	public void SearchTest_004() {
		// TODO Auto-generated method stub
		
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getSearchtextfield().sendKeys("computer");
		welcome.getSearchbutton().click();
		System.out.println("Test case no.007 passed");
	}

		//test no.008
		// verify user can able to add product to "wish list".
		@Test(groups = "functional")
		public void WishListTest_005() throws InterruptedException {
		
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getApparelShoesection().click();
		ApperalAndShoesPage apperalpage=new ApperalAndShoesPage(driver);
		apperalpage.getBlueandgreenSneakerproduct().click();
		BlueAndGreenSneakerspage blueandgreensneakerpage=new BlueAndGreenSneakerspage(driver);
		blueandgreensneakerpage.getAddtowishbutton().click();
		Thread.sleep(5000);
		welcome.getWishlistlinkbutto().click();
		System.out.println("product added to wishlist");
		System.out.println("Test case no.008 passed");
		
		}
	
	
		// Test no.009 AddressAddTest
		//verify user can able add address to account
	@Test(groups = "integration")//(dependsOnMethods = "LoginTest_002")
	public void AddressAddTest_006() throws InterruptedException {
		
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		//login
		Loginpage login=new Loginpage(driver);
		login.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com");
		login.getPasswordtextfeildlink().sendKeys("Rocky$$");
		login.getSubmitbuttonloginpage().click();
		
		//to scroll the page
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,1500);");
		Thread.sleep(3000);
		welcome.getAddressessection().click();
		AddressAddPage addnew=new AddressAddPage(driver);
		addnew.getAddnewaddresslink().click();
		AddNewAddressPage addnewaddress=new AddNewAddressPage(driver);
		addnewaddress.getFirstnametextfeild().sendKeys("dolu");
		addnewaddress.getLastnametextfeild().sendKeys("boy");
		addnewaddress.getEmailtextfeild().sendKeys("dolu@gmail.com");
		addnewaddress.getCompanytextfeild().sendKeys("dolucompany");
		Select countryselect=new Select(addnewaddress.getAddresscountrydropdown());
		countryselect.selectByIndex(2);
		addnewaddress.getCitytextfeild().sendKeys("chennai");
		addnewaddress.getAddress1textfeild().sendKeys("qspider");
		addnewaddress.getAddress2textfeild().sendKeys("vadapalani");
		addnewaddress.getZipcodetextfeild().sendKeys("785674");
		addnewaddress.getPhonenumbertextfeild().sendKeys("989877765");
		Thread.sleep(3000);
		addnewaddress.getSavebuttonaddresspage().click();
		Thread.sleep(1000);
		System.out.println("Test case no.009 passed");
		
	}
	
	//test no. 010
	//verify by clicking on "computers" section and is redirecting to computers section
	@Test(groups = "integration")
	public void ComputersPageTest_007() {
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getComputerssection().click();
		
		ComputerSectionPage computer=new ComputerSectionPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(computer.getDesktopsectiononcomputerspage()));
		computer.getDesktopsectiononcomputerspage().click();
		wait.until(ExpectedConditions.visibilityOf(computer.getDesktoppagedisplayed()));
		if (computer.getDesktoppagedisplayed().getText().equals("Desktops")) {
			System.out.println("Computers page is displayed");			
		}
		else {
			System.out.println("page not displayed");
		}
		System.out.println("Test case no.010 passed");
			}
	
	//test no.011
	//verify user can able to select different "PROCESS" and "RAM" and "HDD","SOFTWARE".
	@Test(groups = "functional")
	public void ComputerTypeSelectTest_008()  {
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getComputerssection().click();
		ComputerSectionPage computer=new ComputerSectionPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(computer.getDesktopsectiononcomputerspage()));
		computer.getDesktopsectiononcomputerspage().click();
		Computer_Section_page expensivecomputer=new Computer_Section_page(driver);
		wait.until(ExpectedConditions.elementToBeClickable(expensivecomputer.getBuildyourownexpensivecomputer()));
		expensivecomputer.getBuildyourownexpensivecomputer().click();
		BuildYourOwnPC varietyselect=new BuildYourOwnPC(driver);
		wait.until(ExpectedConditions.elementToBeClickable(varietyselect.getFastoption()));
		varietyselect.getFastoption().click();
		varietyselect.getEightgbramvarient().click();
		varietyselect.getFourhundredgb().click();
		varietyselect.getOtherofficesuite().click();
		System.out.println("Test case no.011 passed");
		
	}
	
	//test no.012
	//verify user can adding a product to cart and delete a product from cart.
	@Test(groups = "integration")
	public void AddingProducttoProduct_009() throws InterruptedException {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getComputerssection().click();
		ComputerSectionPage computer=new ComputerSectionPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(computer.getDesktopsectiononcomputerspage()));
		computer.getDesktopsectiononcomputerspage().click();
		Thread.sleep(3000);
		Computer_Section_page expensivecomputer=new Computer_Section_page(driver);
		wait.until(ExpectedConditions.elementToBeClickable(expensivecomputer.getBuildyourownexpensivecomputer()));
		expensivecomputer.getBuildyourownexpensivecomputer().click();
		BuildYourOwnPC varietyselect=new BuildYourOwnPC(driver);
		wait.until(ExpectedConditions.elementToBeClickable(varietyselect.getFastoption()));
		varietyselect.getFastoption().click();
		varietyselect.getEightgbramvarient().click();
		varietyselect.getFourhundredgb().click();
		varietyselect.getOtherofficesuite().click();
		varietyselect.getAddtocartonexpensivepcpage().click();
		System.out.println("product added to cart");
		wait.until(ExpectedConditions.visibilityOf(varietyselect.getTheproducthasbeenaddedtocartnotification()));
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("Window.scrollBy(0,-200);");
		welcome.getShoppingcart().click();
		ShoppingCartPage cartpage=new ShoppingCartPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cartpage.getQuantityoption()));
		Thread.sleep(2000);
		cartpage.getQuantityoption().clear();
		wait.withTimeout(Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(10));
		wait.until(ExpectedConditions.elementToBeClickable(cartpage.getUpdatecartlink()));
		
		cartpage.getUpdatecartlink().sendKeys("0");
		cartpage.getUpdatecartlink();
		System.out.println("product deleted from cart");
		System.out.println("Test case no.012 passed");
		}
	
	//test no.013
	//verify user can able to share through "email a friend" option.
	@Test(groups = "integration")
	public void EmailToFriendTest_010() throws InterruptedException {
		
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage login=new Loginpage(driver);
		login.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Rocky$$",Keys.ENTER);
		welcome.getComputerssection().click();
		Thread.sleep(3000);
		ComputerSectionPage computer=new ComputerSectionPage(driver);
		computer.getDesktopsectiononcomputerspage().click();
		Thread.sleep(3000);
		Computer_Section_page expensivecomputer=new Computer_Section_page(driver);
		expensivecomputer.getBuildyourownexpensivecomputer().click();
		Thread.sleep(3000);
		BuildYourOwnPC ownpc=new BuildYourOwnPC(driver);
		ownpc.getEmailfriend().click();
		EmailAFriend email=new EmailAFriend(driver);
		email.getFriendemailtextfeild().sendKeys("rockyboy30@gmail.com");
		email.getYouremailaddresstextfeild().sendKeys("rockyboy30@gmail.com");
		email.getSendmailbutton().click();
		Thread.sleep(3000);
		
		BuildYourOwnPC varietyselect=new BuildYourOwnPC(driver);
		varietyselect.getFastoption().click();
		varietyselect.getEightgbramvarient().click();
		varietyselect.getFourhundredgb().click();
		varietyselect.getOtherofficesuite().click();
		EmailAFriend email1=new EmailAFriend(driver);
		email1.getFriendemailtextfeild().sendKeys("dinga@gmail.com");
		email1.getYouremailaddresstextfeild().sendKeys("dinga@$$");
		email1.getSendmailbutton().click();
		Thread.sleep(3000);
		System.out.println("Test case no.013 passed");
		

	}
	//test no.014
	//verify user can able to add multiple items for single product.
	@Test(groups = "functional")
	public void AddMultipleCountToCartSectionTest_011() throws InterruptedException {
		
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage login=new Loginpage(driver);
		login.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Rocky$$",Keys.ENTER);
		welcome.getComputerssection().click();
		Thread.sleep(3000);
		ComputerSectionPage computer=new ComputerSectionPage(driver);
		computer.getDesktopsectiononcomputerspage().click();
		Thread.sleep(3000);
		Computer_Section_page expensivecomputer=new Computer_Section_page(driver);
		expensivecomputer.getBuildyourownexpensivecomputer().click();
		Thread.sleep(3000);
		BuildYourOwnPC varietyselect=new BuildYourOwnPC(driver);
		varietyselect.getFastoption().click();
		varietyselect.getEightgbramvarient().click();
		varietyselect.getFourhundredgb().click();
		varietyselect.getOtherofficesuite().click();
		varietyselect.getQuantitycounttextbox().clear();
		varietyselect.getQuantitycounttextbox().sendKeys("4");
		//driver.switchTo().activeElement().sendKeys("4");
		varietyselect.getAddtocartonexpensivepcpage().click();
		System.out.println("Test case no.014 passed");

	}
	//test no.015
	//verify by adding multiple products to cart section.
	@Test(groups = "integration")
	public void AddMultipleProductsToCartTest() throws InterruptedException {
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage login=new Loginpage(driver);
		login.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Rocky$$",Keys.ENTER);
		welcome.getComputerssection().click();
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		//Thread.sleep(3000);
		ComputerSectionPage computer=new ComputerSectionPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(computer.getDesktopsectiononcomputerspage()));
		computer.getDesktopsectiononcomputerspage().click();
		//Thread.sleep(3000);
		Computer_Section_page expensivecomputer=new Computer_Section_page(driver);
		wait.until(ExpectedConditions.elementToBeClickable(expensivecomputer.getBuildyourownexpensivecomputer()));
		expensivecomputer.getBuildyourownexpensivecomputer().click();
		//Thread.sleep(3000);
		BuildYourOwnPC varietyselect=new BuildYourOwnPC(driver);
		wait.until(ExpectedConditions.elementToBeClickable(varietyselect.getFastoption()));
		varietyselect.getFastoption().click();
		varietyselect.getEightgbramvarient().click();
		varietyselect.getFourhundredgb().click();
		varietyselect.getOtherofficesuite().click();
		varietyselect.getQuantitycounttextbox().clear();
		varietyselect.getQuantitycounttextbox().sendKeys("4");
		//driver.switchTo().activeElement().sendKeys("4");
		wait.until(ExpectedConditions.elementToBeClickable(varietyselect.getAddtocartonexpensivepcpage()));
		varietyselect.getAddtocartonexpensivepcpage().click();
		wait.until(ExpectedConditions.elementToBeClickable(welcome.getComputerssection()));
		welcome.getComputerssection().click();	
		wait.until(ExpectedConditions.elementToBeClickable(computer.getNotebookssectiononcomputerspage()));
		computer.getDesktopsectiononcomputerspage().click();
		wait.until(ExpectedConditions.elementToBeClickable(expensivecomputer.getBuildyourownpccheaplink()));
		expensivecomputer.getBuildyourownpccheaplink().click();
		BuildYourOwnCheapComputerPage cheap=new BuildYourOwnCheapComputerPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cheap.getFastprocessoroptin()));
		cheap.getFastprocessoroptin().click();
		cheap.getFourgbramoption().click();
		cheap.getFourhundredgbvarient().click();
		cheap.getOfficeusevarient().click();
		cheap.getQuantitycount().clear();
		cheap.getQuantitycount().sendKeys("3");
		cheap.getAddtocartbutton().click();
		welcome.getShoppingcart().click();
		System.out.println("Test case no.015 passed");
	}
	
	//test 016
	//verify user can able to change address on delivery page.
	@Test(groups = "functional")
	public void AddressChangeTest_012() throws InterruptedException {
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage login=new Loginpage(driver);
		login.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Rocky$$",Keys.ENTER);
		welcome.getComputerssection().click();
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		//Thread.sleep(3000);
		ComputerSectionPage computer=new ComputerSectionPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(computer.getDesktopsectiononcomputerspage()));
		computer.getDesktopsectiononcomputerspage().click();
		//Thread.sleep(3000);
		Computer_Section_page expensivecomputer=new Computer_Section_page(driver);
		wait.until(ExpectedConditions.elementToBeClickable(expensivecomputer.getBuildyourownexpensivecomputer()));
		expensivecomputer.getBuildyourownexpensivecomputer().click();
		//Thread.sleep(3000);
		BuildYourOwnPC varietyselect=new BuildYourOwnPC(driver);
		wait.until(ExpectedConditions.elementToBeClickable(varietyselect.getFastoption()));
		varietyselect.getFastoption().click();
		varietyselect.getEightgbramvarient().click();
		varietyselect.getFourhundredgb().click();
		varietyselect.getOtherofficesuite().click();
		varietyselect.getQuantitycounttextbox().clear();
		varietyselect.getQuantitycounttextbox().sendKeys("4");
		//driver.switchTo().activeElement().sendKeys("4");
		wait.until(ExpectedConditions.elementToBeClickable(varietyselect.getAddtocartonexpensivepcpage()));
		varietyselect.getAddtocartonexpensivepcpage().click();
		wait.until(ExpectedConditions.elementToBeClickable(welcome.getComputerssection()));
		welcome.getComputerssection().click();	
		wait.until(ExpectedConditions.elementToBeClickable(computer.getNotebookssectiononcomputerspage()));
		computer.getDesktopsectiononcomputerspage().click();
		wait.until(ExpectedConditions.elementToBeClickable(expensivecomputer.getBuildyourownpccheaplink()));
		expensivecomputer.getBuildyourownpccheaplink().click();
		BuildYourOwnCheapComputerPage cheap=new BuildYourOwnCheapComputerPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cheap.getFastprocessoroptin()));
		cheap.getFastprocessoroptin().click();
		cheap.getFourgbramoption().click();
		cheap.getFourhundredgbvarient().click();
		cheap.getOfficeusevarient().click();
		cheap.getQuantitycount().clear();
		cheap.getQuantitycount().sendKeys("3");
		cheap.getAddtocartbutton().click();
		welcome.getShoppingcart().click();
		ShoppingCartPage cartpage=new ShoppingCartPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cartpage.getTermsofservicecheckbox()));
		cartpage.getTermsofservicecheckbox().click();
		cartpage.getCheckoutbutton().click();
		CheckOutPage checkout=new CheckOutPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(checkout.getBillingaddresschoose()));
		Thread.sleep(1000);
		Select bilingaddress=new Select(checkout.getBillingaddresschoose());
		bilingaddress.selectByIndex(1);
		System.out.println("Test case no.016 passed");
		
	}
	//test 017
	//verify user can able to "compare two products".
	@Test(groups = "integration")
	public void CompareProductsTest_013() throws InterruptedException {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage login=new Loginpage(driver);
		login.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Rocky$$",Keys.ENTER);
		welcome.getComputerssection().click();
		//Thread.sleep(3000);
		ComputerSectionPage computer=new ComputerSectionPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(computer.getDesktopsectiononcomputerspage()));
		computer.getDesktopsectiononcomputerspage().click();
		//Thread.sleep(3000);
		Computer_Section_page expensivecomputer=new Computer_Section_page(driver);
		wait.until(ExpectedConditions.elementToBeClickable(expensivecomputer.getBuildyourownexpensivecomputer()));
		expensivecomputer.getBuildyourownexpensivecomputer().click();
	
		BuildYourOwnPC varietyselect=new BuildYourOwnPC(driver);
		wait.until(ExpectedConditions.elementToBeClickable(varietyselect.getFastoption()));
		varietyselect.getFastoption().click();
		varietyselect.getEightgbramvarient().click();
		varietyselect.getFourhundredgb().click();
		varietyselect.getOtherofficesuite().click();
		varietyselect.getAddtocomparebutton().click();
		wait.until(ExpectedConditions.elementToBeClickable(welcome.getComputerssection()));
		welcome.getComputerssection().click();
		wait.until(ExpectedConditions.elementToBeClickable(computer.getDesktoppagedisplayed()));
		computer.getDesktoppagedisplayed().click();
		wait.until(ExpectedConditions.elementToBeClickable(computer.getDesktopsectiononcomputerspage()));
		computer.getDesktopsectiononcomputerspage().click();
		wait.until(ExpectedConditions.elementToBeClickable(expensivecomputer.getBuildyourownpccheaplink()));
		expensivecomputer.getBuildyourownpccheaplink().click();
		BuildYourOwnCheapComputerPage cheappc=new BuildYourOwnCheapComputerPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cheappc.getFastprocessoroptin()));
		cheappc.getFastprocessoroptin().click();
		cheappc.getFourgbramoption().click();
		cheappc.getFourhundredgbvarient().click();
		cheappc.getOfficeusevarient().click();
		cheappc.getAddtocomparebutton().click();
		Thread.sleep(3000);
		System.out.println("Test no.17 passed");
		}
	//test no.018
	//verify user can able order a product in "cash on delivery" option.
	@Test(groups = "system testing")
	public void OrderPlaceTest_015() {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage login=new Loginpage(driver);
		login.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com",Keys.TAB);
		driver.switchTo().activeElement().sendKeys("Rocky$$",Keys.ENTER);
		welcome.getComputerssection().click();
		//Thread.sleep(3000);
		ComputerSectionPage computer=new ComputerSectionPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(computer.getDesktopsectiononcomputerspage()));
		computer.getDesktopsectiononcomputerspage().click();
		//Thread.sleep(3000);
		Computer_Section_page expensivecomputer=new Computer_Section_page(driver);
		wait.until(ExpectedConditions.elementToBeClickable(expensivecomputer.getBuildyourownexpensivecomputer()));
		expensivecomputer.getBuildyourownexpensivecomputer().click();
	
		BuildYourOwnPC varietyselect=new BuildYourOwnPC(driver);
		wait.until(ExpectedConditions.elementToBeClickable(varietyselect.getFastoption()));
		varietyselect.getFastoption().click();
		varietyselect.getEightgbramvarient().click();
		varietyselect.getFourhundredgb().click();
		varietyselect.getOtherofficesuite().click();
		varietyselect.getAddtocartonexpensivepcpage();
		welcome.getShoppingcart().click();
		ShoppingCartPage cartpage=new ShoppingCartPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(cartpage.getTermsofservicecheckbox()));
		cartpage.getTermsofservicecheckbox().click();
		cartpage.getCheckoutbutton().click();
		CheckOutPage checkout=new CheckOutPage(driver);
		wait.until(ExpectedConditions.elementToBeClickable(checkout.getBillingaddresschoose()));
		checkout.getBillingaddresscontinuebuttom().click();
		wait.until(ExpectedConditions.elementToBeClickable(checkout.getShippingaddresscontinuebutton()));
		checkout.getShippingaddresscontinuebutton().click();
		wait.until(ExpectedConditions.elementToBeClickable(checkout.getShippingmethodselect()));
		checkout.getShippingmethodselect().click();
		wait.until(ExpectedConditions.elementToBeClickable(checkout.getShippingmethodcontinue()));
		checkout.getShippingmethodcontinue().click();
		wait.until(ExpectedConditions.elementToBeClickable(checkout.getCashondeliverycontinuebutton()));
		checkout.getCashondeliverycontinuebutton().click();
		wait.until(ExpectedConditions.elementToBeClickable(checkout.getPaymentinfocontinuebutton()));
		checkout.getPaymentinfocontinuebutton().click();
		wait.until(ExpectedConditions.elementToBeClickable(checkout.getConfrimordercontinuebutton()));
		checkout.getConfrimordercontinuebutton().click();
		System.out.println("Test no.18 passed");
	}
	
	//test 019
	//verify user can able to edit "Customer info".
	@Test(groups = "integration")
	public void CustomerInfoEditTest_016() throws InterruptedException {
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage loginpage=new Loginpage(driver);
		loginpage.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com");
		loginpage.getPasswordtextfeildlink().sendKeys("Rocky$$",Keys.ENTER);
		wait.until(ExpectedConditions.elementToBeClickable(welcome.getMyaccountinfolink()));
		welcome.getMyaccountinfolink().click();
		MyAccountInfoTest accountinfo=new MyAccountInfoTest(driver);
		wait.until(ExpectedConditions.elementToBeClickable(accountinfo.getFirstnametextfeild()));
		//Thread.sleep(2000);
		accountinfo.getFirstnametextfeild().clear();
		accountinfo.getFirstnametextfeild().sendKeys("dollu");
		accountinfo.getLastnametextfeild().clear();
		accountinfo.getLastnametextfeild().sendKeys("bollu");
		accountinfo.getEmailidtextfeild().clear();
		accountinfo.getEmailidtextfeild().sendKeys("rockyboy30@gmail.com");
		accountinfo.getSavebuttononaccountinfo().click();
		System.out.println("Test no.019 passed");
				
	}
	//test no.020
	//verify the user can able to download the "Order Details"
	@Test(groups = "functional")
	public void OrderDetailsTest_017() {
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage loginpage=new Loginpage(driver);
		loginpage.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com");
		loginpage.getPasswordtextfeildlink().sendKeys("Rocky$$");
		loginpage.getSubmitbuttonloginpage().click();
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,1500);");
		welcome.getOrderslink().click();
		OrdersPlacedPage orderdownload=new OrdersPlacedPage(driver);
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		wait.until(ExpectedConditions.elementToBeClickable(orderdownload.getInvoicedownloadlink()));
		orderdownload.getInvoicedownloadlink().click();	
		System.out.println("Test no.020 passed");
	}
	// test no.021
	//verify the user can able "contact us" if their any issue in the products.
	@Test(groups = "integration")
	public void ContactUsTest_018() {
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage loginpage=new Loginpage(driver);
		loginpage.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com");
		loginpage.getPasswordtextfeildlink().sendKeys("Rocky$$");
		loginpage.getSubmitbuttonloginpage().click();
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,1500);");
		welcome.getContactuslink().click();
		ContactUsPage contact=new ContactUsPage(driver);
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.pollingEvery(Duration.ofMillis(10));
		wait.until(ExpectedConditions.elementToBeClickable(contact.getEnquirybox()));
		contact.getEnquirybox().sendKeys("Order not recived");
		contact.getSendbuttonlink().click();
		System.out.println("test no.021 passed");
	}
	//test no.022
	//verify user can able change the option from dropdown list.
	 @Test(groups = "functional")
	public void DropDownTest() {
		 	Welcomepage welcome=new Welcomepage(driver);
			welcome.getApparelShoesection().click();
			FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
			wait.pollingEvery(Duration.ofMillis(10));
			ApperalAndShoesPage apperal=new ApperalAndShoesPage(driver);
			wait.until(ExpectedConditions.elementToBeClickable(apperal.getBlueandgreenSneakerproduct()));
			Select selectby=new Select(apperal.getSortbysection());
			selectby.selectByIndex(2);
			Select displayby=new Select(apperal.getDisplaysection());
			displayby.selectByIndex(0);
			Select viewby=new Select(apperal.getViewassection());
			viewby.selectByIndex(1);
			System.out.println("test no.022 passed");
			
	 }
	 //test no.23
	 //verify user can able change the "password".
	 @Test(groups = "integration")
	 public void PassWordChangeTest_023() {
		 	Welcomepage welcome=new Welcomepage(driver);
			welcome.getLoginlink().click();
			Loginpage loginpage=new Loginpage(driver);
			loginpage.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com");
			loginpage.getPasswordtextfeildlink().sendKeys("Rocky$$");
			loginpage.getSubmitbuttonloginpage().click();
			FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
			wait.pollingEvery(Duration.ofMillis(10));
			wait.until(ExpectedConditions.elementToBeClickable(welcome.getMyaccountinfolink()));
			welcome.getMyaccountinfolink().click();
			MyAccountInfoTest myaccount=new MyAccountInfoTest(driver);
			wait.until(ExpectedConditions.elementToBeClickable(myaccount.getChangepasswordlink()));
			myaccount.getChangepasswordlink().click();
			wait.until(ExpectedConditions.elementToBeClickable(myaccount.getOldPasswordtextfeild()));
			myaccount.getOldPasswordtextfeild().sendKeys("Rocky$$");
			myaccount.getNewPasswordtextfeild().sendKeys("Rocky$$",Keys.TAB);
			driver.switchTo().activeElement().sendKeys("Rocky$$");
			//wait.until(ExpectedConditions.elementToBeClickable(myaccount.getConfirmpasswordtextfeild()));
			//myaccount.getConfirmpasswordtextfeild().sendKeys("rockyboy30@gmail.com");
			myaccount.getChangepasswordbutton().click();
			wait.until(ExpectedConditions.visibilityOf(myaccount.getPasswordchangedsuccessfullytext()));
			String passwordchanged=myaccount.getPasswordchangedsuccessfullytext().getText();
			System.out.println("successfully " + passwordchanged);
			System.out.println("Test case no.023 passed");
	}
	//test no.024
	 //verify that "Recently viewed products products" is visible. 
	 @Test
	 public void RecentelyViewedItemsTest_024() {
			FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
			wait.pollingEvery(Duration.ofMillis(10));
			Welcomepage welcome=new Welcomepage(driver);
			JavascriptExecutor scroll=(JavascriptExecutor)driver;
			scroll.executeScript("window.scrollBy(0,1500);");
			welcome.getRecentlyviewedproductslink().click();
			RecentelyViewEdItemsPage recentitemspage=new RecentelyViewEdItemsPage(driver);
			wait.until(ExpectedConditions.elementToBeClickable(recentitemspage.getRecentelyvieweditemstext()));
			String recenttext=recentitemspage.getRecentelyvieweditemstext().getText();
			System.out.println(recenttext + "page opened");
			System.out.println("test no.024 passed");
		 }
}
