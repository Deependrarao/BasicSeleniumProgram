package com.selenium.basic18march;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);

		WebElement dropdownField = driver.findElement(By.id("drop1"));
		WebElement multiSelectBox = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(multiSelectBox);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		select.selectByIndex(3);
		Thread.sleep(3000);
		driver.quit();

	}

}
