package workingWithLinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC2CountNoOfLinks {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http//www.icicibank.com/#");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
				System.out.println("No Of Links= "+ links);
	}
}
