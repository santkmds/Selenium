package autoSysTest;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginCallByPom {
	
	ChromeDriver driver ;
	Login page1 ;
	Categories page2;
	Manufacturers page3;
	ClickOnEdit page4 ;
	
	
	@BeforeTest
	public void open() {
		driver = new ChromeDriver();
		driver.get("");
	}

	@Test
	public void scriptForLogin() {
		page1=PageFactory.initElements(driver, Login.class) ;
		page1.login("admin@yourstore.com","admin");
		
		page1.clickOnCategories();
		page2=PageFactory.initElements(driver, Categories.class) ;
		page2.clickOnSearch();
		page2.invalidSearch();
		
		
		
		page1.clickOnManufacturers();
		page3=PageFactory.initElements(driver, Manufacturers.class) ;
		page3.clickOnEdit();
		
		page4=PageFactory.initElements(driver, ClickOnEdit.class);
		page4.save();
	}
	
	@Test
	public void validateLoginPage() {
		String actual = driver.getCurrentUrl();
		String expected = "https://admin-demo.nopcommerce.com/admin/";
		
		if(actual.equalsIgnoreCase(expected)) {
			System.out.println("Login Succful!!!");
		}else {
			System.out.println("Login not Successful!!!!");
		}
	}
	
	@Test
	public void takeScreenShot() {
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUttils.copyfile(srcfile,new File("C://Desktop//ScreenSchot.jpg"));
		
	}
	
	//Click on Catalog
	
	
	
	
	
	
}







