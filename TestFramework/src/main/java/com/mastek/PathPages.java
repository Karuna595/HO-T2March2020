package com.mastek;

import org.openqa.selenium.By;

public class PathPages {

	static String url="https://www.pluralsight.com/paths/java";
	static String title="Java Language Fundamentals | Pluralsight";
	public void goTo() {
		Browser.goTo(url);
		
	}
	public void goToJavaPath() {
		
		Browser.driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div[2]/div[2]/p/a[1]/span")).click();
	}
	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
