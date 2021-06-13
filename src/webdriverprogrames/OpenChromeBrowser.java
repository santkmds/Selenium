package webdriverprogrames;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "E:\\SANTOSH\\Silenium\\chromedriver.exe");
		
		driver.get("http://google.com");

	}

}
