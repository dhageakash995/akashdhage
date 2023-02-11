package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class LoginPage {
			
	WebDriver driver;
	
	By username =By.name("username");
	By password = By.name("password");
	By loginButton = By.name("login");
	
	
	
	public LoginPage( WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	public void enterUsername(String user )
	{
		driver.findElement(username).sendKeys(user);
	}
	public void enterPassword(String pass )
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public HomePage clickLoginButton()
	{
		driver.findElement(loginButton).click();
		return new HomePage(driver);
	}
	
	
	
	public HomePage doLogin(String userName,String pass)
	{
		driver.findElement(username).sendKeys(userName);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginButton).click();

		return new HomePage(driver);
	}
	public static void test1()
	{
		
	}
}
