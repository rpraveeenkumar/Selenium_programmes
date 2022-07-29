package org.website_task;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Methods {
	
	static WebDriver ref;
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
	WebDriver ref=new ChromeDriver();
	
	ref.get("https://www.facebook.com/");
	ref.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	ref.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	WebElement day = ref.findElement(By.xpath("//select[@name='birthday_day']"));
//	Select s1=new Select(day);
//	s1.selectByValue("29");
	
	WebElement month = ref.findElement(By.xpath("//select[@title='Month']"));
//	Select s2=new Select(month);
//	s2.selectByValue("1");

	WebElement year = ref.findElement(By.xpath("//select[@name='birthday_year']"));
//	Select s3=new Select(year);
//	s3.selectByValue("1995");
	
	doSelectByVisibleText(day, 29);
	doSelectByVisibleText(month, 1);
	doSelectByVisibleText(year, 1995);
	
	
}
	
	public static WebElement getElement(By locator) {
		
		return ref.findElement(locator);
		
		
	}
	
	public static void doSelectByVisibleText (By locator, String value) {
	Select sel = new Select(getElement(locator));	
	sel.selectByVisibleText(value);
	}
	
	
	
	
}