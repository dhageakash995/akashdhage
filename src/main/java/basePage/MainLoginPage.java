package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainLoginPage {
	
	WebDriver driver;
	By mainLoginButton = By.linkText("Login");
	
	public MainLoginPage( WebDriver driver)
	{
		this.driver=driver;
	}

	public LoginPage clickOnLoginButton()
	{
		driver.findElement(mainLoginButton).click();
		return new LoginPage(driver);
	}
}
