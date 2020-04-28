package selenium.automation.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Checkboxes extends BaseClass{
	
	@Test
	public void checkboxes() throws InterruptedException
	{
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size = checkboxes.size();
		System.out.println(size);
		int i=0;
		while(i<size)
		{
			Thread.sleep(2000);
			checkboxes.get(i).click();
			i++;
		}
	}

}
