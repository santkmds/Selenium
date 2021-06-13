package methodsInWebBrowsers;

import java.sql.Driver;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MethodsInWebBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		

		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://w3schools.com");
		driver.navigate().to("http://w3schools.com");
		//Thread.sleep(30000);
		//driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		
		String title = driver.getTitle();
		System.out.println(" title Name "+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(" currentUrl Name "+currentUrl);
		
		
		//String pageSource = driver.getPageSource();
		//System.out.println(" pageSource Name "+pageSource);
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(" windowHandle  "+windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(" windowHandles  "+windowHandles);
		
		//driver.switchTo().window(argo)
		
		driver.close();
		driver.quit();
		
		driver.manage().window().maximize();
		
		
		
		
		
		
	}
	

}
