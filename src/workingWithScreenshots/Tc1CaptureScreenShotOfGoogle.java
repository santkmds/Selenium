package workingWithScreenshots;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc1CaptureScreenShotOfGoogle {

	public static void main(String[] args) throws IOException {
		
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://google.com");
	
	
	File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("E:\\Sel\\ScreenShot\\prof1.png"));
	}

}
