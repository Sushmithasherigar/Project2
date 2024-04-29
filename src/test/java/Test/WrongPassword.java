package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class WrongPassword {
	
	WebDriver driver;
	
	public WrongPassword(WebDriver idriver)
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
		password.sendKeys("secret@sauce");
	}
	public void login()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		login.click();
	}
	public void confirmmessage()
	{
		WebElement errormessage = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		Assert.assertEquals(errormessage.getText(), "Epic sadface: Username and password do not match any user in this service","Login Pass");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Login Failed");
	}
	
}
