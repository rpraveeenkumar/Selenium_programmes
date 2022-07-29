package org.javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_passvalue {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("https://www.browserstack.com/users/sign_in");
		JavascriptExecutor js=(JavascriptExecutor)ref;
		
		//js.executeScript("document.getElementById('enter element id').click();");
		//js.executeScript("document.getElementById(id').value='someValue';");
		js.executeScript("document.getElementById('user_email_login').value=('Praveen')");
		js.executeScript("document.getElementById('user_password').value=('Hi12345.')");
		Thread.sleep(1500);
		js.executeScript("document.getElementById('user_submit').click()");
	
		
	}

}
