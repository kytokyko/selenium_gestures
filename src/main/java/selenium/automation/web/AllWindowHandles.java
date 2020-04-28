package selenium.automation.web;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AllWindowHandles extends BaseClass{
	
	//There are two ways to use window handles
	// one is using the formulae of converting the set to list  as below
	
	@Test
	public void windowhandles()
	{
		WebElement twitter_button = driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Twitter']"));
		twitter_button.click();
		Set<String> windowhandles = driver.getWindowHandles();
		List<String> values=new ArrayList<String>(windowhandles);
		String next_window = values.get(1);
		driver.switchTo().window(next_window);
		
		
		driver.manage().window().maximize();
		System.out.println("the switched window title is : " + driver.getTitle());

		
	
	}
	
	 //The other is using the iterator method
	
	@Test
	public void windowhandles_1()
	{
		WebElement twitter_button = driver.findElement(By.xpath("//a[@title='Follow @seleniumeasy on Twitter']"));
		twitter_button.click();
		Set<String> windowhandles = driver.getWindowHandles();
		Iterator<String> iterator = windowhandles.iterator();
	    String parent = iterator.next();
	    String child = iterator.next();
	    driver.switchTo().window(child);
	    driver.manage().window().maximize();
		System.out.println("the switched window title is : " + driver.getTitle());
		
	}

}
