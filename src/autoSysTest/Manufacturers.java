package autoSysTest;

import java.awt.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class Manufacturers {
public Menu menu ;
	
	public Manufacturers(WebDriver driver) {
		 
		menu = PageFactory.initElements(driver, Menu.class) ;
		
	}
	
	@FindBy(xpath = "//*[@id=\"manufacturers-grid\"]/tbody/tr[1]/td[5]/a");
	
	
	WebElement clickOnEdit;
	
	public void clickOnEdit() {
		clickOnEdit.click();
	}

	}
