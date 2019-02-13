package com.paytm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class EportalLogin {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://eportal.htcindia.com");
		
		//Uid
		driver.findElement(By.xpath(".//input[@type='empid']")).sendKeys("19799");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//PWD
		driver.findElement(By.xpath(".//input[@type='password']")).sendKeys("Raghu@517420");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath(".//button[text()='Login']")).click();////button[@type='submit']
		
		driver.findElement(By.xpath(".//span[text()='Attendance']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(".//a[contains(text(),'View ARS')]")).click();
		
		
	}//main

}//EportalLogin
