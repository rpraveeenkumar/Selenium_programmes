package org.website_task;

import javax.swing.tree.ExpandVetoException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Twitter {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("https://twitter.com/");
		
		ref.findElement(By.xpath("(//div[@dir='auto'])[8]")).click();
		ref.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("kumar");
		ref.findElement(By.xpath("(//div[@role='button'])[4]")).click();
		ref.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("finehada");
		WebElement cli = ref.findElement(By.xpath("(//div[@role='button'])[3]"));
		WebDriverWait wait=new WebDriverWait(ref, 10);
		
	}

}
