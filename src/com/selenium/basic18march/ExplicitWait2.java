package com.selenium.basic18march;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWait2
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		//selenium implicity wait- global wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//0 second it will wait-immediately click
		driver.findElement(By.className("dropbtn")).click();
		
		//3 second only it will wait 
		driver.findElement(By.linkText("Facebook")).click();
		driver.quit();

	}

}
