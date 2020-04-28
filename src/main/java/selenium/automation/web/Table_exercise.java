package selenium.automation.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Table_exercise extends BaseClass{
	
	@Test
	public void table()
	{
		WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		
		List<WebElement> rows = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']"));
		int size = rows.size();
		
		List<WebElement> columns = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)"));
		int size2 = columns.size();
		
		for(int i=0;i<size2-2;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		}
		
		
		  WebElement sibling =driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")); 
		  String text = sibling.getText(); System.out.println(text);
		 
	}
}