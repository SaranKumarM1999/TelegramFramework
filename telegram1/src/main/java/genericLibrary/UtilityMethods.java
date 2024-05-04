package genericLibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class UtilityMethods {
	public void getwebpagescreenshot(WebDriver driver) {
		//step 1 takescreen
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		//step -2 save at temprary file
		File temp=screenshot.getScreenshotAs(OutputType.FILE);
		//step 3 save at permanent place
		File permanent=new File("./screenshots/" + getTime() + ".png");
		//step-4
		try {
			FileHandler.copy(temp, permanent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String getTime() {
		return LocalDateTime.now().toString().replace(":", "_").replace("-", "_");
	}
	
	public static void selectoptionbyindex(WebElement dropdown,int index) {
		Select selectoption=new Select(dropdown);
		selectoption.selectByIndex(index);
	}	
	
	public static void selectoptionbyvalue(WebElement dropdown,String value) {
		
	}

}
