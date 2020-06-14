package selenium.automation.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Other_practices extends BaseClass{
	
	@Test
	public void method() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement from_tab = driver.findElement(By.xpath("//input[@id='fromCity']"));
		from_tab.click();
		WebElement from_element = driver.findElement(By.xpath("//input[@placeholder='From']"));
		from_element.click();
		from_element.sendKeys("del");
		
		List<WebElement> all_cities = driver.findElements(By.xpath("//p[contains(@class,'blackText')]"));
		int total_cities = all_cities.size();
		
		for(int i=0;i<total_cities;i++)
		{
			all_cities.get(i).click();
		}
		
		
		
	}
	

}
