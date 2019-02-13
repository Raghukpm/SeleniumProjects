/**
 * 
 */
package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Raghu
 *This class will store all the locators and methods of login page
 */
public class LoginPom {
	
WebDriver driver;

By username=By.xpath("//input[@type='empid']");
By password=By.xpath("//input[@name='user_pass']");
By loginButton=By.xpath("//button[@name='subBtn']");

public LoginPom(WebDriver driver)//constructor
{
	this.driver=driver;
	
}//Constructor
	
public void typeUserName()
{
	driver.findElement(username).sendKeys("19799");
	
}//typeUserName()

public void typePassword()
{
	driver.findElement(password).sendKeys("Raghu@517420");
	
}//typePassword()

public void clickLoginButton()
{
	driver.findElement(loginButton).click();
	
}//loginButton()

	
}//LoginPom
