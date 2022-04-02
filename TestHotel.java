package test1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class TestHotel {
	public static WebDriver driver;
  @Test
  public void TestHotlApp() {
	  System.setProperty("webdriver.chrome.driver","E:\\Capita\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.adactinhotelapp.com/");
		 driver.navigate().to("www.adactinhotelapp.comjm ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Opening Chrome Window");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
	  System.out.println("Closing Chrome Window");

  }
  

}
