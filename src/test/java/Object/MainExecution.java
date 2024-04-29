package Object;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Test.AddMutipleItem;
import Test.BackHome;
import Test.BackToProducts;
import Test.CheckoutWithoutFillingInfo;
import Test.ClickSaucelight;
import Test.ContinueShopping;
import Test.FillInformation;
import Test.LoginWithOtherAcc;
import Test.LoginWithoutCred;
import Test.RemovefromCart;
import Test.ResetAppState;
import Test.ShoppingCart;
import Test.Sort;
import Test.WrongPassword;

public class MainExecution
{

	@Test
	public static void mainExecutionMethod() throws InterruptedException, IOException
	{
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.saucedemo.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
			
			LoginoutDataDriven loginout = new LoginoutDataDriven(driver);
			
			Loginstandard_user login = new Loginstandard_user(driver);
			
			Logout logout = new Logout(driver);
			
			ClickSaucelight saucelight = new ClickSaucelight(driver);
			
			ShoppingCart shoppingcart = new ShoppingCart(driver);
			
			FillInformation filldetails = new FillInformation(driver);
			
			AddMutipleItem addmultiple = new AddMutipleItem(driver);
			
			ResetAppState reset = new ResetAppState(driver);
			
			Sort sort = new Sort(driver);
			
			BackHome back = new BackHome(driver);
			
			RemovefromCart clearcart = new RemovefromCart(driver);
			
			ContinueShopping contishop = new ContinueShopping(driver);
			
			BackToProducts clickback = new BackToProducts(driver);
			
			LoginWithOtherAcc otheracc = new LoginWithOtherAcc(driver);
			
			Loginvisual_user loginv = new Loginvisual_user(driver);
			
			CheckoutWithoutFillingInfo info = new CheckoutWithoutFillingInfo(driver);
			
			WrongPassword wrongpass = new WrongPassword(driver);
			
			LoginWithoutCred withoutcred = new LoginWithoutCred(driver);
			
			loginout.loginout();
			
			login.username();
			login.password();
			login.login();
			login.confirmpage();	
			saucelight.saucelight();
			saucelight.addtocart();
			shoppingcart.shoppingcart();
			withoutcred.confirmmessageyourcart();
			shoppingcart.checkout();
			withoutcred.confirmmessageinfo();
			filldetails.firstname();
			filldetails.lastname();
			filldetails.pin();
			filldetails.conti();
			withoutcred.confirmmessageoverview();
			filldetails.finish();
			back.back();
			logout.menu();
			logout.logout();
			
			login.username();
			login.password();
			login.login();
			addmultiple.add1();
			addmultiple.add2();
			addmultiple.add3();
			addmultiple.add4();
			addmultiple.add5();
			addmultiple.add6();
			logout.menu();
			reset.reset();
			reset.cross();
			logout.menu();
			logout.logout();
			
			login.username();
			login.password();
			login.login();
			sort.sortPriceLowtoHigh();
			sort.sortNameZtoA();
			sort.sortPriceHightoLow();
			sort.sortNameAtoZ();
			logout.menu();
			logout.logout();
			
			login.username();
			login.password();
			login.login();
			addmultiple.add1();
			addmultiple.add2();
			addmultiple.add3();
			addmultiple.add4();
			shoppingcart.shoppingcart();
			logout.menu();
			logout.logout();
			login.username();
			login.password();
			login.login();
			shoppingcart.shoppingcart();
			clearcart.remove1();
			clearcart.remove2();
			clearcart.remove3();
			clearcart.remove4();
			contishop.continueshopping();	
			clickback.bolttshirt();
			clickback.clickback();
			otheracc.tshirt();
			saucelight.addtocart();
			logout.menu();
			logout.logout();
			loginv.username();
			loginv.password();
			loginv.login();
			shoppingcart.shoppingcart();
			otheracc.clickremove();
			logout.menu();
			logout.logout();
			login.username();
			login.password();
			login.login();
			shoppingcart.shoppingcart();
			logout.menu();
			logout.logout();
			
			login.username();
			login.password();
			login.login();
			info.backpack();
			info.addtocart();
			shoppingcart.shoppingcart();
			shoppingcart.checkout();
			filldetails.conti();
			logout.menu();
			logout.logout();
			
			wrongpass.username();
			wrongpass.password();
			wrongpass.login();
			wrongpass.confirmmessage();
			
			withoutcred.refresh();
			login.login();
			withoutcred.confirmmessageusername();
			
			withoutcred.refresh();
			login.username();
			login.login();
			withoutcred.confirmmessagepassword();
			withoutcred.quit();
		}
}
