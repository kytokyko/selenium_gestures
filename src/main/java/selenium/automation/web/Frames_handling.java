package selenium.automation.web;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frames_handling extends BaseClass{
	
	//execution using webelement
	@Test
	public void drag_drop()
	{
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int size = frames.size();
		System.out.println("thge total frames is : " + size);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(0);
		//driver.switchTo().frame(frame);
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, droppable).build().perform();
		
		driver.switchTo().defaultContent();
		
		
		
	}
	
	

}
