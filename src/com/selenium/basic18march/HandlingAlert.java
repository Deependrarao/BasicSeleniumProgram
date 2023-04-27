package com.selenium.basic18march;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlert {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//Handling alerts
		driver.findElement(By.id("alert1")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		String str1 = alert.getText();
		System.out.println(str1);
		
		alert.accept();
		Thread.sleep(3000);
		driver.quit();

	}

}
