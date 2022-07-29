package org.alerts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		
		ref.get("http://www.leafground.com/");
		ref.findElement(By.xpath("//img[@alt='Alert']")).click();
		
		
		ref.findElement(By.xpath("//button[text()='Alert Box']")).click();
		Thread.sleep(1500);
		ref.switchTo().alert().accept();
		
		ref.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		Thread.sleep(1500);
		ref.switchTo().alert().dismiss();
		
		ref.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(1500);
		ref.switchTo().alert().sendKeys("Praveen");
		ref.switchTo().alert().accept();
		
		ref.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
		String text = ref.switchTo().alert().getText();
		System.out.println("The content from the warning tab is"+text);
		ref.switchTo().alert().accept();
		
		List<WebElement> findElements = ref.findElements(By.xpath("button"));
		for (WebElement webElement : findElements) {
			System.out.println(webElement.getText());
		}
		
		
	}

}
