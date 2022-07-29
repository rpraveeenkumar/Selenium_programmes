package org.automationpractice;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maven_Flipkart {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		launchbrowser();
		driver.get("https://www.flipkart.com/");
		//clickelement("//button[.='✕']");
		
		//login
		keytosend("//input[@class='_2IX_2- VJZDxU']", "r.praveenkumar@live.com");
		keytosend("//input[@type='password']", "Mine1+6.");
		clickelement("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
		//Thread.sleep(5000);
		
		//choose product
		keytosend("//input[@class='_3704LK']", "samsung galaxy s22 ultra");
		clickelement("//button[@type='submit']");
		clickelement("//div[.='SAMSUNG Galaxy S22 ultra 5G (Burgundy, 256 GB)']");
		swithTab();
		clickelement("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
		Thread.sleep(3000);
		pageScroll();
		snip("D:\\Praveen\\Selenium\\eclipse-workspace 2\\Maven_practice\\Screenshots\\S22.png");
		clickelement("(//div[.='Remove'])[1]");
		close();
		quit();
		
	}
	
	public static WebDriver launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public static void keytosend(String path, String value) {
		
		driver.findElement(By.xpath(path)).sendKeys(value);
		
	}
	
	public static void clickelement(String path) {
		driver.findElement(By.xpath(path)).click();
	}
	
	public static void swithTab() {
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			if (!window.equals(windows)) {
				driver.switchTo().window(window);
			}
		}
	}
	
	public static void snip(String path) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File pic = ts.getScreenshotAs(OutputType.FILE);
		File loc = new File(path);
		FileUtils.copyFile(pic, loc);
		
	}
	
	private static void close() {
	
		driver.close();
	}
	
	private static void quit() {
		
		driver.quit();
	}
	
	private static void pageScroll() {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");

	}
	
}
