package webDriverConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
	public static void main(String[] args) {
	//	Selenium->RightClick->Properties->javabuildpath->Libary->client combine jar->
		//java doc location edit and paste location -> take path from www.https://www.selenium.dev/selenium/docs/api/java/
		System.setProperty("webdriver.chrome.driver", "E:\\SANTOSH\\Chandan_Java\\S//chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "E:\\SANTOSH\\Chandan_Java\\S\\IEDriverServer.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.getTitle();
		System.out.println("Title of FB = "+ driver.getTitle() );
		String url = driver.getCurrentUrl();
		
	}

}
