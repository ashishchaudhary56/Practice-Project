package com.ecommerce.test;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		
	    WebDriver driver = new ChromeDriver();
			driver.get("https://www.shine.com/myshine/login/");
			
			WebElement mail = driver.findElement(By.id("id_email_login"));
			mail.sendKeys("aaashish222@gmail.com");
			
			WebElement pass = driver.findElement(By.id("id_password"));
			pass.sendKeys("Ashish@2022");
			
			Thread.sleep(2000);
			
			WebElement logins = driver.findElement(By.cssSelector("#cndidate_login_widget .msitelogin_mid2 .ui-btn_n"));
			logins.click();
			Thread.sleep(2000);
}
}