package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introprog {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		//this is default sysntex for selenium to intract with the browser
		//webdriver.chrome.driver is common
		//copy the chromedriver location from driver-->chromedriver-->properties 
		
		WebDriver ref=new ChromeDriver();
		ref.get("https://www.google.com/");
		String title = ref.getTitle();
		System.out.println("Current page Title is "+title);
		
		String Url = ref.getCurrentUrl();
		System.out.println(Url);
		
		Thread.sleep(3000);
		
		ref.navigate().to("https://www.amazon.in/");
		String title2 = ref.getTitle();
		System.out.println(title2);
		
		String currentUrl = ref.getCurrentUrl();
		System.out.println(currentUrl);
		
		ref.navigate().refresh();
		
		Thread.sleep(3000);
		
		ref.navigate().back();
		String title3 = ref.getTitle();
		System.out.println(title3);
		
		String currentUrl2 = ref.getCurrentUrl();
		System.out.println(currentUrl2);
		
		Thread.sleep(3000);
		
		ref.navigate().forward();
		
		String title4 = ref.getTitle();
		System.out.println(title4);
		String currentUrl3 = ref.getCurrentUrl();
		System.out.println(currentUrl3);
		
		ref.close();
		
				
		
	
	}

}
