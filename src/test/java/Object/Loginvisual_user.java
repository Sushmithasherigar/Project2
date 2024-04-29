package Object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginvisual_user {

	WebDriver driver;
	
	public Loginvisual_user(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "user-name")WebElement username;
	@FindBy (id = "password")WebElement password;
	@FindBy (id = "login-button")WebElement login;
	
	public void username()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		username.sendKeys("visual_user");
	}
	public void password()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		password.sendKeys("secret_sauce");
	}
	public void login()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		login.click();
	}
}
