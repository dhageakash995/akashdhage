package baseTest;

import javax.activation.MailcapCommandMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import basePage.AddAcountPage;
import basePage.HomePage;
import basePage.LoginPage;
import basePage.MainLoginPage;
import basePage.UpdateAccountPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	
	WebDriver driver;
	MainLoginPage mainLoginPage;
	LoginPage loginPage;
	HomePage homePage;
	AddAcountPage addAccount;
	UpdateAccountPage updateAccountPage;
	
	@Parameters({"browser"})
	@BeforeMethod
	public void init_driver(String browser)
	{
		if(browser.equals("edge"))
		{
		WebDriverManager.edgedriver().setup();;
		 driver=new EdgeDriver();
		}
		
		else if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
	//	System.out.println("before method");
	//	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\edgedriver_win64\\msedgedriver.exe");
	//	WebDriver driver1 = new EdgeDriver();
		driver.get("http://tditsolutions.com/tool/");
		mainLoginPage  = new MainLoginPage(driver);
		//addAccount = new AddAcountPage(driver);
		//updateBal  = new UpdateAccountPage(driver);
	}
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
	
}

