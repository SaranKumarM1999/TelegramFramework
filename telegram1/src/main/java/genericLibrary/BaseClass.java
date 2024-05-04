package genericLibrary;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import task1_mock_demowebshop.Loginpage;
import task1_mock_demowebshop.Welcomepage;

public class BaseClass extends UtilityMethods {
	public static ExtentReports reports;
	public static ExtentTest test;
	 public WebDriver driver;
	public BaseClass(WebDriver driver) {
        this.driver = driver; }
	
	//timeouts
	WebDriverWait driverWait;
	@BeforeSuite
	public void basesuite() {
		reports=new ExtentReports("./Reports/report.html");
		System.out.println("Before suite");
	}
	
	@BeforeTest
	
	public void basetest() {
		
		System.out.println("before test");
	}
	
	@BeforeClass
	public void openbrowser() {
		 
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait=new WebDriverWait(driver, Duration.ofMillis(10));
		System.out.println("beforeclass");
	}
	
	public BaseClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
	public void login(Method method) {
		String methodname=method.getName();
		test=reports.startTest(methodname);
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLoginlink().click();
		Loginpage login=new Loginpage(driver);
		login.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com");
		login.getPasswordtextfeildlink().sendKeys("Rocky$$");
		login.getSubmitbuttonloginpage().click();
	System.out.println("before method");

	}
	
	
	@AfterSuite
	public void aftermethod() {
	System.out.println("before method");

	}
	
	@AfterTest
	public void aftertest() {
	System.out.println("after test");

	}
	
	@AfterMethod
	public void logout() {
		reports.endTest(test);
		Welcomepage welcome=new Welcomepage(driver);
		welcome.getLogoutlink().click();
		System.out.println("after method");

	}
	
	@AfterClass
	public void closebrowser() {
		driver.quit();
		System.out.println("after class");
	}
	
	

}
