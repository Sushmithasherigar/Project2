package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickSaucelight {

	WebDriver driver;
	
	public ClickSaucelight(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "Sauce Labs Bike Light")WebElement saucelight;
	@FindBy (xpath = "//button[text()='Add to cart']")WebElement addtocart;
	
	public void saucelight()
	{
		saucelight.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
	public void addtocart()
	{
		addtocart.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	}
}
