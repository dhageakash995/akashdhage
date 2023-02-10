package basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class HomePage {

	
	WebDriver driver;
	By tditText=By.xpath("//h2[contains(text(), 'TDIT Solutions')]");
	By addAcount=By.xpath("//a[contains(text(),'Add Account')]");
	By UpdateAcount=By.xpath("//a[contains(text(),'Update Account')]");
	
	
	public HomePage( WebDriver driver)
	{
		this.driver=driver;
	}
	
	public AddAcountPage clickAddAcount()
	{
		driver.findElement(addAcount).click();
		return new AddAcountPage(driver);
	}
	
	public UpdateAccountPage clickUpdateAcount()
	{
		driver.findElement(UpdateAcount).click();
		return new UpdateAccountPage(driver);
		
	}
	
	public boolean isAt()
	{
		return driver.findElement(tditText).isDisplayed();
	}
}
