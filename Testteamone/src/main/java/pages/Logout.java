package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;

public class Logout extends GenericWrappers{
	
	WebDriverWait wait = new WebDriverWait(driver,60) ;

	public Login logout()
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cb-sidebar"))); 
		driver.switchTo().activeElement();
		clickbyclass("sb-icon to-icon-sb_info");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("to-dropdown sidebar-help-dropdown")));
		driver.switchTo().activeElement();
		clickbyclass("to-ddi sbh-sign-out");
		return new Login();

	}
}
