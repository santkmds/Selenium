package launchBrowserWithMethods;


import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenChromeBrowser {

		public static void main(String[] args) {
		
		//System.out.println("Openning Chrome Browsers with the help of third party");
		
		//System.setProperty("webdriver.chrome.driver", "E:\\SANTOSH\\Silenium");
		
		System.setProperty("webdriver.chrome.driver", "‪E:\\SANTOSH\\Chrome\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver","‪E:\\SANTOSH\\geckodriver.exe");
		
		//System.setProperty("webdriver.chrome.driver","E:\\SANTOSH\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver =new FirefoxDriver();
		driver.get("http://google.com");
		
	}

}
