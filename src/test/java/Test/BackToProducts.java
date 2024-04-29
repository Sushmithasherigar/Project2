package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackToProducts {

	WebDriver driver;
	
	public BackToProducts(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//div[text()='Sauce Labs Bolt T-Shirt']")WebElement bolttshirt;
	@FindBy (id = "back-to-products")WebElement clickback;
	
	public void bolttshirt()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		bolttshirt.click();
	}
	public void clickback()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		clickback.click();
	}
}
