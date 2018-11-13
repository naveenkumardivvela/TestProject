package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;
import wrappers.ObjectRepository;


public class WorkSpace extends GenericWrappers
{
    WebDriver driver;
    WebDriverWait wait;
	public Task createNewWS() throws InterruptedException
	{
		clickbyxpath("//*[@id=\"sidebar-organization\"]/div[2]/div[2]"); // WS icon
		enterbyid("workspaceNameInput", "New WS");
		enterByXpath("//*[@id=\"create-project-view\"]/div[2]/div[4]/div[3]/div/textarea", "Test description");
		Thread.sleep(1000);
		clickbyid("createWorkspaceButton");
		clickbyxpath("//*[@id=\"members\"]/div[1]/div/div/a/i");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return new Task();
	}
	
	
	public WorkSpace addNewMem() throws InterruptedException {
		clickbyxpath("//*[@id=\"members\"]/div[1]/button");
		enterByCSS("input.add-members-input", "a@a.com");
		Thread.sleep(1000);
		clickbyxpath("//*[@id=\"members\"]/div[1]/div/div/div[5]/div[2]/button");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);				
		clickbyxpath("//*[@id=\"members\"]/div[1]/div/div/a/i");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return this;
		
	}
	
	public WorkSpace addExistingMem() {
		
	    return this;
		
	}
	
	
	public WorkSpace verifyCreatedWS(String wsname)
	{
		verifyTextContainsByclass("workspace-tabs-ws-name", wsname);
		return this;
	}
	
}
