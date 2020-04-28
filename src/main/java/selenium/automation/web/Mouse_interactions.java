package selenium.automation.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_interactions extends BaseClass{
	
	
	// mouse hovering
	@Test
	public void mouse_hover() throws InterruptedException
	{
	Actions a=new Actions(driver);
		WebElement account_tab = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		
		Thread.sleep(3000);
		a.moveToElement(account_tab).contextClick().build().perform();
	}
	
	/*@Test
	public void capital_letters()
	{
		Actions a=new Actions(driver);
		WebElement search_box = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		a.moveToElement(search_box).click().keyDown(Keys.SHIFT).sendKeys("fire tv").doubleClick().build().perform();
		
	}*/
	

}
