package com.selenium.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(priority = 1,dataProvider = "Testdata")
	public void loginTest(int id,String username, String pwd) {
		System.out.println("Id :: "+id+"\t Username ::"+username+"\t password :: "+pwd);
	}
	@DataProvider(name="Testdata")
	public Object[][] testData(){
		return new Object[][] {
			{1,"deep","123@"},
			{2,"dipu","234@"},
			{3,"jitu","456@"}
		};
	}
}
