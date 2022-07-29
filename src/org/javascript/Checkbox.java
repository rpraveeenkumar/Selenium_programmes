package org.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("https://demoqa.com/automation-practice-form");
		
		JavascriptExecutor js=(JavascriptExecutor)ref;
		Thread.sleep(1500);
		//js.executeScript("document.getElementById('enter element id').checked=false;");
		js.executeScript("document.getElementById('hobbies-checkbox-1').checked=true");
		js.executeScript("document.getElementById('hobbies-checkbox-2').checked=true");
		js.executeScript("document.getElementById('hobbies-checkbox-3').checked=true");
		
		Thread.sleep(1500);
		js.executeScript("history.go(0)");
		js.executeScript("alert('Welcome To Selenium Testing');");
		
		//String innerText = js.executeScript(" return document.documentElement.innerText;").toString();
		//System.out.println(innerText);

		
		
	}	

}
