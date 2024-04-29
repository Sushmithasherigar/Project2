package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemovefromCart {

	WebDriver driver;
	
	public RemovefromCart(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy (id = "remove-sauce-labs-backpack")WebElement remove1;
	@FindBy (id = "remove-sauce-labs-bike-light")WebElement remove2;
	@FindBy (id = "remove-sauce-labs-bolt-t-shirt")WebElement remove3;
	@FindBy (id = "remove-sauce-labs-fleece-jacket")WebElement remove4;
	
	public void remove1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		remove1.click();
	}
	public void remove2()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		remove2.click();
	}
	public void remove3()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		remove3.click();
	}
	public void remove4()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		remove4.click();
	}
	
	
}
