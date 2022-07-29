package org.automationpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Place_an_order {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
				
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.findElement(By.id("email")).sendKeys("r.praveenkumar@live.com");
		driver.findElement(By.id("passwd")).sendKeys("HiPraveen");
		driver.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title='Women']")).click();
		driver.findElement(By.xpath("(//img[@class='replace-2x'])[2]")).click();
		driver.findElement(By.id("layered_category_11")).click();
		driver.findElement(By.id("layered_id_feature_1")).click();
		driver.findElement(By.xpath("//a[@title='Printed Chiffon Dress']")).click();
		
		//WebElement qty = driver.findElement(By.id("quantity_wanted"));
		//qty.clear();
		//qty.sendKeys("5");
		
		driver.findElement(By.id("quantity_wanted")).clear();
		driver.findElement(By.id("quantity_wanted")).sendKeys("3");
		
		WebElement size = driver.findElement(By.id("group_1"));
		Select sel = new Select(size);
		sel.selectByValue("2");
		driver.findElement(By.id("color_15")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]")).click();
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Full fun");
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
	}

}
