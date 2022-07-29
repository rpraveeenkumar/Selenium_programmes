package org.website_task;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DAY6_ROBOT_CLASS {
	
	public static void main(String[] args) throws AWTException {
		
		//create web driver
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();

//one method 
		//get into the page
		ref.get("https://www.facebook.com/");
		
		//find elements
		WebElement email = ref.findElement(By.name("email"));
		WebElement pass = ref.findElement(By.name("pass"));
		
//		//create actions syntax
//		Actions a=new Actions(ref);
//		
//		//pass the content
//		a.moveToElement(email).click().sendKeys("r.praveenkumar@live.com");
//		
//		//click Ctrl + a and Ctrl + c
//		
//		//option-1
//		
//		a.keyDown(Keys.CONTROL).sendKeys("a","c"); 
//		
//		//option-2
//		//a.keyDown(Keys.CONTROL).sendKeys("a"); 
//		//a.sendKeys("c");
//		
//		//move the paste location
//		a.moveToElement(pass).click().keyDown(Keys.CONTROL).sendKeys("V");
//		
//		//release the ctrl key
//		
//		a.keyUp(Keys.CONTROL).build().perform();
//		
//		ref.findElement(By.name("login")).click();
		
		
//another method
		
		email.sendKeys("r.praveenkumar@live.com");
		
		Actions ac=new Actions(ref);
		
		ac.moveToElement(email).click().build().perform();
		
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_A);
		rob.keyPress(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_C);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		ac.moveToElement(pass).click().build().perform();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_V);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		
		ref.findElement(By.name("login")).click();
	}

}
