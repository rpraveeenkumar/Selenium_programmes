package org.website_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DAY5_ACTIONS {
	
public static void main(String[] args) throws Throwable {
		
		//creating web driver
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("https://www.flipkart.com/");
		ref.manage().window().maximize();
		
		ref.findElement(By.xpath("//button[.='✕']")).click(); //for locating a test we can use the xpath like this .=''
		
		WebElement elec = ref.findElement(By.xpath("//div[.='Electronics']"));
		Actions builder=new Actions(ref);
		builder.moveToElement(elec).perform();
		
		WebElement lap = ref.findElement(By.linkText("Laptop and Desktop"));
		Actions builder2=new Actions(ref);
		builder2.moveToElement(lap).perform();
		
		ref.findElement(By.linkText("Gaming Laptops")).click();
		
		
//		WebElement gl = ref.findElement(By.linkText("Gaming Laptops"));
//		Actions builder3=new Actions(ref);
//		builder3.moveToElement(gl).perform();
//		builder3.click();
//		
		

}
}