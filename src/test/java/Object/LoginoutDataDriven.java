package Object;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginoutDataDriven {

	WebDriver driver;
	
	public LoginoutDataDriven(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void loginout() throws IOException
	{
		FileInputStream fis = new FileInputStream("C:\\SUSHMITHA\\Selenium\\Project 2\\RightCredentials.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Data");
		
		int rows = sheet.getLastRowNum();
		System.out.println("The Number of Total rows : " +rows);
		
		for(int r=1;r<rows;r++)
		{
			driver.get("https://www.saucedemo.com/");
			XSSFRow row = sheet.getRow(r);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			
			System.out.println("Username-->"+username+"   Password-->"+password);
			try {
			
			driver.findElement(By.id("user-name")).sendKeys(username.toString());
			driver.findElement(By.id("password")).sendKeys(password.toString());
			driver.findElement(By.id("login-button")).click();
			
//			Alert alert = driver.switchTo().alert();
//			alert.dismiss();
			
			driver.findElement(By.xpath("//button[text()='Open Menu']")).click();
			driver.findElement(By.linkText("Logout")).click(); //a[text()='Logout']
			
			System.out.println("Valid");
			}
			
			catch(Exception e)
			{
				//System.out.println(e);
				System.out.println("Invalid");
			}
		}
	}
		 
}
	
