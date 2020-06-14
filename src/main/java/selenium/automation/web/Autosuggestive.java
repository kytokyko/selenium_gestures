package selenium.automation.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Autosuggestive extends BaseClass{
	
	@Test
	public void method() throws InterruptedException {
		WebElement from_city = driver.findElement(By.id("fromCity"));
		from_city.click();
		
		WebElement text_value = driver.findElement(By.xpath("//input[@placeholder='From']"));
		text_value.sendKeys("del");
		
		Thread.sleep(3000);
		List<WebElement> list_places = driver.findElements(By.xpath("//p[contains(@class,'blackText')]"));
		int count_places = list_places.size();
		System.out.println("the total cities are : " + count_places);
		
		for(int i=0;i<count_places;i++){
			if(list_places.get(i).getText().equalsIgnoreCase("Del Rio, United States")) {
				list_places.get(i).click();
				
			}
		}
		
	}

}
