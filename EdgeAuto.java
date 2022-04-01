// For Edge Driver
package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EdgeAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver","E:\\Capita\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://www.adactinhotelapp.com/");
		
		WebElement uname = driver.findElement(By.id ("username"));
		 uname.sendKeys("Shubham12345"); 
		 driver.findElement(By.id("password")).sendKeys("Shubham@123");
		 driver.findElement(By.id("login")).click();
		 new Select(driver.findElement(By.id("location"))).selectByVisibleText("London");
		 new Select(driver.findElement(By.id("hotels"))).selectByIndex(3); // xpath //select[@id='hotels']
		 new Select(driver.findElement(By.id("room_type"))).selectByIndex(2);// room_type
		 new Select(driver.findElement(By.id("room_nos"))).selectByIndex(2);// //select[@id='room_nos']
		 
		 //new Select(driver.findElement(By.id("datepick_in"))).selectByIndex("31/09/2021");// datepick_in
	        //driver.findElement(By.id("datepick_in")).click();

		 
		 WebElement date = driver.findElement(By.id ("datepick_in"));// datepick_in
		 date.click();
		 date.clear();
		 date.sendKeys("23/01/2022");
		 WebElement dat = driver.findElement(By.id ("datepick_out"));// id="datepick_out"
		 dat.click();
		 dat.clear();
		 dat.sendKeys("25/01/2022");
		 
		 new Select(driver.findElement(By.id("adult_room"))).selectByIndex(3);
		 new Select(driver.findElement(By.id("child_room"))).selectByIndex(2);
		 driver.findElement(By.id("Submit")).click();
		 driver.findElement(By.id("radiobutton_0")).click();// id="radiobutton_0"
		 driver.findElement(By.id("continue")).click(); // id="continue"
		 WebElement name = driver.findElement(By.id ("first_name"));// id="first_name"
		 name.sendKeys("Prathmesh");
		 WebElement nam = driver.findElement(By.id ("last_name"));// id="last_name"
		 nam.sendKeys("Kulkarni");
		 WebElement na = driver.findElement(By.id ("address"));// address
		 na.sendKeys("At Barshi, Dis Solapur");
		 WebElement n = driver.findElement(By.id ("cc_num"));// id="cc_num"
		 n.sendKeys("1234567887654321");
		 new Select(driver.findElement(By.id("cc_type"))).selectByIndex(2); // id="cc_type"
		 new Select(driver.findElement(By.id("cc_exp_month"))).selectByIndex(4);// id="cc_exp_month"
		 new Select(driver.findElement(By.id("cc_exp_year"))).selectByIndex(10);// cc_exp_year
		 WebElement cc = driver.findElement(By.id ("cc_cvv"));// id="cc_cvv"
		 cc.sendKeys("123");
		 driver.findElement(By.id("book_now")).click();// book_now
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.findElement(By.id("my_itinerary")).click(); //id="my_itinerary"id="my_itinerary" id="logout"
	

	}

}
