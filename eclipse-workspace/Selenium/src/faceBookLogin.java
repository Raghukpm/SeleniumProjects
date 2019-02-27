
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class faceBookLogin {
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver","/Users/user/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("tejakpm@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("9502923438");
		driver.findElement(By.id("u_0_8")).click();
		
	}//main()
	

}//faceBookLogin




<input type="text" autocomplete="off" class="fl-input" id="text-box" value="" tabindex="0" data-reactid="175">


<button class="button button--default button--bold _3Su5" tabindex="4" data-reactid="210">Search</button>


driver.findElement(By.id("210").click();




//button[@type='button' and span='New']