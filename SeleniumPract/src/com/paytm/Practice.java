package com.paytm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://eportal.htcindia.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Uid
		driver.findElement(By.xpath(".//input[@type='empid']")).sendKeys("20000");
		//PWD
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("12345");
		//Submit
		driver.findElement(By.xpath(".//button[text()='Login']")).click();
		
		

		
	}//main

}//Practice
