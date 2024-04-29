package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResetAppState {

	WebDriver driver;
	
	public ResetAppState(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//a[text()='Reset App State']")WebElement reset;
	@FindBy (id = "react-burger-cross-btn")WebElement cross;
	
	public void reset()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		reset.click();
	}
	public void cross()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		cross.click();
		driver.navigate().refresh();
	}
}
