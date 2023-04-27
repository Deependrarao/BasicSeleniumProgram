package com.selenium.basic18march;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipalwindow3
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/"); //main window opened here
		driver.manage().window().maximize();

		driver.findElement(By.linkText("Open a popup window")).click();//frist child window opened here
		driver.findElement(By.linkText("Blogger")).click(); //second child window opened here
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String paraWindowShow = null;
		while(itr.hasNext()) 
		{
			String windowid = itr.next();
			driver.switchTo().window(windowid);
			if(driver.getTitle().equals("Basic Web Page Title")) 
			{
				paraWindowShow = driver.findElement(By.id("para1")).getText();
			}
		}
		System.out.println(paraWindowShow);

		driver.quit();
	}

}
