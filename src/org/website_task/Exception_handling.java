package org.website_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception_handling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("https://www.google.co.in/");
		//ref.findElement(By.name("fake")).click();
		
		try {
			ref.findElement(By.name("fake")).click();
		} catch (Exception e) {
			System.out.println("No such element found");
			
			//throw(e);
		}
		
		String title = ref.getTitle();
		System.out.println(title);
	}

}
