package test2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestAuto{
	public static WebDriver driver;
	public static String expectedTitle = "Adactin.com - Search Hotel";

	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Capita\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("http://www.adactinhotelapp.com/");
		 driver.manage().window().maximize();

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	/*@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}*/

	@Test
	public void test() {
		WebElement uname = driver.findElement(By.id ("username"));
		 uname.sendKeys("Shubham12345"); 
		 driver.findElement(By.id("password")).sendKeys("Shubham@123");
		 driver.findElement(By.id("login")).click();
		String actualTitle = driver.getTitle();
		assertEquals(expectedTitle,actualTitle);
	}

}
