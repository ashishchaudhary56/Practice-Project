package com.ecommerce.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.interactions.Actions;

public class AutomateWeb {

	public static void main(String[] args) throws NoAlertPresentException,InterruptedException {
		// TODO Auto-generated method stub

WebDriver driver = new ChromeDriver();
driver.get("https://www.shine.com/registration/");
WebElement name= driver.findElement(By.id("id_name"));
name.sendKeys("Ashish");

//email
WebElement email= driver.findElement(By.id("id_email"));
email.sendKeys("aaashish222@gmail.com");

//mobile
WebElement mobile= driver.findElement(By.id("id_cell_phone"));
mobile.sendKeys("9789716571");


//password
WebElement password= driver.findElement(By.id("id_password"));
password.sendKeys("Ashish@2022");

//button
WebElement register= driver.findElement(By.cssSelector("#registerButton"));
Thread.sleep(20000);
register.click();
Thread.sleep(20000);

       
       

	}

}