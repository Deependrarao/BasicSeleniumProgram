package com.thekiranacademy.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoBrowser 
{

	public static void main(String[] args) 
	{
		String browser = "edge";
		WebDriver driver = null;
		
		if(browser.equalsIgnoreCase("chrome")) 
		{
         System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
         driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) 
		{
			 System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
	         driver = new EdgeDriver();
		}
         driver.get("https://omayo.blogspot.com/2013/05/page-one.html");
         driver.manage().window().maximize();
         
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        
        for(WebElement j : elements ) 
        {
        	if(j.getText().length()>0) 
        	{
        		System.out.println(j.getText());
        	}
        }
        //close the browser
        driver.quit();
	}

}
