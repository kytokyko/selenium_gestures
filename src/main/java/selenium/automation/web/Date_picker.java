package selenium.automation.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Date_picker extends BaseClass{
	
	@Test
	public void method()
	{
		WebElement date = driver.findElement(By.xpath("(//div[contains(@class,'date')])[1]"));
		date.click();
		
		WebElement month_picker = driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
		String month_text = month_picker.getText();
		System.out.println(month_text);
		
		while(!month_text.contains("March"))
		{
			driver.findElement(By.xpath("//div[@class='datepicker-days']//th[@class='next']")).click();
		}
		
		List<WebElement> days = driver.findElements(By.className("day"));
		for(int i=0;i<days.size();i++)
		{
			String all_dates = days.get(i).getText();
			if(all_dates.equalsIgnoreCase("5"))
			{
				days.get(i).click();
				break;
			}
		}
	}

}
