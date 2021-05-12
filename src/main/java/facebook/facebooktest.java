package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooktest {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		browser();
		loginpage();
		teardown();
		
	}
	public static void browser() {
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/?stype=lo&jlou=Afc54RYGj252R_8mNXb2ENzBDny1ELryNdS5U4aezg-TWTzhWEVEFb_80WR6uuiGdUrusV91ZAfCw7bovlJ5rNOsuCDNIY9XUDVTl45Np8D_7Q&smuh=30148&lh=Ac9LS51Duyq5jKqncFo");
		driver.manage().window().maximize();
	}
	
	public static void loginpage() throws InterruptedException {
		driver.findElement(By.name("email")).sendKeys("kjuhhhhi@yahoo.com");
		driver.findElement(By.name("pass")).sendKeys("Fkihjhuhg");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
	}
	public static void teardown() {
		driver.close();
	}
		
		
}
