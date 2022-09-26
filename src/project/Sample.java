package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Training_Murali\\Selenium_Workspace\\First_Project\\Drivers\\chromedriver_105.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
        
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("soundaryaraj.bandaru@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("bavabandaru");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
