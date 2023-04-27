package com.selenium.basic18march;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitThred
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("dropbtn")).click();
		Thread.sleep(3000); //3 second wait
		
		driver.findElement(By.linkText("Facebook")).click();
		driver.quit();
		
	}

}
