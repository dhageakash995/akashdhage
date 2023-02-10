package baseTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.testng.annotations.Test;

import basePage.AddAcountPage;

public class UpdateAccTest extends TestBase{

	@Test
	public void verify_sucessful_updateBal()
	{
		
		String  expected ="Balance updated.. ";
		loginPage = mainLoginPage.clickOnLoginButton();
		homePage = loginPage.doLogin("Adha1", "test0811");
		updateAccountPage =homePage.clickUpdateAcount();
		
		updateAccountPage.enteraccnumber("081121");
		updateAccountPage.enterfund("10000");
		updateAccountPage.clickupdatebal();
		
		Alert alert= driver.switchTo().alert();
		
		String actual =	alert.getText();
	
		AssertJUnit.assertEquals(expected, actual);
	}
}
