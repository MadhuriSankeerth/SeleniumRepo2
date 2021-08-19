package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Excel;
import page.LoginPage;

public class InvalidLogin extends BaseTest {
	@Test(priority=2)
	public void testValidLogin() {
		String un=Excel.getData(XL_PATH,"InvalidLogin",1,0);
		String pw=Excel.getData(XL_PATH,"InvalidLogin",1,1);
		String msg=Excel.getData(XL_PATH,"InvalidLogin",1,2);
		
//		1.	Enter Invalid user name
		LoginPage loginPage=new LoginPage(driver);
		loginPage.setUserName(un);
//		2.	Enter Invalid password
		loginPage.setPassword(pw);
//		3.	Click on login
		loginPage.clickLogin();
//		4.	Verify error msg is Displayed
		boolean result=loginPage.verifyErrMsgDisplayed(wait);
		Assert.assertEquals(result,true,msg);
	}

}
