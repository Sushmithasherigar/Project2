package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FillInformation {

	WebDriver driver;
	
	public FillInformation(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "first-name")WebElement firstname;
	@FindBy (id = "last-name")WebElement lastname;
	@FindBy (id = "postal-code")WebElement pin;
	@FindBy (id = "continue")WebElement conti;
	@FindBy (id = "finish")WebElement finish;
	
	public void firstname()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		firstname.sendKeys("Kajol");
	}
	public void lastname()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		lastname.sendKeys("Hebbar");
	}
	public void pin()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		pin.sendKeys("789054");
	}
	public void conti()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		conti.click();
	}
	public void finish()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		finish.click();
	}
}
