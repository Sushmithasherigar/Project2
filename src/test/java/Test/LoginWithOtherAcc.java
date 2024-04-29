package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithOtherAcc {

	WebDriver driver;
	
	public LoginWithOtherAcc(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "Test.allTheThings() T-Shirt (Red)")WebElement tshirt;
	@FindBy (id = "remove-test.allthethings()-t-shirt-(red)")WebElement clickremove;
	
	public void tshirt()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		tshirt.click();
	}
	public void clickremove()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		clickremove.click();
	}
	
}
