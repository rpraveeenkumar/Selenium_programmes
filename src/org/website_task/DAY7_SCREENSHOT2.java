package org.website_task;

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

public class DAY7_SCREENSHOT2 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//creating webdriver
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
				
		//getting into the url
		ref.get("https://www.flipkart.com/");
		ref.manage().window().maximize();
				
		//search iphone 13
		ref.findElement(By.xpath("//button[.='✕']")).click();
		ref.findElement(By.xpath("//input[@autocomplete='off']")).sendKeys("iphone 13");
				
		//choosing the product
		ref.findElement(By.className("L0Z3Pu")).click();
				
		ref.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ref.findElement(By.xpath("//div[.='APPLE iPhone 13 (Blue, 128 GB)']")).click();
	
		//switch to the tab
		Set<String> windows = ref.getWindowHandles();
		
		for (String window : windows) {
			if (!window.equals(windows)) {
				ref.switchTo().window(window);
			}
		}
		
		//add to cart
		
		ref.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(1500);
		
		//taking screenshot
		
		TakesScreenshot ts=(TakesScreenshot)ref;
		
		//creating output as a file
		File img=ts.getScreenshotAs(OutputType.FILE);
		
		//choosing the path
		
		File loc=new File("D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Media\\cart.png");
		FileUtils.copyFile(img, loc);
		
		ref.quit();
	
	
	
	}

}
