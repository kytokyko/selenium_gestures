package selenium.automation.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButton extends BaseClass{
	
	
	
	@Test
	public void radiobutton() throws InterruptedException
	{
		List<WebElement> radio_buttons = driver.findElements(By.xpath("//input[@class='radioButton']"));
		int size = radio_buttons.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			Thread.sleep(2000);
			String text = radio_buttons.get(i).getText();
			System.out.println(text);
			radio_buttons.get(i).click();
			System.out.println(text + "clicked");
		}
	}

}
