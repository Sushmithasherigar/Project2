package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContinueShopping {

	WebDriver driver;
	
	public ContinueShopping(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "continue-shopping")WebElement continueshopping;
	
	public void continueshopping()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		continueshopping.click();
	}
}
