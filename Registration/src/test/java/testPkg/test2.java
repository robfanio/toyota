package testPkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import mortgageCal.BaseClass;

public class test2 extends BaseClass{
	WebDriver driver;
  @Test
  public void f() {
	
	  page.hoverLend();
	  page.clickCal();
  }
}
