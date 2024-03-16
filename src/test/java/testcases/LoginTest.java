package testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utilities.DataUtil;

public class LoginTest extends BaseTest {
	
	
	@Test(dataProviderClass = DataUtil.class, dataProvider = "dp")
	public void doLogin(String username, String password) {
		
		type("username_ID",username);
		click("nextBtn_XPATH");
		type("pass_CSS",password);
		
		
	}
	
	

}
