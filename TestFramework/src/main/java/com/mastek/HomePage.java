package com.mastek;

public class HomePage {
    
	static String url="http://www.pluralsight.com";
	static String title="Pluralsight | THE Technology Skills Platform";
	public void goTo() {
		Browser.goTo(url);
		
	}
	public boolean isAt() {
		System.out.println("Current title is -"+Browser.title());
		return Browser.title().equals(title);
	}

}
