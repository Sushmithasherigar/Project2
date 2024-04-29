package Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Sort {

	WebDriver driver;
	
	public Sort(WebDriver idriver)
	{
		driver = idriver;
		PageFactory.initElements(driver, this);
	}
	
	public void sortPriceLowtoHigh()
	{
		WebElement sortlowtohigh = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select select = new Select(sortlowtohigh);
		select.selectByVisibleText("Price (low to high)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	public void sortNameZtoA()
	{
		WebElement sortztoa = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select select = new Select(sortztoa);
		select.selectByVisibleText("Name (Z to A)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	public void sortNameAtoZ()
	{
		WebElement sortatoz = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select select = new Select(sortatoz);
		select.selectByVisibleText("Name (A to Z)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
	public void sortPriceHightoLow()
	{
		WebElement sorthightolow = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select select = new Select(sorthightolow);
		select.selectByVisibleText("Price (high to low)");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
	}
}
