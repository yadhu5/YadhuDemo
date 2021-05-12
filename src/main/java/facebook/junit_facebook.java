package facebook;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class junit_facebook {
	WebDriver driver;
	
	@Before
	public  void browser() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afc54RYGj252R_8mNXb2ENzBDny1ELryNdS5U4aezg-TWTzhWEVEFb_80WR6uuiGdUrusV91ZAfCw7bovlJ5rNOsuCDNIY9XUDVTl45Np8D_7Q&smuh=30148&lh=Ac9LS51Duyq5jKqncFo");
		driver.manage().window().maximize();
	}
	@Test
	public void loginpage() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("kijuuri@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("jujjhhhhh6");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	@Test
	public void loginpaginvalid() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("yasdfgsdfgdsi@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("sfgsdfgdsf");
		driver.findElement(By.name("login")).click();
		Thread.sleep(3000);
	}
	
	@After
	public void teardown() {
		driver.close();
}
}
