package org.website_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX1 {
	
	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		//ref.get("https://www.facebook.com/");
		//WebElement email = ref.findElement(By.xpath("//input[@name='email']"));
		//email.sendKeys("praveen");
		//WebElement pass = ref.findElement(By.xpath("//input[@name='pass']"));
		//pass.sendKeys("praveen");
		
		//Thread.sleep(1500);
		//ref.switchTo().window(WindowType.TAB);
		
		//ref.get("https://www.redbus.in/");
		//WebElement from = ref.findElement(By.id("src"));
		//from.sendKeys("Coimbatore");
		//WebElement to = ref.findElement(By.id("dest"));
		//to.sendKeys("chennai");
		
		//Thread.sleep(1500);
		//ref.get("https://www.google.com/");
		//WebElement go = ref.findElement(By.name("q"));
		//go.sendKeys("Enter GreensTechnology");
		
		//Thread.sleep(1500);
		ref.get("https://praveen:praveen@www.lvbankonline.in/lvbretail/RetailLogin.html");
		ref.switchTo().window(arg0);
		WebElement user = ref.findElement(By.id("login_username|input"));
		user.sendKeys("praveen");
		WebElement pswd = ref.findElement(By.id("login_password|input"));
		pswd.sendKeys("praveen");
		
		//ref.get("https://infinity.icicibank.com/corp/Login.jsp");
		//ref.findElement(By.name("DUMMY1")).click();
		//WebElement user1 = ref.findElement(By.name("DUMMY1"));
		//user1.sendKeys("praveen");
		//WebElement pass1 = ref.findElement(By.xpath("//input[@title='Password']"));
		//pass1.sendKeys("praveen");
		
		//ref.get("https://twitter.com/login");
		//ref.findElement(By.name("text")).click();
		//ref.findElement(By.name("text")).sendKeys("Praveeb");
		
		//WebElement fe = ref.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-16y2uox r-1wbh5a2 r-1wzrnnt r-1udh08x r-xd6kpl r-1pn2ns4 r-ttdzmv']"));
		//fe.sendKeys("praveen");
		
		
		//WebElement us1 = ref.findElement(By.xpath("//input[@spellcheck='true']"));
		//us1.sendKeys("praveen");
		//WebElement pass = ref.findElement(By.xpath("//input[@name='pass']"));
		//pass.sendKeys("praveen");
		//spellcheck="true"
	
		//ref.get("https://netbanking.hdfcbank.com/");
		//WebElement us2 = ref.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		//us2.sendKeys("153624");
		
		
		//name="fldLoginUserId"
		
		
	}

}
