package webdriverprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc1HRMLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ChromeDriver driver = new ChromeDriver();
		// System.setProperty("webdriver.gecko.driver", "‪E:\\Sel\\geckodriver.exe");
				 driver.get("https://opensource-demo.orangehrmlive.com/");
				 
		driver.findElement(By.id("txtUsername")).clear();		 
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");;
		driver.findElement(By.name("Submit")).click();;
		 
	}

}
