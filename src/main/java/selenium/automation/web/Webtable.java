package selenium.automation.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Webtable extends BaseClass{
	
	@Test
	public void method()
	{
		WebElement table = driver.findElement(By.xpath("//table[@id='task-table']"));
		
		List<WebElement> total_rows = table.findElements(By.tagName("tr"));
		int size_of_rows = total_rows.size();
		System.out.println("total rows are : " + size_of_rows);
		WebElement first_row = total_rows.get(0);
		
		
		List<WebElement> total_columns = first_row.findElements(By.tagName("th"));
		
		int size_columns = total_columns.size();
		System.out.println("total columns on first row are : " + size_columns);
		
		for(int i=0;i<size_columns;i++)
		{
			System.out.println(total_columns.get(i).getText());
		}
		
		
		
	}

}
