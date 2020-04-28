package selenium.automation.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Alerts extends BaseClass{
	
	
//	Simple Alerts :
//		
//	Simple alerts will have only OK button.
//	we can accept and get the text only
//	
	/*@Test
	public void simple_alerts() throws InterruptedException
	{
		WebElement click_button = driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
		click_button.click();
		Thread.sleep(3000);
		String text = driver.switchTo().alert().getText();
		System.out.println("the text in alert is : " + text);
		driver.switchTo().alert().accept();
	}*/
	
	@Test
	public void confirmation_alerts() throws InterruptedException
	{
		WebElement click_1_button = driver.findElement(By.xpath("//button[@onclick='myConfirmFunction()']"));
		click_1_button.click();
		Thread.sleep(3000);

		String text_demo = driver.findElement(By.id("confirm-demo")).getText();
		System.out.println("before action : " + text_demo);
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		String Text_1_demo = driver.findElement(By.id("confirm-demo")).getText();
		System.out.println("after action : " + Text_1_demo);
		

	}

}
