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


public class Organization extends GenericWrappers
{
    WebDriver driver;
    WebDriverWait wait;
	public Organization AddNewMem() throws InterruptedException
	{
		clickbyxpath("//*[@id=\"sidebar-organization\"]/div[2]/div[3]"); //Click on more org options.
		clickbyxpath("//*[@aria-label='Add organization member']"); //Click on Add org members option
		clickbycss("#gs-content-area > div > div:nth-child(1) > input"); // Enter email address text field
		enterByCSS("#gs-content-area > div > div:nth-child(1) > input", "qac_nov13@yopmail.com"); // Providing New User details in Email address field 
		clickbycss("#gs-content-area > div > button"); //Click on Invite button
		System.err.println("Invite new brand user from org is done.");
		return this;
	}
	
	
	public Organization rmpendinguser() throws InterruptedException {
		
		
		clickbycss("#gs-content-area > div > div:nth-child(1) > input"); // Enter email address text field
		System.err.println("focus on search field.");
		enterByCSS("#gs-content-area > div > div:nth-child(1) > input", "qa_mm_may3.2@yopmail.com"); // enter pending user email 
	//	clickbycss("#gs-content-area > div > button"); //Click on Invite button
		clickbycss("#gs-content-area > div > div:nth-child(4) > div.gs-org-members-list > div > div.gs-org-member-right > button.to-btn.to-btn-red.to-btn-med"); // Click on remove button
		System.err.println("removing a pending user is done");
		return this;
		
	}
	
	
public Organization resendpendinguser() throws InterruptedException {
		
		
		clickbycss("#gs-content-area > div > div:nth-child(1) > input"); // Enter email address text field
		System.err.println("focus on search field.");
		enterByCSS("#gs-content-area > div > div:nth-child(1) > input", "qac_nov13@yopmail.com"); // enter pending user email 
		clickbyxpath("//*[@id=\"gs-content-area\"]/div/div[2]/div[2]/div[1]/div[2]/button[2]"); // Click on resend button
		System.err.println("resend invite to a pending user is done");
		return this;
		
	}
	
	public Organization addExistingMem() {
		
	    return this;
		
	}
	
	
	public Organization verifyCreatedWS(String wsname)
	{
		verifyTextContainsByclass("workspace-tabs-ws-name", wsname);
		return this;
	}
	
}
