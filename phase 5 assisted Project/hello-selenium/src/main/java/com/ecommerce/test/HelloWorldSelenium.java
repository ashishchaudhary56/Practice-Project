package com.ecommerce.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class HelloWorldSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		// Basic configuration
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://www.google.com";
		
		driver.get(baseUrl);
		
		System.out.println("Title of webpage "+driver.getTitle());
		
		///
		Thread.sleep(1000);// 1 ms
		driver.close();
	}

}