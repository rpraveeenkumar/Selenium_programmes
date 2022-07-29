package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cursermove {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver sc=new ChromeDriver();
		
		//System.getProperty("webdrive.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		//WebDriver sc=new ChromeDriver();
		
		sc.get("http://www.leafground.com/pages/drop.html");
		
		WebElement pick = sc.findElement(By.id("draggable"));
		WebElement drop = sc.findElement(By.id("droppable"));
		Actions pi=new Actions(sc);
		
		//using dragAndDrop action
		//pi.dragAndDrop(pick, drop).build().perform();
		
		//using clicktoHold & MovetoElement action
		pi.clickAndHold(pick).moveToElement(drop).build().perform();
		
		
		
		
	}

}
