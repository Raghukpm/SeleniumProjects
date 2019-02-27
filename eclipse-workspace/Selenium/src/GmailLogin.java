import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.findElement(By.id("")).sendKeys("https://accounts.google.com/signin");
		driver.findElement(By.id("")).sendKeys("");
		driver.findElement(By.id("")).click();

	}

}
