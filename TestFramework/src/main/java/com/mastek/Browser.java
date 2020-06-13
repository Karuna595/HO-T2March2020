package com.mastek;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
     
	static WebDriver driver=new ChromeDriver();
	
	public static void goTo(String url)
	{
		driver.get(url);
	}

	public static Object title() {
		return driver.getTitle();
	}

	public static void close() {
		driver.close();
		
	}
}
