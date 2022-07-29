package org.website_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DAY4_DEBUG_XPATH {
	
	public static void main(String[] args) {
		
		//creating webdriver
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver ref=new ChromeDriver();
		
		//getting into the website 
		ref.get("http://www.greenstechnologys.com");
		
		//list all the elements
//		List<WebElement> allElements = ref.findElements(By.tagName("p"));
//		for (WebElement para : allElements) {
//			System.out.println(para.getText());
//		}
	
		
		//list 3rd paragraph
		
//		List<WebElement> thirdElement = ref.findElements(By.tagName("p"));
//		for(int i =1;i<thirdElement.size();i++) {
//			
//			if (i==3) {
//		 String elementText = thirdElement.get(i).getText(); 
//		 System.out.println(elementText); 
//			}
//		}
		
		//1st two paragraphs
		
//		List<WebElement> oneandtwo = ref.findElements(By.tagName("p"));
//		for (int i = 0; i < oneandtwo.size(); i++) {
//			
//			if (i<2) {
//				String text = oneandtwo.get(i).getText();
//				System.out.println(text);
//			}
//			
//		}
		
		
		
	}

}
