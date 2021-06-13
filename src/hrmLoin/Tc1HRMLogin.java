package hrmLoin;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc1HRMLogin {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/");
		//driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.get("http://google.com");
		driver.findElement(By.id("txtUsername")).clear();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();

	}

}
