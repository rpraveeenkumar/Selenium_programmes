package org.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

@SuppressWarnings("unused")
public class Multiselect {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");

	WebDriver sc=new ChromeDriver();
	
	sc.get("https://demoqa.com/select-menu");
	Select ar=new Select(sc.findElement(By.name("cars")));
	ar.selectByValue("saab");
	ar.selectByVisibleText("Audi");
	WebElement first = ar.getFirstSelectedOption();
	System.out.println(first.getText());
	ar.deselectAll();	
	
}
}
