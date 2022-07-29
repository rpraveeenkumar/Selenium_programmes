package org.IPT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
	public static WebDriver driver;	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.myntra.com/kids?f=Categories%3ATshirts%3A%3AGender%3Aboys%2Cboys%20girls&plaEnabled=false");
		//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		List<Integer> priceList=new ArrayList<Integer>();
		int minPrice;
		List<WebElement> allPrices = driver.findElements(By.xpath("//li[@class=\"product-base\"]/descendant::span[@class='product-discountedPrice']"));
		for (WebElement price : allPrices) {
			String priceText = price.getText();
			System.out.println(priceText);
			int priceInt = Integer.parseInt(priceText.replace("Rs. ", ""));
			priceList.add(priceInt);
		}
		minPrice = Collections.min(priceList);
		System.out.println("minimum price is "+minPrice);
		//List<WebElement> findElement = driver.findElements(By.xpath("//span[@class='product-discountedPrice']/ancestor::div[@class='product-price']/precedgin-sibling::h3[@class='product-brand']"));
	}

}
	