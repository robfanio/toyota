package mortgageCal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	WebDriver driver;
	public PageObject page;
	
	@BeforeMethod
	public void Setput() {
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", path +"\\drivers\\chromedriverv88.exe");
		driver = new ChromeDriver();
		driver.get("https://www.Citibank.com");
		driver.manage().window().maximize();
		page = new PageObject(driver);
	}
	
	

}
