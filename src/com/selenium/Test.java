package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class Test {

	public static void main(String [] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gatla08647\\Firefox\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver(); 
		driver.get("http://www.wikipedia.org");
		WebElement link;
		link = driver.findElement(By.partialLinkText("English"));
		link.click();
	    Thread.sleep(5000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("software");
		
		Thread.sleep(5000);
		
	}
	
}
