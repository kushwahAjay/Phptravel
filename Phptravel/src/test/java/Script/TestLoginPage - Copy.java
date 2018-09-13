package Script;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



import Generic.BaseTest;
import Generic.XL;
import Page.LoginPage;

@Listeners(Script.ListnersTest.class)
public class TestLoginPage extends BaseTest {
	@Test
	public void TestLogin()
	{
		
	
		String un=XL.getCellValue(XL_PATH, "TestLoginPage", 1, 0);
		
		String pw=XL.getCellValue(XL_PATH, "TestLoginPage", 1, 1);
		
		LoginPage l=new LoginPage(driver);
		l.SetUserName(un);
		l.SetPassWord(pw);
		l.clickLogin();
	}

}
