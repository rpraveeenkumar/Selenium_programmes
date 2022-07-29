package org.website_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6 {
	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
				
		ref.get("https://www.snapdeal.com/");
		ref.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ref.manage().window().maximize();
		ref.findElement(By.id("inputValEnter")).click();
	
		Robot rob = new Robot();
		
		rob.keyPress(KeyEvent.VK_O);
		rob.keyRelease(KeyEvent.VK_O);
		rob.keyPress(KeyEvent.VK_N);
		rob.keyRelease(KeyEvent.VK_N);
		rob.keyPress(KeyEvent.VK_E);
		rob.keyRelease(KeyEvent.VK_E);
		rob.keyPress(KeyEvent.VK_P);
		rob.keyRelease(KeyEvent.VK_P);
		rob.keyPress(KeyEvent.VK_L);
		rob.keyRelease(KeyEvent.VK_L);
		rob.keyPress(KeyEvent.VK_U);
		rob.keyRelease(KeyEvent.VK_U);
		rob.keyPress(KeyEvent.VK_S);
		rob.keyRelease(KeyEvent.VK_S);
		
		rob.keyPress(KeyEvent.VK_ENTER);
		
		JavascriptExecutor js=(JavascriptExecutor)ref;
		js.executeScript("window.scrollBy(0,750)");
		
		TakesScreenshot sc=(TakesScreenshot)ref;
		File scf=sc.getScreenshotAs(OutputType.FILE);
		File loc=new File("D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Media\\snapdeal.png");
		FileUtils.copyFile(scf, loc);
		
		
		
		
	}
}
