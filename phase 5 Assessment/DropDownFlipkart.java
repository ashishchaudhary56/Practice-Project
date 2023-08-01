package com.ecommerce.test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DropDownFlipkart {
	
	 	private WebDriver driver;
	    private final String baseUrl = "https://www.flipkart.com/";

	    @BeforeClass
	    public void setUp() throws InterruptedException {
	       
	        driver = new ChromeDriver();
	     
				Thread.sleep(5000);
			
	        driver.manage().window().maximize();
	    }
	    @Test(priority=1)
	    public void flipkartpagetest() {
	    	driver.get(baseUrl);
	    	String expectedTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"; 
	        String actualTitle = driver.getTitle();
	        try {
	            Assert.assertEquals(actualTitle, expectedTitle, "Page title is not as expected.");
	            System.out.println("Page title is as expected: " + actualTitle);
	        } catch (AssertionError e) {
	            System.out.println("Page title is not as expected: " + actualTitle);
	            throw e; 
	        }

	    }
	    @Test(dependsOnMethods="flipkartpagetest")
	    public void productsearch() throws InterruptedException {
	    	String product="Iphone 13"; 
	         WebElement searchBar = driver.findElement(By.cssSelector("input[title*='Search for']"));
	         searchBar.sendKeys("Iphone 13");
	    	searchBar.sendKeys(Keys.ENTER);      
	    	Thread.sleep(3000);
	    	WebElement srchpdt=driver.findElement(By.cssSelector("span._10Ermr"));
	    	String searchpdt=srchpdt.getText();
	    	if(searchpdt.contains(product)) {
	    		System.out.println("search is successfull");
	    	}else {
	    		System.out.println("search is not successful");
	    	}

    }
	    

	    
}