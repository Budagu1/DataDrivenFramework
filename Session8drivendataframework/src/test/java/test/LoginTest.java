package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import util.BrowserFactory;
import util.ExcelReader;
//click CRM/ADDCONTACT ,listcontact and identify and delete
public class LoginTest {
	WebDriver driver;
	ExcelReader reda = new ExcelReader("C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\hhhh\\data\\excelllll.xlsx");
	String usern = reda.getCellData("Sheet1","userName",2);
	String passwd = reda.getCellData("Sheet1","Passwords",2);
	@Test
public void validUserShouldBetologinin() {
	driver= BrowserFactory.launchBroser();
	LoginPage loginpagg = PageFactory.initElements(driver, LoginPage.class);
	loginpagg.enterusername(usern);
	loginpagg.enterpassword(passwd);
	loginpagg.clicksing();
	
	
}
}
