package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {

	WebDriver driver;
	
	public ShoppingCart(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[@class='shopping_cart_link']")WebElement shoppingcart;
	@FindBy (id = "checkout")WebElement checkout;
	
	public void shoppingcart()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		shoppingcart.click();
	}
	public void checkout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		checkout.click();
	}
}
