package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UpdateAccountPage {
	
	WebDriver driver;
	
	By accountnumber = By.id("myInput");
	By newfund = By.name("afund");
	By updateBalaence = By.name("register");
	
	public UpdateAccountPage( WebDriver driver)
	{
		this.driver=driver;
	}

	public void enteraccnumber(String num )
	{
		driver.findElement(accountnumber).sendKeys("24234");
	}
	
	public void enterfund(String num )
	{
		driver.findElement(newfund).sendKeys("75000");
	}
	
	public void clickupdatebal()
	{
		driver.findElement(updateBalaence).click();
	}
}
