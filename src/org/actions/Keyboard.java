package org.actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {
	
public static void main(String[] args) throws InterruptedException, AWTException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver sc=new ChromeDriver();
		
		sc.get("https://www.amazon.in/");
		Thread.sleep(1500);
		//single_click_option
		WebElement Search = sc.findElement(By.id("twotabsearchtextbox"));
        Actions a=new Actions(sc);
		a.click(Search).build().perform();
		
		Thread.sleep(1500);
		Robot ref=new Robot();
		ref.keyPress(KeyEvent.VK_M);
		
		ref.keyRelease(KeyEvent.VK_M);
		
		Thread.sleep(1500);
		ref.keyPress(KeyEvent.VK_O);
		ref.keyRelease(KeyEvent.VK_O);
		
		Thread.sleep(1500);
		ref.keyPress(KeyEvent.VK_B);
		ref.keyRelease(KeyEvent.VK_B);
		
		Thread.sleep(1500);
		ref.keyPress(KeyEvent.VK_I);
		ref.keyRelease(KeyEvent.VK_I);
		
		Thread.sleep(1500);
		ref.keyPress(KeyEvent.VK_L);
		ref.keyRelease(KeyEvent.VK_L);
		
		Thread.sleep(1500);
		ref.keyPress(KeyEvent.VK_E);
		ref.keyRelease(KeyEvent.VK_E);
		
		Thread.sleep(1500);
		ref.keyPress(KeyEvent.VK_ENTER);
		ref.keyRelease(KeyEvent.VK_ENTER);
		
		
}
}
