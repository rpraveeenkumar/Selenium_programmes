package org.website_task;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EX4 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("http://demo.guru99.com/test/drag_drop.html");
		ref.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement bank = ref.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement acc = ref.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions ac=new Actions(ref);
		ac.dragAndDrop(bank, acc).build().perform();
		
		WebElement money = ref.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement acc2 = ref.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		Actions ac2=new Actions(ref);
		ac2.dragAndDrop(money, acc2).build().perform();
		
		WebElement sale = ref.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement acc3 = ref.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		Actions ac3=new Actions(ref);
		ac3.dragAndDrop(sale, acc3).build().perform();
		
		WebElement money2 = ref.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement acc4 = ref.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		Actions ac4=new Actions(ref);
		ac4.dragAndDrop(money2, acc4).build().perform();
		
		
		
		
				
		
	}

}
