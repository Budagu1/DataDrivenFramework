package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver){
		this.driver = driver;
	}
	// ELement library;
	//WebElement Usernam_fillocstor = driver.findElement(By.id("username"));
	//By usernmer = By.id("username");
	@FindBy(how = How.ID, using = "username") WebElement usernmm_locat;
	@FindBy(how = How.ID,using = "password") WebElement  passowrlocator;
	@FindBy(how = How.NAME, using = "login") WebElement signbuton;
	// Method interaction
	public void enterusername(String username ) {
		usernmm_locat.sendKeys(username);
		
	}
	public void enterpassword(String password) {
		passowrlocator.sendKeys(password);
	}
	public void clicksing() {
		signbuton.click();
	}
	//public void lognn(String username, String password) {
		//usernmm_locat.sendKeys(username);
		//passowrlocator.sendKeys(password);
		//signbuton.click();
		
	//}
}
