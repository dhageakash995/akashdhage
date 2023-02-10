package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddAcountPage {

	
	WebDriver driver;
	By Accountname = By.name("aname");
	By Accountnumber =By.name("anumber");
	By Accountfund = By.name("afund");
	By AddAccount = By.name("register");
	
	public AddAcountPage( WebDriver driver)
	{
		this.driver=driver;
	}
	public void enterAccname(String akash )
	{
		driver.findElement(Accountname).sendKeys(akash);
	}
	public void enterAccnumber(String number )
	{
		driver.findElement(Accountnumber).sendKeys("12345");
	}
	public void enterAccfund(String fund )
	{
		driver.findElement(Accountfund).sendKeys("10000");
	}
	public void clickAddAcount()
	{
		driver.findElement(AddAccount).click();
	}
}
