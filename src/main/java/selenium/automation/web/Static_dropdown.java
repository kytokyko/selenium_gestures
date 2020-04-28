package selenium.automation.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Static_dropdown extends BaseClass{
	
	@Test
	public void dropdown()
	{
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		
		Select a=new Select(dropdown);
		a.selectByVisibleText("Option3");
		
	}

}
