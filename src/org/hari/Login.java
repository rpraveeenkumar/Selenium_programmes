package org.hari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("http://rika.rejola.com/authentication/login");
		ref.manage().window().maximize();
		Thread.sleep(1500);
		WebElement username = ref.findElement(By.xpath("//input[@formcontrolname='userName']"));
		username.sendKeys("hari");
		WebElement pass = ref.findElement(By.xpath("//input[@formcontrolname='password']"));
		pass.sendKeys("letmein");
		ref.findElement(By.xpath("//button[@id='signIn']")).click();
		
	}
}
