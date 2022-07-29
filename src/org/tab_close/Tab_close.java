package org.tab_close;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_close {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("https://www.amazon.in/");
		ref.manage().window().maximize();
		String windowHandle = ref.getWindowHandle();
		System.out.println(windowHandle);
		
		WebElement Mob = ref.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles']"));
		Actions ac=new Actions(ref);
		ac.contextClick(Mob).build().perform();	
		Robot rob=new Robot();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		
		
		WebElement Fas = ref.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_fashion']"));
		ac.contextClick(Fas).build().perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		
		
		WebElement Elec = ref.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_electronics']"));
		ac.contextClick(Elec).build().perform();
		rob.keyPress(KeyEvent.VK_DOWN);
		rob.keyRelease(KeyEvent.VK_DOWN);
		rob.keyPress(KeyEvent.VK_ENTER);
		
		Set<String> allwin = ref.getWindowHandles();
		System.out.println(allwin);
		
		int size = ref.getWindowHandles().size();
		System.out.println(size);
		
		Thread.sleep(1500);
		
		Iterator<String> iter = allwin.iterator();
		while (iter.hasNext()) {
			String child = iter.next();
			if (!windowHandle.equals(child)) {
				String title = ref.switchTo().window(child).getTitle();
				System.out.println(title);
				ref.close();
				
			}
			
		}
		
	}

	
}
