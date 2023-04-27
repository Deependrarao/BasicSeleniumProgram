package com.selenium.basic18march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipalWindow
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		//selenium can see one window at a time so exception occure
		driver.findElement(By.linkText("Open a popup window")).click(); 
		String paraOnChildWindow= driver.findElement(By.id("para1")).getText();
		System.out.println(paraOnChildWindow);// exception occure 
		driver.quit();
	}

}
