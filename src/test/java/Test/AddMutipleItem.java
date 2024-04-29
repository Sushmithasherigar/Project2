package Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddMutipleItem {

	WebDriver driver;
	
	public AddMutipleItem(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "add-to-cart-sauce-labs-backpack")WebElement add1;
	@FindBy (id = "add-to-cart-sauce-labs-bike-light")WebElement add2;
	@FindBy (id = "add-to-cart-sauce-labs-bolt-t-shirt")WebElement add3;
	@FindBy (id = "add-to-cart-sauce-labs-fleece-jacket")WebElement add4;
	@FindBy (id = "add-to-cart-sauce-labs-onesie")WebElement add5;
	@FindBy (id = "add-to-cart-test.allthethings()-t-shirt-(red)")WebElement add6; 
	
	public void add1()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		add1.click();
	}
	public void add2()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		add2.click();
	}
	public void add3()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		add3.click();
	}
	public void add4()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		add4.click();
	}
	public void add5()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		add5.click();
	}
	public void add6()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		add6.click();
	}
}
