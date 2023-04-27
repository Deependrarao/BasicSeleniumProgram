package com.thekiranacademy.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("(//body/div[2])//p//a[2]")).click();
		// full name
		driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr/td[3]/input")).sendKeys("Dipu");

		// Choose a Rediffmail ID
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("deependra");

		// Password
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("12345@4");
		// Retype password
		driver.findElement(By.xpath("//input[contains(@name,'confirm_passwd')]")).sendKeys("12345@4");
		// Alternate Email Address
		driver.findElement(By.xpath("//input[contains(@name,'altemail')]")).sendKeys("deep@rediffmail.com");
		// Mobile No.
		driver.findElement(By.xpath("//input[contains(@name,'mobno')]")).sendKeys("12345678");
		// Date of Birth
		driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]/option[8]")).click();
		driver.findElement(By.xpath("//select[2]/option[13]")).click();
		driver.findElement(By.xpath("//select[3]/option[31]")).click();
		// Gender
		driver.findElement(By.xpath("//input[contains(@name,'gender')]")).click();
		// I live in
		driver.findElement(By.xpath("//select[@id='country']/option")).click();
		// city
		driver.findElement(By.xpath("//select[contains(@name,'city')]/option[57]")).click();

		// submit
		driver.findElement(By.xpath("//input[contains(@name,'Register')]")).click();
	
	driver.quit();
	}

}
