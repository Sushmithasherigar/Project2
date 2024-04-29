package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginWithoutCred {

	WebDriver driver;
	
	public LoginWithoutCred(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	public void refresh()
	{
		driver.navigate().refresh();
	}
	public void confirmmessageusername()
	{
		WebElement errormessageforusername = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		Assert.assertEquals(errormessageforusername.getText(), "Epic sadface: Username is required","Login Pass");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Login Failed");
	}
	public void confirmmessagepassword()
	{
		WebElement errormessageforpassword = driver.findElement(By.xpath("//div[@class='error-message-container error']"));
		Assert.assertEquals(errormessageforpassword.getText(), "Epic sadface: Password is required","Login Pass");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Login Failed");
	}
	public void confirmmessageyourcart()
	{
		WebElement yourcart = driver.findElement(By.xpath("//span[text()='Your Cart']"));
		Assert.assertEquals(yourcart.getText(), "Your Cart","Please check your page again");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("You are in Your Cart Page");
	}
	public void confirmmessageinfo()
	{
		WebElement yourinfo = driver.findElement(By.xpath("//span[text()='Checkout: Your Information']"));
		Assert.assertEquals(yourinfo.getText(), "Checkout: Your Information","Please check your page again");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("You are in Your Information Page");
	}
	public void confirmmessageoverview()
	{
		WebElement overview = driver.findElement(By.xpath("//span[text()='Checkout: Overview']"));
		Assert.assertEquals(overview.getText(), "Checkout: Overview","Please check your page again");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("You are in Overview Page");
	}
	public void quit()
	{
		driver.quit();
	}
}
