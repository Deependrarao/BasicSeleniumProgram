package com.thekiranacademy.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basic1 
{

	public static void main(String[] args) throws InterruptedException
	{
      System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
      
      WebDriver driver = new ChromeDriver();
      
      //driver.get("https://www.amazon.com");
      driver.get("file:///D:/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
      driver.manage().window().maximize();
      Thread.sleep(3000);
      driver.quit();
      
      
     System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
       WebDriver driver1 = new EdgeDriver();
       driver1.get("https://www.google.com/");
       driver1.manage().window().maximize();
       Thread.sleep(3000);
       driver1.quit();
       
      
	}

}
