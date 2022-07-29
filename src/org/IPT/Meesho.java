package org.IPT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meesho {
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		List<Integer> list=new ArrayList<Integer>();
		
		driver.get("https://meesho.com/electronics/pl/fcom9?page=1");
		List<WebElement> allPrice = driver.findElements(By.xpath("//div[@class=\"sc-dkzDqf ProductList__GridCol-sc-8lnc8o-0 kmfTGq ZnDzz\"]/descendant::h5[@color='greyBase']"));
		for (WebElement price : allPrice) {
			String getPrice = price.getText();
			System.out.println(getPrice);
			int parseInt = Integer.parseInt(getPrice.replace("₹", ""));
			list.add(parseInt);
		}
		Integer min = Collections.min(list);	
		System.out.println("Minimum price is "+min);
		}
}
