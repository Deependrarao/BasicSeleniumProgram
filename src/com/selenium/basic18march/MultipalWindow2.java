package com.selenium.basic18march;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipalWindow2
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		//selenium can see one window at a time so exception occure
		driver.findElement(By.linkText("Open a popup window")).click();
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();
		while(itr.hasNext()) {
			String windowid = itr.next();
			System.out.println(windowid);
		}
		driver.quit();
	}

}
