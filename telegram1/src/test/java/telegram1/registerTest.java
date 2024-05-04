package telegram1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class registerTest {
	
	@Test(invocationCount = 0,threadPoolSize = 1)
	public void logintest_001() {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getLoginlink().click();
		//calling login page to login
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		LoginPage logintest=new LoginPage(driver);
		logintest.getEmailtextfeildlink().sendKeys("rockyboy30@gmail.com");
		logintest.getPasswordtextfeildlink().sendKeys("Rocky$$");
		logintest.getSubmitbuttonloginpage().click();
		System.out.println("login success");
		driver.quit();
	}
	@Test(dependsOnMethods = "logintest_001",invocationCount = 1,threadPoolSize = 2)
	public void books_001() throws InterruptedException {
		// TODO Auto-generated method 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//calling welcome page 
		WelcomePage welcomepage=new WelcomePage(driver);
		//calling bookspage
		Bookspage bookslinkpage=new Bookspage(driver);
		//click on books link
		welcomepage.getBookssection().click();
		//verify books
		if (bookslinkpage.getPagetitle().getText().equals("Books")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test failed");
		}
		
		if (bookslinkpage.getComputingandinternetbook().getText().equals("Computing aand Internet")) {
			System.out.println("book is displayed");
			bookslinkpage.getComputingandinternetbook().click();
			//calling computing and internet page
			Books_Computing_and_Internet_page computingandinternetpage=new Books_Computing_and_Internet_page(driver);
			if (computingandinternetpage.getComputingAndInternetBook().getText().equals("Computing and Internet")) {
				System.out.println("Displayed- Computing and Internet book page is displayed");				
			}
			else {
				System.out.println("Played- Computing and Internet book page is displayed");
				driver.quit();
			}
			}
		else
		{
			System.out.println("book is not dsiplayed");
		}
		Thread.sleep(3000);
		driver.quit();
		}
	
	
	//2nd test case
	
	@Test(dependsOnMethods = "books_001")
	public void book_test002() throws InterruptedException {
		// To launch the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WelcomePage welcome=new WelcomePage(driver);
		welcome.getApparelShoesection().click();
		welcome.getComputerssection().click();
		Thread.sleep(3000);
		driver.quit();
	}
		

	}
	
