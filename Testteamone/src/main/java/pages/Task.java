package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import wrappers.GenericWrappers;
import wrappers.ObjectRepository;

public class Task extends GenericWrappers {
	WebDriverWait wait = new WebDriverWait(driver,60) ;
	
	public Task	createTask() throws InterruptedException {
		
		
		clickbyxpath("//*[@aria-label='Attachments']"); // task_wsPlus_button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("attachment-menu-v2"))); // Attachments Dialog box
        driver.switchTo().activeElement();
        clickbyxpath("//img[@src='/images/add-new/ic_addnew_task.svg']"); // Click on Task option
        clickbyid("nh2-title"); 
		enterbyid("nh2-title", "New Task"); // Add Title
		/*driver.switchTo().defaultContent();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("iframe[title*='Rich Text Editor, editor1']")); // Focus to Desc frame
        clickbycss("[class*='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"); 
        enterByCSS("[class*='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']", "Description Added....");
        driver.switchTo().activeElement();*/
		  driver.switchTo().defaultContent();
		  clickbycss("[class*='to-btn to-btn-blue to-btn-med nh2-publish-btn']"); //click on publish button
		  driver.switchTo().defaultContent();
		  clickbycss("[class*='to-note-header-v2-close']"); //close the Task editor
		  
        return this;
		
	}
	
	public Task Assign() throws InterruptedException {
		
	    driver.switchTo().activeElement();
		clickbycss(".ws-tab-button-tasks"); //task button 
		clickbycss("#project_home_page > div > div.workspace-tabs.cb-content.cb-separator.clearfix > div > div.workspace-tabs-right > div.ws-tab-button-notes.to-icon-note.cb-border-primary.cb-hover");
		clickbycss(".ws-tab-button-tasks"); //task button 
		clickbycss(".related-notes:nth-child(1) .task-second-line"); // Choosing First task under list 
		clickbyxpath("//*[@id=\"inote-dashboard-right\"]/div/div[3]/div[2]/div/div[1]/div[2]/div/div[1]/div/div/div[2]/button[1]"); // Click on Assign option.
		driver.switchTo().activeElement(); 
		clickbyid("assignee-list");		// Click on user in Assign list
		clickbyxpath("//*[@id=\"inote-dashboard-right\"]/div/div[3]/div[1]/button/span"); // Back button in Task 
		return this;		
	}
	
public Task UnAssign() throws InterruptedException {
		
	
//	   	clickbycss(".ws-tab-button-tasks"); //task button 
		driver.switchTo().activeElement();
	    clickbycss(".related-notes:nth-child(1) .task-second-line"); // Choosing First task under list 
		clickbyxpath("//*[@id=\"inote-dashboard-right\"]/div/div[3]/div[2]/div/div[1]/div[2]/div/div[1]/div/div/div[2]/button[3]"); // Click on Assign option.
		clickbyxpath("//*[@id=\"inote-dashboard-right\"]/div/div[3]/div[1]/button/span");// Back button in Task 
		return this;		
	}

public Task Assigntome() throws InterruptedException {
	
	
//   	clickbycss(".ws-tab-button-tasks"); //task button 
    clickbycss(".related-notes:nth-child(1) .task-second-line"); // Choosing First task under list 
	clickbyxpath("//*[@id=\"inote-dashboard-right\"]/div/div[3]/div[2]/div/div[1]/div[2]/div/div[1]/div/div/div[2]/button[2]"); // Click on Assigntome option.
	clickbyxpath("//*[@id=\"inote-dashboard-right\"]/div/div[3]/div[1]/button/span");// Back button in Task 
	return this;		
}


}
