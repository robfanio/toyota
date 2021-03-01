package testPkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Registered {
	WebDriver driver;

	@BeforeMethod
	public void Browser(){
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path +"\\drivers\\chromedriverv88.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10L,TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void Test1() {
		Actions action = new Actions(driver);
		WebElement lending = driver.findElement(By.id("lending"));
		action.moveToElement(lending).perform();
	}
	
	
	
}
