package selenium.automation.web;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	public WebDriver driver;
	//public ChromeDriver driver;
	
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://www.makemytrip.com/");
		//river.get("https://www.seleniumeasy.com/test/");
		//driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22777/nz-vs-ind-5th-t20i-india-tour-of-new-zealand-2020");
		//driver=new FirefoxDriver();
		//driver.get("https://jqueryui.com/droppable/");
		//driver.get("https://www.amazon.in/");
		//driver.get("https://www.spicejet.com/");

		//driver=new FirefoxDriver();
		//driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		//driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		//System.out.println(driver.getTitle());
		//driver.get("https://www.spicejet.com/");
		//driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	
	/*@AfterTest
	public void close() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}*/
}
