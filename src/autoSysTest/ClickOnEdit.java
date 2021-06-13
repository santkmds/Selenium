package autoSysTest;

import java.awt.Menu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickOnEdit {
	
public Menu menu ;

public ClickOnEdit(WebDriver driver) {
	menu=PageFactory.initElements(driver, Menu.class);
}


@FindBy(xpath = "//*[@id=\"manufacturer-info\"]/div[1]/span");

WebElement abc;


@FindBy(xpath = "//*[@id=\"manufacturer-form\"]/div[1]/div/button[1]");
WebElement save ;



public void save() {
	abc.sendKeys("Apple");
	save.click();
}
}


