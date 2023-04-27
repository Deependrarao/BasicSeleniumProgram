package com.thekiranacademy.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod 
{

	public static void main(String[] args) throws InterruptedException 
	{
        System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.flipkart.com/");
        Thread.sleep(3000);
        
        driver.navigate().back();
        Thread.sleep(3000);
        
        driver.navigate().forward();
        Thread.sleep(3000);
        
        driver.navigate().refresh();
        
        driver.quit();
        
	}

}
