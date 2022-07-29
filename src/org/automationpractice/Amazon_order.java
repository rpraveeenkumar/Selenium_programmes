package org.automationpractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_order {

	public static void main(String[] args) throws InterruptedException {
		
		//creating web driver
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		//getting into the page
		ref.get("https://www.amazon.in/");
		ref.manage().window().maximize();
		ref.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		//login
		ref.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		ref.findElement(By.id("ap_email")).sendKeys("9597151868");
		ref.findElement(By.id("continue")).click();
		ref.findElement(By.id("ap_password")).sendKeys("Thisispriya");
		ref.findElement(By.id("signInSubmit")).click();
		Set<String> windows1 = ref.getWindowHandles();
		String title1 = ref.getTitle();
		System.out.println(title1);
		
		//choosing the product
		JavascriptExecutor js=(JavascriptExecutor)ref;
		js.executeScript("window.scrollBy(0,650)");
		ref.findElement(By.xpath("//span[text()='Mobiles']")).click();
		ref.findElement(By.xpath("//span[text()='Smartphones & Basic Mobiles']")).click();
		ref.findElement(By.xpath("//span[text()='OnePlus']")).click();
		ref.findElement(By.xpath("//span[text()='OnePlus 10R 5G (Forest Green, 12GB RAM, 256GB Storage, 80W SuperVOOC)']")).click();
		
		
		//select the varient
		Set<String> windows = ref.getWindowHandles();
		System.out.println("Total windows are "+windows.size());
		
		for (String window : windows) 
		{
			
			if (!window.equals(windows1)) 
			{
				ref.switchTo().window(window);
			}
		}
		String title2 = ref.getTitle();
		System.out.println(title2);
		
		//add to cart
		ref.findElement(By.id("size_name_1")).click();
		ref.findElement(By.id("add-to-cart-button")).click();
		
		//remove from cart
		ref.findElement(By.id("attach-sidesheet-view-cart-button")).click();
		Thread.sleep(3000);
		
		ref.findElement(By.xpath("(//input[@value='Delete'])[1]")).click();
		ref.close();
		ref.quit();
		}
}
