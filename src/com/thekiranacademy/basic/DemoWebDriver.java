package com.thekiranacademy.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebDriver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //open Chrome browser
		driver.manage().window().maximize();
		driver.get("https://www.google.com/"); //open URL
		
		driver.navigate().to("https://www.youtube.com/");
		System.out.println("current url display: "+driver.getCurrentUrl());
		
		String pagesource = driver.getPageSource();
		System.out.println("pagesource display: "+pagesource);
		
		System.out.println("gettitle :"+driver.getTitle());
		
		System.out.println(driver.hashCode());
		
		System.out.println(driver.getClass());
		
		System.out.println(driver.getWindowHandle());
		
		driver.quit();
	}

}
