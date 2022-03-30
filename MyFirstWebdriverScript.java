package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstWebdriverScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver","E:\\Capita\\chromedriver_win32\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.get("http://www.adactinhotelapp.com/");
 
 // *****------Operation done on website page------
 
 /*driver.manage().window().maximize();
 driver.navigate().to("http://www.google.com");
 driver.navigate().back();
 driver.navigate().forward();
 driver.navigate().back();
 driver.navigate().refresh();
 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
 */
 
 // ###--------Login by id-------#######

WebElement uname = driver.findElement(By.id ("username"));
 uname.sendKeys("Shubham12345"); 
 driver.findElement(By.id("password")).sendKeys("Shubham@123");
 driver.findElement(By.id("login")).click();
 driver.quit();
 
 
 // ###--------Login by class-------#######
 
 WebElement name = driver.findElement(By.className ("username"));

 driver.findElements(By.className("login_input"));
 name.sendKeys("Shubham12345"); 
 driver.findElement(By.className("login_error")).sendKeys("Shubham@123");
 driver.findElement(By.id("login")).click();
 driver.quit();
 
 
 
 /*WebElement uname = driver.findElement(By.cssSelector ("#username"));

 driver.findElements(By.cssSelector("username"));
 uname.sendKeys("Shubham12345"); 
 driver.findElement(By.cssSelector("login_error")).sendKeys("Shubham@123");
 driver.findElement(By.cssSelector("login")).click();
 driver.quit();

 */
	}

}
//http://adactinhotelapp.com/Register.php