package org.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver sc=new ChromeDriver();
		
		sc.get("https://www.amazon.in/");
		Thread.sleep(1500);
		//single_click_option
		WebElement Search = sc.findElement(By.id("twotabsearchtextbox"));
        Actions a=new Actions(sc);
		a.click(Search).build().perform();
		Search.sendKeys("samsung s6 lite");
		
		//Thread.sleep(1500);
		//double_click_option		
		//WebElement Cloth = sc.findElement(By.xpath("//img [@alt='Clothing']"));
		//Actions b=new Actions(sc);
		//b.doubleClick(Cloth).build().perform();
		
		//contextclick
		//WebElement Mob = sc.findElement(By.xpath("//a[text()='Mobiles']"));
		//Actions c=new Actions(sc);
		//c.contextClick(Mob).build().perform();
			
				
	}

}
