package org.frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		
		ref.get("http://demo.automationtesting.in/Frames.html");
		
		ref.switchTo().frame(0);
		WebElement in = ref.findElement(By.xpath("//input[@type='text'][1]"));
		in.sendKeys("This is inner frame");
		
		
		//so multi frame
		ref.switchTo().defaultContent();
		ref.findElement(By.xpath("//a[@href='#Multiple']")).click();
		
		WebElement f1 = ref.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		ref.switchTo().frame(f1);
		Thread.sleep(1500);
		
		WebElement f2 = ref.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		ref.switchTo().frame(f2);
		Thread.sleep(1500);
		
		WebElement ref2 = ref.findElement(By.xpath("//input[@type='text'][1]"));
		ref2.sendKeys("This is outer frame");
				
	}

}
