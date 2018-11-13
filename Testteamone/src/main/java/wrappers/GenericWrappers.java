package wrappers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GenericWrappers extends ObjectRepository
{

	// static WebDriver driver = new ChromeDriver();
	public static WebDriver driver = new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,30) ;
	
	public void launchBrowser() 
	{
		
		System.setProperty("webdriver.chrome.driver", "./chromedriver");
		driver.manage().window().maximize();
		driver.get("https://appdev.dev.team-one.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}

	// This method will click the element using id as locator

	public void clickbyid(String id) {
		try {
//			driver.findElement(By.id(id)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).click();
		} catch (NoSuchElementException e) {
			System.out.println("Element located by " + id + "is not found to click");
		} catch (Exception e) {
			System.out.println("Unknown exception occured by locating "+ id);
		}
	}

	// This method will click the element using name as locator
	public void clickbyname(String name) {
		try {
//			driver.findElement(By.className(name)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(name))).click();

		} catch (NoSuchElementException e) {
			System.out.println("Element is not found to click");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while clicking element "+ name);
		}
	}

	// This method will click the element using class as locator
	public void clickbyclass(String classname) {
		try {
//			driver.findElement(By.className(classname)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(classname))).click();

		} catch (NoSuchElementException e) {
			System.out.println("Element is not found to click");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while clicking element "+ classname);
		}
	}

	// This method will click the element using CSS as locator
		public void clickbycss(String css) {
			try {
//				driver.findElement(By.cssSelector(css)).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(css))).click();

			} catch (NoSuchElementException e) {
				System.out.println("Element is not found to click");
			} catch (Exception e) {
				System.out.println("Unknown exception occured while clicking element "+ css);
			}
		}
	// This method will click the element using xpath as locator
	public void clickbyxpath(String xpath) {
		try {
//			driver.findElement(By.xpath(xpath)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath))).click();

		} catch (NoSuchElementException e) {
			System.out.println("Element located by" + xpath+"is not found to click");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while clicking element" + xpath);
		}
	}

	// This method will click the element using link as locator
	public void clickByLink(String name) {
		try {
//			driver.findElement(By.linkText(name)).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(name))).click();

		} catch (NoSuchElementException e) {
			System.out.println("Element is not found to click");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while clicking element " + name);
		}
	}

	// This method will enter the value to the text field using id
	public void enterbyid(String id, String data) {
		try {
			driver.findElement(By.id(id)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(id))).sendKeys(data);
//			driver.findElement(By.id(id)).sendKeys(data);
		} catch (NoSuchElementException e) {
			System.out.println("Element located by " + id + "is not found to enter data");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while entering data" + id);
		}
	}

	// This method will enter the value to the text field using name
	public void enterByName(String nameValue, String data) {
		try {
			driver.findElement(By.name(nameValue)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(nameValue))).sendKeys(data);
		} catch (NoSuchElementException e) {
			System.out.println("Element located by " + nameValue + "is not found to enter data ");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while entering data " + nameValue);
		}

	}

	// This method will enter the value to the text field using class
	public void enterbyclass(String classname, String data) {
		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(classname))).sendKeys(data);
		} catch (NoSuchElementException e) {
			System.out.println("Element located by " + classname + "is not found to enter data");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while entering data " + classname);
		}
	}

	// This method will enter the value to the text field using Xpath
	public void enterByXpath(String xpathValue, String data) {
		try {
			driver.findElement(By.xpath(xpathValue)).clear();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathValue))).sendKeys(data);
		} catch (NoSuchElementException e) {
			System.out.println("Element located by " + xpathValue + "is not found to enter data");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while entering data" + xpathValue);
		}

	}
	
	// This method will enter the value to the text field using CSS
		public void enterByCSS(String CSSValue, String data) {
			try {
				driver.findElement(By.cssSelector(CSSValue)).clear();
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(CSSValue))).sendKeys(data);
			} catch (NoSuchElementException e) {
				System.out.println("Element located by " + CSSValue + " is not found  to perform key");
			} catch (Exception e) {
				System.out.println("Unknown exception occured while entering data "+ CSSValue);
			}

		}
		
	public void enterByCSS(String cSSValue, Keys data) {
		try {
			driver.findElement(By.cssSelector(cSSValue)).clear();
			driver.findElement(By.cssSelector(cSSValue)).sendKeys(data);
		} catch (NoSuchElementException e) {
			System.out.println("Element located by " + cSSValue + "is not found to enter data");
		} catch (Exception e) {
			System.out.println("Unknown exception occured while entering data " + cSSValue);
		}
		}
		

	// This method will verify the given text is available in the element using id
	public void verifyTextByid(String id, String text) {
		try {
			String sText = driver.findElement(By.id(id)).getText();
			if (sText.equalsIgnoreCase(text)) {
				System.out.println("Text is equal");
			} else {
				System.out.println("Text is not equal");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found ");
		} catch (Exception e) {
			System.out.println("Unknown exception occured ");
		}

	}

	// This method will verify the given partial text is available in the element
	// using id
	public void verifyTextContainsByid(String id, String text) {
		try {
			String sText = driver.findElement(By.id(id)).getText();
			if (sText.contains(text)) {
				System.out.println("Text is equal");
			} else {
				System.out.println("Text is not equal");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found ");
		} catch (Exception e) {
			System.out.println("Unknown exception occured ");
		}
	}

	// This method will verify the given text is available in the element using Xpath
	public void verifyTextByXpath(String xpath, String text) {
		try {
			String sText = driver.findElement(By.xpath(xpath)).getText();
			if (sText.equalsIgnoreCase(text)) {
				System.out.println("Text is equal");
			} else {
				System.out.println("Text is not equal");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found ");
		} catch (Exception e) {
			System.out.println("Unknown exception occured ");
		}

	}

	// This method will verify the given partial text is available in the element using xpath
	public void verifyTextContainsByXpath(String xpath, String text) {
		try {
			String sText = driver.findElement(By.xpath(xpath)).getText();
			if (sText.contains(text)) {
				System.out.println("Text is equal");
			} else {
				System.out.println("Text is not equal");
			}
		} catch (NoSuchElementException e) {
			System.out.println("Element is not found ");
		} catch (Exception e) {
			System.out.println("Unknown exception occured ");
		}
	}
	// This method will verify the given partial text is available in the element using class
		public void verifyTextContainsByclass(String classnme, String text) {
			try {
				String sText = driver.findElement(By.className(classnme)).getText();
				if (sText.contains(text)) {
					System.out.println(text+"is displaying ");
				} else {
					System.out.println(text+"is not displaying ");
				}
			} catch (NoSuchElementException e) {
				System.out.println("Element is not found ");
			} catch (Exception e) {
				System.out.println("Unknown exception occured ");
			}
		}

	// This method will verify the title of the browser
	public boolean verifyTitle(String title) {
		boolean bReturn = false;
		try {
			if (driver.getTitle().equalsIgnoreCase(title)) {
				bReturn = true;
			} else {
				System.out.println("Title is not equal");
			}
		} catch (Exception e) {
			System.out.println("Unknown exception occured ");
		}
		return bReturn;
	}
//This method will mouse over on the element using xpath as locator
	public void mouseOverByXpath(String xpathVal) {
	try{
		new Actions(driver).moveToElement(driver.findElement(By.xpath(xpathVal))).build().perform();
	}catch (NoSuchElementException e) {
		System.out.println("Element is not found ");
	} catch (Exception e) {
		System.out.println("Unknown exception occured ");
	}
	}
	//This method will mouse over on the element using linktext as locator
	public void mouseOverByLinkText(String linkName) {
		try{
			new Actions(driver).moveToElement(driver.findElement(By.linkText(linkName))).build().perform();
		}catch (NoSuchElementException e) {
			System.out.println("Element is not found ");
		} catch (Exception e) {
			System.out.println("Unknown exception occured ");
		}
	}
	//This method will return the text of the element using id as locator
	public String getTextById(String idVal) {
		String bReturn = "";
		try{
			return driver.findElement(By.id(idVal)).getText();
		}catch (NoSuchElementException e) {
			System.out.println("Element is not found ");
		} catch (Exception e) {
			System.out.println("Unknown exception occured ");
		}
		return bReturn; 
	}
	//This method will return the text of the element using xpath as locator
		public String getTextByxpath(String xpath) {
			String bReturn = "";
			try{
				return driver.findElement(By.xpath(xpath)).getText();
			}catch (NoSuchElementException e) {
				System.out.println("Element is not found ");
			} catch (Exception e) {
				System.out.println("Unknown exception occured ");
			}
			return bReturn; 
		}
		//This method will select the drop down value using id as locator
		public void selectdropdownvalueById(String id, String value) {
			try{
				new Select(driver.findElement(By.id(id))).selectByVisibleText(value);
			}catch (NoSuchElementException e) {
				System.out.println("Element is not found ");
			} catch (Exception e) {
				System.out.println("Unknown exception occured ");
			}
		}
		//This method will select the drop down value using xpath as locator
		public void selectVisibileTextByXPath(String xpath, String value) {
			try{
				new Select(driver.findElement(By.xpath(xpath))).selectByVisibleText(value);
			}catch (NoSuchElementException e) {
				System.out.println("Element is not found ");
			} catch (Exception e) {
				System.out.println("Unknown exception occured ");
			}
		}
		//This method will select the drop down value using id as locator
		public void selectIndexById(String id, String value) {
			try{
				new Select(driver.findElement(By.id(id))).selectByIndex(Integer.parseInt(value));
			}catch (NoSuchElementException e) {
				System.out.println("Element is not found ");
			} catch (Exception e) {
				System.out.println("Unknown exception occured ");
			}
		}
		public void switchToParentWindow() {
			try {
				Set<String> winHandles = driver.getWindowHandles();
				for (String wHandle : winHandles) {
					driver.switchTo().window(wHandle);
					break;
				}
			} catch (Exception e) {
				System.out.println("The window could not be switched to the first window.");
			}
		}

		public void switchToLastWindow() {
			try {
				Set<String> winHandles = driver.getWindowHandles();
				for (String wHandle : winHandles) {
					driver.switchTo().window(wHandle);
				}
			} catch (Exception e) {
				System.out.println("The window could not be switched to the last window.");
			}
		}
		
		
	//This method is used to quit the browser
		public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("Unknown exception occured ");
		}

	}
		
		public void enterByXpathandEnter(String xpathValue, String data) {
			try {
				driver.findElement(By.xpath(xpathValue)).clear();
				driver.findElement(By.xpath(xpathValue)).sendKeys(data);
				driver.findElement(By.xpath(xpathValue)).sendKeys(Keys.ENTER);
			} catch (NoSuchElementException e) {
				System.out.println("Element is not found  to enter data");
			} catch (Exception e) {
				System.out.println("Unknown exception occured ");
			}

		}

		public void switchFrameUsingId(int id)
		{
			try
			{
				driver.switchTo().frame(id);
				
			}catch (NoSuchElementException e) {
				System.out.println("Element is not found  to enter data");
			} catch (Exception e) {
				System.out.println("Unknown exception occured ");
			}
		}
		public void switchFrameUsingName(String Name)
		{
			try
			{
				driver.switchTo().frame(Name);
				
			}catch (NoSuchElementException e) {
				System.out.println("Element is not found  to enter data");
			} catch (Exception e) {
				System.out.println("Unknown exception occured ");
			}
		}
		public void switchtomainframe()
		{
			try
			{
				driver.switchTo().parentFrame();
			    driver.switchTo().defaultContent();
			    
			}catch (NoSuchElementException e) {
				System.out.println("Element is not found  to enter data");
			} catch (Exception e) {
				System.out.println("Unknown exception occured ");
			}
		}
		
	    
		public void closeBrowser() {
			try {
				driver.close();
			} catch (Exception e) {
				System.out.println("Unknown exception occured ");
			}

		}
}
