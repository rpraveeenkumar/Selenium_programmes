package org.website_task;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex7 {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("https://www.justdial.com/Bangalore/Bakeries");
		
		ref.findElements(By.className("store-name"));
		
        List<WebElement> bakeries = ref.findElements(By.className("store-name"));

        System.out.println(bakeries.size());

        for (WebElement webElement : bakeries) {
            String name = webElement.getText();
            System.out.println(name);
        }
		
		
	}

}
