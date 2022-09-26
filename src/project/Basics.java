package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Basics {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium_Training_Murali\\Selenium_Workspace\\First_Project\\Drivers\\chromedriver_105.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://online.actitime.com/cisco/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("e#%5Bh44");
		driver.findElement(By.id("keepLoggedInCheckBox")).click();
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.partialLinkText("View ")).click();
		driver.findElement(By.id("logoutLink")).click();
		driver.findElement(By.id("username")).sendKeys("unique.muralistl@gmail.com");
		
		Thread.sleep(5000);
		driver.close();
		
		
	}
}
