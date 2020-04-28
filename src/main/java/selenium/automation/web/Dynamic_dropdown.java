package selenium.automation.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Dynamic_dropdown extends BaseClass{
	
	@Test
	public void dynamic_dropdown() throws InterruptedException
	{
		WebElement element = driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		element.click();
		
		WebElement source = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']"));
		source.click();
		
		Thread.sleep(3000);
		
		WebElement destination = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='MAA']"));
		destination.click();
	}

}
