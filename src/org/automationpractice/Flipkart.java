package org.automationpractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws Throwable {
		
		//launchbrower & login
		
		launchbrowser();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("r.praveenkumar@live.com");
		driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Mine1+6.");
		clickelement("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']");
		
		//search & choose the product
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]")).sendKeys("samsung s21fe");
		clickelement("//button[@type='submit']");
		clickelement("//a[@title=\"SAMSUNG Galaxy S21 FE 5G (Olive, 128 GB)\"]");
		
		//add to cart
		
		
		//taking screenshot
		Thread.sleep(2000);
		snip("D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Media\\filpkart.png");
		
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File snip = ts.getScreenshotAs(OutputType.FILE);
//		File loc = new File("D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Media\\filpkart.png");
//		FileUtils.copyFile(snip, loc);;
		
		
	}
	
	
	private static WebDriver launchbrowser() {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		 
		 return driver;
		 
	}
	
	private static WebDriver clickelement(String path) {
		
		driver.findElement(By.xpath(path)).click();
		return driver;

	}

	private static WebDriver snip(String location) throws IOException {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File snip = ts.getScreenshotAs(OutputType.FILE);
		File loc = new File(location);
		FileUtils.copyFile(snip, loc);
		return driver;
	}
	
	

}
