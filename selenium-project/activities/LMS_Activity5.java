package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class LMS_Activity5 {
	
	WebDriver driver;

		@BeforeMethod
		public void start() {
		driver = new ChromeDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		}
		
		@Test
		public void process() {
		driver.findElement(By.linkText("My Account")).click();
		String s2 = driver.getTitle();
		String s3 = "My Account � Alchemy LMS";
		Assert.assertEquals(s2, s3);
	}
		
		@AfterMethod
		public void tearDown() {
			driver.close();
		}
	}

