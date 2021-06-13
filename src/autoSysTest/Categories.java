package autoSysTest;

import java.awt.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Categories {
	WebDriver driver ;
	
public Menu menu ;
	
	public Categories(WebDriver driver) {
		 
		menu = PageFactory.initElements(driver, Menu.class) ;
		
	}
		
		@FindBy(id="SearchCategoryName")
		WebElement SearchCategoryName ;
		
		
		@FindBy(id = "search-categories")
		WebElement searchcategories ;
		
		
		
		public void clickOnSearch() {
			SearchCategoryName.sendKeys("Electronics");
			searchcategories.click();
		}
		
		@SuppressWarnings("unlikely-arg-type")
		public void invalidSearch() {
			SearchCategoryName.sendKeys("NotElectronics");
			searchcategories.click();
			
			WebElement actual = driver.findElement(By.className("dataTables_empty"));
			
			
			String expected = "No data available in table";
			
			if(!actual.equals(expected)) {
				System.out.println("Validate Pass");
			}else {
				System.out.println("Validate Fail");
			}
			
		}


}
