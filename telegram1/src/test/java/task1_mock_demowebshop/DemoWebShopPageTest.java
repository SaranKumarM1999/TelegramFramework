package task1_mock_demowebshop;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoWebShopPageTest {
	//construvtor
	@Test
	public void DemoWebShopPageTes() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Welcomepage welcome=new Welcomepage(driver);
	   SoftAssert softdummy=new SoftAssert();
		welcome.getBookssection().click();
		 String get=welcome.getBookssection().getText();
		 softdummy.assertEquals(get, "", get)
	} 

}
