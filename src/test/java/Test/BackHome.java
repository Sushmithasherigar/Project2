package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BackHome {

	WebDriver driver;
	
	public BackHome(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//button[text()='Back Home']")WebElement back; 
	
	public void back() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		back.click();
	}
	
}
