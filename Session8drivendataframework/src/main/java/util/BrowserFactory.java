package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver launchBroser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\budap\\git\\repository2\\Session8drivendataframework\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		return driver;
		
		
		
	}
}
