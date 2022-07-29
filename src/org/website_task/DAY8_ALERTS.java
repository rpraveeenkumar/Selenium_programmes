package org.website_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAY8_ALERTS {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();

		
//		//alerts trail
//		ref.get("http://www.leafground.com/pages/Alert.html");
//		ref.manage().window().maximize();
//		ref.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
//		ref.switchTo().alert().accept();
		
		ref.get("https://paytm.com/");
		ref.manage().window().maximize();
		
		ref.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(3000);
		ref.switchTo().frame(0);
		ref.findElement(By.xpath("//span[@class='ng-scope']")).click();
		
		Thread.sleep(3000);
		ref.findElement(By.xpath("//span[.='close']")).click();
		
	}

}
