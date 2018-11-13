package pages;

import wrappers.GenericWrappers;
import wrappers.ObjectRepository;

public class Login extends GenericWrappers
{

	
	public Login enterusername(String data)
	{
		enterbyid("username", data);
		return this;
		
	}
	public Login enterpassword(String data)
	{
		enterbyid("password", data);
		return this;
		
	}
	public Organization clicklogin()
	{
		clickbyid("t1li");
		return new Organization();
		
	}
	
	// This is under Debugging State
/*public WorkSpace clickgooglesignin()  
{
	clickbyclass("abcRioButtonContentWrapper");
	switchToLastWindow();
	enterbyid("identifierId", "bsfttestmail1");
	clickbyclass("CwaK9");
	//enterByName("password", "Broadsoft123$");
	enterByXpath("//*[@id=\"password\"]/div[1]/div/div[1]/input", "Broadsoft@123");
	clickbyxpath("//*[@id=\'passwordNext\']/content/span");
	return new WorkSpace();
}*/
}
