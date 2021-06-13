package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverExample {
	
	public static void main(String[] args) {
		
	

	WebDriver driver = new ChromeDriver();
	ChromeDriver driver2  = new ChromeDriver();
	
	
	driver.get("http://google.com");
	driver.findElement(By.id("txtUsername")).clear();
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	
	driver.findElement(By.id("txtPassword")).clear();
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	driver.findElement(By.id("btnLogin")).click();	

	}
}


