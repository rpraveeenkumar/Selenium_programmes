package org.website_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Print_paragraph_from_webpage {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		ref.get("http://www.greenstechnologys.com");
		List<WebElement> review = ref.findElements(By.xpath("//p"));
		for (WebElement para : review) {
			System.out.println(para.getText());
		}
		
		
	}
}
