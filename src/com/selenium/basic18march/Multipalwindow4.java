package com.selenium.basic18march;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipalwindow4
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/"); //main window opened here
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Open a popup window")).click();//child window opened here
		Set<String> windowids = driver.getWindowHandles();
		Iterator<String> itr = windowids.iterator();

		String mainWindow = itr.next();
		String childWindow  = itr.next();
		
		//we switch the focus of selenium to the child window 
		driver.switchTo().window(childWindow);
		String paraChildWindow = driver.findElement(By.id("para1")).getText();
		Thread.sleep(3000);
		System.out.println(paraChildWindow);
        driver.close(); //close child window
        
        driver.switchTo().window(paraChildWindow);
        driver.close();
	}

}
