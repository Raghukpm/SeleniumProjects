package com.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumSample {
	
  public static void main(String []args)
	{
	System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
	WebDriver driver=new ChromeDriver();
 driver.get("https://www.facebook.com");
			driver.findElement(By.id("email")).sendKeys("tejakpm@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("8121343730");
			driver.findElement(By.id("u_0_2")).click();
			
		}//main()
		

	}//faceBookLogin

