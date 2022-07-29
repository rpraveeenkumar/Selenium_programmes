package org.screenshot;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	public static void main(String[] args) throws Throwable {
		

		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("http://www.flipkart.com/");
		
		ref.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(1500);
		WebElement search = ref.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Samsung S6+ lite");
		//ref.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
				
		Robot key=new Robot();
		key.keyPress(KeyEvent.VK_ENTER);
		
		ref.manage().window().maximize();
		
		Thread.sleep(1500);
		TakesScreenshot ts=(TakesScreenshot) ref;
		File op = ts.getScreenshotAs(OutputType.FILE);
		File loc = new File("D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Media\\img4.png");
		FileUtils.copyFile(op, loc);	
		
		Thread.sleep(1500);
		
		ref.close();
	


	}

}
