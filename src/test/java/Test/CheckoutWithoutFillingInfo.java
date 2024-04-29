package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutWithoutFillingInfo {

	WebDriver driver;
	
	public CheckoutWithoutFillingInfo(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "Sauce Labs Backpack")WebElement backpack;
	@FindBy (id = "add-to-cart")WebElement addtocart;
	
	public void backpack()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		backpack.click();
	}
	public void addtocart()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		addtocart.click();
	}
}
