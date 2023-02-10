package baseTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import basePage.AddAcountPage;

public class AddAccountTest extends TestBase{
	
	@Test
	public void verify_sucessful_AddAccount()
	{
		String expected = "Failed , try again ";
		loginPage = mainLoginPage.clickOnLoginButton();
		homePage = loginPage.doLogin("Adha1", "test0811");
		addAccount = homePage.clickAddAcount();
		addAccount.enterAccname("Akash");
	
		addAccount.enterAccnumber("081121");
		addAccount.enterAccfund("10000");
		addAccount.clickAddAcount();
		
		Alert alert = driver.switchTo().alert();
		
		String actual = alert.getText();
		
		AssertJUnit.assertEquals(expected, actual);

}
}