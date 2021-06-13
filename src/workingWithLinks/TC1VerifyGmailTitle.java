package workingWithLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC1VerifyGmailTitle {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//Open Browser To navigate google url
		driver.get("http://gmail.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		String expected = "Gmail" ;
		
		String actual = driver.getTitle();
		
		if(actual.contains(expected)) {
			System.out.println("Test PASS");
		}
			else {
				System.out.println("Test Fail");
			}
		driver.close();
	}

}
