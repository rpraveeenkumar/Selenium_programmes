package org.website_task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EX3 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("http://www.greenstechnologys.com/");
		ref.findElement(By.xpath("//a[contains(text(),'CONTACT')]")).click();
		
		JavascriptExecutor js=(JavascriptExecutor) ref;
		js.executeScript("window.scrollBy(0,1000)");

		ref.findElement(By.id("InputName")).sendKeys("Praveen");
		ref.findElement(By.id("InputEmail1")).sendKeys("Praveen@gmail.com");
		ref.findElement(By.id("InputSubject")).sendKeys("9566971997");
		WebElement cour = ref.findElement(By.xpath("//select[@name='courses']"));
		Select sc=new Select(cour);
		sc.selectByValue("Selenium");
		
		WebElement bran = ref.findElement(By.xpath("//select[@name='branch']"));
		Select sc1=new Select(bran);
		sc1.selectByValue("OMR");
		
		WebElement time = ref.findElement(By.xpath("//select[@name='time']"));
		Select sc2=new Select(time);
		sc2.selectByValue("Immediately");
		
		ref.findElement(By.xpath("//textarea[@placeholder='Message*']")).sendKeys("Hi how are you");
			
		
	}

}
