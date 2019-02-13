package com.pom.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pom.LoginPom;

public class VerifyEportalLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");	
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://eportal.htcindia.com");
      
      Thread.sleep(2000);
      
      LoginPom login=new LoginPom(driver);
      login.typeUserName();
      login.typePassword();
      login.clickLoginButton();
      
      driver.quit();
      
		
		
	}//main()

}//VerifyEportalLogin
