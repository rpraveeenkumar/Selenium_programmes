package org.javascript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		//System.setProperty("Webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		//WebDriver ref=new ChromeDriver();
		
		ref.get("https://www.flipkart.com/");
		ref.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		ref.manage().window().maximize();
		Thread.sleep(1500);
		
		JavascriptExecutor js=(JavascriptExecutor) ref;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1500);
		js.executeScript("window.scrollBy(100,0)");
		
		TakesScreenshot ts=(TakesScreenshot) ref;
		File op=ts.getScreenshotAs(OutputType.FILE);
		File loc = new File("D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Media\\scroll.png");
		FileUtils.copyFile(op, loc);	
		ref.close();
	
	}

}
