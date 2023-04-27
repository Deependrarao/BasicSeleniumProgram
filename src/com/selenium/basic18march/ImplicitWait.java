package com.selenium.basic18march;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait
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
		
		//Explicit wait here
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		driver.quit();

	}

}
