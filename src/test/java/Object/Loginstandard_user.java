package Object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Loginstandard_user {

	WebDriver driver;
	
	public Loginstandard_user(WebDriver idriver)
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
		username.sendKeys("standard_user");
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
	public void confirmpage()
	{
		WebElement swagLabsPageText = driver.findElement(By.className("title"));
		Assert.assertEquals(swagLabsPageText.getText(), "Products","User is logged into Swag Labs page");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
