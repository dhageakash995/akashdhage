package baseTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import basePage.LoginPage;

public class loginTestClass extends TestBase{
	
	@Test
	public void verify_sucessful_login()
	{
	//	LoginPage loginpage = new LoginPage(null);
		
		loginPage = mainLoginPage.clickOnLoginButton();
		
		loginPage.enterUsername("Adha1");
		loginPage.enterPassword("test0811");
		homePage = loginPage.clickLoginButton();
		
		AssertJUnit.assertEquals(true, homePage.isAt());
		
	}
}