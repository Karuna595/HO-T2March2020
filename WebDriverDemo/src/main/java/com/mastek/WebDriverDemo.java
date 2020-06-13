package com.mastek;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverDemo {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
         /* WebDriver driver= new ChromeDriver();
          driver.get("http://www.seleniumHQ.org");
          
          
         / WebElement  downloadLink=driver.findElement(By.linkText("Downloads"));
          downloadLink.click();*/
		 System.setProperty("webdriver.chrome.driver", "E:\\tool\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://www.google.com");
		 takeScreenshot("selenium_currentDateTime");
		
		 WebElement searchElement=driver.findElement(By.name("q"));
		 searchElement.sendKeys("SeleniumHQ");
		 searchElement.submit();
		 takeScreenshot("selenium_currentDateTime");
		
		WebElement linkElement=driver.findElement(By.linkText("Downloads"));
		linkElement.click();
		takeScreenshot("selenium_currentDateTime");
		
		}
	   public static void takeScreenshot(String fileName) throws IOException
	    {
		   //take screenshot & store it as a file format
		   File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		   // copying the screenshot to the desired loacation by copyFile method
		   String timestamp = new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		   
		   FileUtils.copyFile(file, new File("E:\\screenshots\\"+fileName+" "+timestamp+" .jpg"));
		   
	    }

} 
