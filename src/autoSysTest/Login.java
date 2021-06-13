package autoSysTest;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	public Menu menu ;
	
	public Login(WebDriver driver) {
		 
		menu = PageFactory.initElements(driver, Menu.class) ;
		
	}
		
		@FindBy(id="Email")
		WebElement user ;
		
		@FindBy(id="Password")
		WebElement pass ;
		
		@FindBy(className = "button-1 login-button")
		WebElement login ;
		
		
		@FindBy(xpath = "/html/body/div[3]/div[2]/div/ul/li[2]/ul/li[2]/a/span")
		WebElement clickOnCategories;
		
		@FindBy(xpath =  "/html/body/div[3]/div[2]/div/ul/li[2]/ul/li[3]/a/span")
		WebElement clickOnManufacturers;
		
		
		
		public void login(String u , String p) {
			user.sendKeys(u);
			pass.sendKeys(p);
			login.click();
		}

    public void clickOnCategories() {
    	clickOnCategories.click();	
    }
		
    public void clickOnManufacturers() {
    	clickOnManufacturers.click();
    	
    }
		
	}


