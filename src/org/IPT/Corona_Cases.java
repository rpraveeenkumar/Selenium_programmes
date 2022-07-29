package org.IPT;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Corona_Cases {
	
	static WebElement TC;
	static WebElement NC;
	static WebElement TD;
	static WebElement SC;
	static WebElement RC;
	static WebElement AC;
	static WebElement TCPM;
	static WebElement TDPM;
	static WebElement TT;
	static WebElement TTPM;
	static WebElement POP;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Praveen\\Selenium\\eclipse-workspace 2\\Selenium1\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		String cn= "India";
		
		driver.get("https://www.worldometers.info/coronavirus/");
		List<WebElement> allCountry = driver.findElements(By.xpath("//table[@id='main_table_countries_today']//tr[@role=\"row\"]//a[@class='mt_a']"));
		for (WebElement CountryName : allCountry) {
			String CountryText = CountryName.getText();
			System.out.println(CountryName.getText());
			if (CountryText.equals(cn)) {
				TC = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style='font-weight: bold; text-align:right'][1]"));
				NC = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style='font-weight: bold; text-align:right;'][1]"));
				TD = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style='font-weight: bold; text-align:right;'][2]"));
				SC = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style=\"font-weight: bold; text-align:right\"][3]"));
				RC = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style='font-weight: bold; text-align:right'][2]"));
				AC = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style='text-align:right;font-weight:bold;']"));
				TCPM = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style=\"font-weight: bold; text-align:right\"][4]"));
				TDPM = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style=\"font-weight: bold; text-align:right\"][5]"));
				TT = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style=\"font-weight: bold; text-align:right\"][6]"));
				TTPM = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style=\"font-weight: bold; text-align:right\"][7]"));
				POP = driver.findElement(By.xpath("//td[@style='font-weight: bold; font-size:15px; text-align:left;']//following-sibling::td[@style=\"font-weight: bold; text-align:right\"][8]"));
			}
		}
		System.out.println("******************************************");
		System.out.println("Total cases in "+cn+" is "+TC.getText());
		System.out.println("New cases in "+cn+" is "+NC.getText());
		System.out.println("Total Death in "+cn+" is "+TD.getText());
		System.out.println("Recovered cases in "+cn+" is "+RC.getText());
		System.out.println("Active cases in "+cn+" is "+AC.getText());
		System.out.println("Serious cases in "+cn+" is "+SC.getText());
		System.out.println("Total cases per million in "+cn+" is "+TCPM.getText());
		System.out.println("Total death per million in "+cn+" is "+TDPM.getText());
		System.out.println("Total test in "+cn+" is "+TT.getText());
		System.out.println("Total test per million in "+cn+" is "+TTPM.getText());
		System.out.println("Total population in "+cn+" is "+POP.getText());
	}

}
