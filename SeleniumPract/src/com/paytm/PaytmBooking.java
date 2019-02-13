package com.paytm;

import java.util.*;

//import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaytmBooking {
	public static void main(String[] args) throws InterruptedException {

		// Workbook ex = work

		System.setProperty("webdriver.chrome.driver", "/Users/user/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://paytm.com/");
		WebElement ele = driver.findElement(By.xpath(".//span[text()='Bus']"));
		String text = ele.getText();
		boolean con = text.equalsIgnoreCase("bus");
		ele.click();
		driver.manage().window().maximize();
		System.out.println(con);
		System.out.println(text);

		// from
		driver.findElement(By.xpath(".//input[@type='text']")).sendKeys("Bengaluru");
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//p[contains(text(),'Bengaluru')]")).sendKeys("Bengaluru");
		// Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Bengaluru'])[1]")).click();
		// to
		driver.findElement(By.xpath("//span[@data-reactid='177']//input[@id='text-box']")).sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Hyderabad'])[1]")).click();
		Thread.sleep(2000);
		// search button
		driver.findElement(By.xpath(".//button[@class='button button--default button--bold _3Su5']")).click();

		Thread.sleep(2000);

		driver.findElement(
				By.xpath("//div/div[@class='row _28Mg']/div/h5[text()='VKaveri Travels']/../following-sibling::div/h5"
						+ "[text()='10:30  PM']/../following-sibling::div/button[text()='Select Seats']"))
				.click();
		Thread.sleep(2000);
		// driver.findElement(returnxpath("jabbar"));

	}// main

	/*
	 * public static By returnxpath(String dynamixtext) { return
	 * By.xpath("//div/div[@class='row _28Mg']/div/h5[text()='" + dynamixtext +
	 * "']/../following-sibling::div/h5[text()='10:30  PM']/../following-sibling::div/button[text()='Select Seats']"
	 * ); }
	 */

}// PaytmBooking
