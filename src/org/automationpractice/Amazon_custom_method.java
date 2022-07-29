package org.automationpractice;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_custom_method {
	
	public static WebDriver driver;
	
	public static void main(String[] args)throws Throwable {
		
		//launch browser & sing in
		launchbrowser();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		clickelement("(//a[@data-nav-role='signin'])[1]");
		keytosend("//input[@type='email']", "9597151868");
		clickelement("//input[@id='continue']");
		keytosend("//input[@type='password']", "Thisispriya");
		clickelement("//input[@id='signInSubmit']");
		
		//select the product
		keytosend("//input[@id='twotabsearchtextbox']", "oneplus 10 pro");
		clickelement("//input[@id='nav-search-submit-button']");
		clickelement("//span[.='OnePlus 10 Pro 5G (Emerald Forest, 12GB RAM, 256GB Storage)']");
		
		//switch to tab
		switchtab();
		//driver.findElement(By.className(className))
		
		//add to cart, taking snip & remove from cart
		clickelement("//input[@id='add-to-cart-button']");
		Thread.sleep(2000);
		driver.findElement(By.id("attach-sidesheet-view-cart-button")).click();
		snip("D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Media\\oneplus10pro.png");
		clickelement("//input[@value='Delete']");
		driver.close();
		driver.quit();
		
	}

	public static WebDriver launchbrowser() {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	private static WebDriver clickelement(String path) {
		driver.findElement(By.xpath(path)).click();
		return driver;
	}
	
	private static WebDriver keytosend (String path, String send) {
		driver.findElement(By.xpath(path)).sendKeys(send);
		return driver;
	}
	
	private static WebDriver switchtab() {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!window.equals(windows)) {
				driver.switchTo().window(window);
			}
		}
		return driver;
	}
	
	private static WebDriver snip(String location) throws IOException  {
		TakesScreenshot tc=(TakesScreenshot)driver;
		File file = tc.getScreenshotAs(OutputType.FILE);
		File loc=new File(location);
		FileUtils.copyFile(file, loc);
		return driver;
	}

}
