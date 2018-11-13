package testcase;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.TestDataProvider;

public class TC_login extends pages.Login
{


	@DataProvider(name = "fetchData")
	public Object[][] getData() 
	{
		return TestDataProvider.getSheet("TC001");
	}

	
	@Test(dataProvider="fetchData")
	public void login(String uname,String pwd) throws InterruptedException
	{
		launchBrowser(); // launch the browser
		enterusername(uname);
		enterpassword(pwd);
		clicklogin();
	}
}
