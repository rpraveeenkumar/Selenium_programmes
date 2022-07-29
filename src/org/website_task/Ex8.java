package org.website_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex8 {
	
	public static void main(String[] args) throws AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("https://www.flipkart.com/");
		ref.findElement(By.xpath("//button[.='✕']")).click();
		String Tab1 = ref.getTitle();
		
		WebElement mobile = ref.findElement(By.xpath("//div[text()='Mobiles']"));
		
		Actions ac=new Actions(ref);
		ac.contextClick(mobile).build().perform();
//		ac.keyDown(Keys.ARROW_DOWN).build().perform();
//		ac.keyUp(Keys.ARROW_DOWN).build().perform();
		
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
	}

}
