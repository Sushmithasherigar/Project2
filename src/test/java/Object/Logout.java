package Object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {

	WebDriver driver;
	
	public Logout(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//button[text()='Open Menu']")WebElement menu;
	@FindBy (xpath = "//a[text()='Logout']")WebElement logout;
	
	public void menu()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		menu.click();
	}
	public void logout()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		logout.click();
	}
}
