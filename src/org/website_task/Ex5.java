package org.website_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex5 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("http://www.flipkart.com/");
		ref.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ref.manage().window().maximize();
		
		ref.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		Thread.sleep(1500);
		//ref.findElement(By.className("_3704LK")).sendKeys("Oneplus");
		
		
		
		//ref.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//WebElement fashion = ref.findElement(By.xpath("//img[@alt='Fashion']"));
		//Actions ac=new Actions(ref);
		//ac.moveToElement(fashion).build().perform();
		
		//ref.findElement(By.xpath("//(//a[@class='_6WOcW9'])[3]")).click();
		
		//WebElement ethnic = ref.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		//Actions ac2=new Actions(ref);
		//ac2.moveToElement(ethnic).build().perform();
		
		
	}

}
