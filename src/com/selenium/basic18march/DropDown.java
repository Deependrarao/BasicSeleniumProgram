package com.selenium.basic18march;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);

		driver.findElement(By.id("drop1")).sendKeys("doc 3");
		// this can be used but this is not exact way of selecting
		Thread.sleep(3000);
		driver.quit();

	}

}
