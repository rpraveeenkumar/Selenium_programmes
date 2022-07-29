package org.automationpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sign_up {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		WebElement email = driver.findElement(By.id("email_create"));
		email.sendKeys("r.praveenkumar@live.com");
		driver.findElement(By.id("SubmitCreate")).click();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
				
		WebElement fname = driver.findElement(By.name("customer_firstname"));
		fname.sendKeys("Praveen");
		WebElement lname = driver.findElement(By.name("customer_lastname"));
		lname.sendKeys("Kumar");
		WebElement pass = driver.findElement(By.name("passwd"));
		pass.sendKeys("HiPraveen");
		
		WebElement day = driver.findElement(By.id("days"));
		Select sel=new Select(day);
		sel.selectByValue("29");
		
		WebElement month = driver.findElement(By.id("months"));
		Select sel2=new Select(month);
		sel2.selectByValue("1");
		
		WebElement years = driver.findElement(By.id("years"));
		Select sel3=new Select(years);
		sel3.selectByValue("1995");
		
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
		
		driver.findElement(By.id("company")).sendKeys("Praveenkumarvjx");
		driver.findElement(By.id("address1")).sendKeys("now fun");
		driver.findElement(By.id("address2")).sendKeys("next fun");
		driver.findElement(By.id("city")).sendKeys("always fun");
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select sel4=new Select(state);
		sel4.selectByValue("47");
		
		driver.findElement(By.id("postcode")).sendKeys("60002");
		
		WebElement id_country = driver.findElement(By.id("id_country"));
		Select sel5=new Select(id_country);
		sel5.selectByValue("21");
		
		driver.findElement(By.id("other")).sendKeys("Have fun");
		driver.findElement(By.id("phone")).sendKeys("04254-274425");
		driver.findElement(By.id("phone_mobile")).sendKeys("9566971997");
		driver.findElement(By.id("submitAccount")).click();
		
		
	}

}
