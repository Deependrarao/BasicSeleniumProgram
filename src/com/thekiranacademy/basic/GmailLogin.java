package com.thekiranacademy.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GmailLogin {

	public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
          WebDriver driver = new EdgeDriver();
          driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
          driver.manage().window().maximize();
          
          driver.findElement(By.id("login1")).sendKeys("deependra@123");
          driver.findElement(By.id("password")).sendKeys("123456");
          driver.findElement(By.name("proceed")).click();
          
          Thread.sleep(3000);
          
          driver.quit();
	}

}
