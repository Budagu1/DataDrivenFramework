package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import page.loginPage2;
import util.excellready2;

public class loginTest2 {
	
	WebDriver driver;
	excellready2 excellcall = new excellready2("C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\hhhh\\data\\Excell33.xlsx");
	String username2 =excellcall.getCellData("Sheet1","userName",2);
	String passname2 =excellcall.getCellData("Sheet1","Passwords",2);
	@Test
	
	public void lauchbrowser() throws Exception {
		
		// lauching browser default
		System.setProperty("webdriver.chrome.driver","C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\hhhh\\driver\\chromedriver.exe");
		// open chrome browser
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		// lauch website
		driver.get("http://techfios.com/test/billing/?ng=admin/");
		//loginPage2 call = new loginPage2(driver);
		loginPage2 calle = PageFactory.initElements(driver, loginPage2.class);
		calle.usernamefield(username2);
		calle.passfield(passname2);
	calle.signfield();
		calle.crmfield();
		calle.addcontactfield();
//		calle.fullnamefield("Gabriel Mupenda");
//		calle.companyfield("Hp destop");
//		calle.emailfield("nabi@gmail.com");
//		calle.phonefield("b877777");
//		calle.addressfield("791 east pecan street");
//		calle.cityfield("Fortworth");
//		calle.statefield("Texas");
//		calle.zipfield("76137");
//		//
//		11:41 AM
//
//		Instructor
//
//		Feature: As a user I want a login page so that only authentic 
//		     users will be able to login
//		         
//		     Scenario: Valid users should be able to login 
//		     Given a valid user 
//		     When user goes to Techfios Site 
//		     Then Login Page should be displayed 
//		     When user logs in with valid credentials 
//		     Then Dashboard page should display

//<dependency>
//<groupId>org.seleniumhq.selenium</groupId>
//<artifactId>selenium-java</artifactId>
//<version>3.7.1</version>
//</dependency>
//
//<dependency>
//<groupId>junit</groupId>
//<artifactId>junit</artifactId>
//<version>4.12</version>
//<scope>test</scope>
//</dependency>
//
//<dependency>
//<groupId>info.cukes</groupId>
//<artifactId>cucumber-java</artifactId>
//<version>1.2.5</version>
//</dependency>
//
//<dependency>
//<groupId>info.cukes</groupId>
//<artifactId>cucumber-jvm-deps</artifactId>
//<version>1.0.5</version>
//</dependency>
//
//<dependency>
//<groupId>info.cukes</groupId>
//<artifactId>cucumber-jvm</artifactId>
//<version>1.1.5</version>
//<type>pom</type>
//</dependency>
//
//<dependency>
//<groupId>info.cukes</groupId>
//<artifactId>cucumber-junit</artifactId>
//<version>1.2.5</version>
//<scope>test</scope>
//</dependency>
//
//<dependency>
//<groupId>net.masterthought</groupId>
//<artifactId>cucumber-reporting</artifactId>
//<version>4.7.0</version>
//</dependency>
//
//<dependency>
//<groupId>info.cukes</groupId>
//<artifactId>gherkin</artifactId>
//<version>2.12.2</version>
//</dependency>
//
//
//
//
//12:12 PM
//
//Instructor
//
//@RunWith(Cucumber.class)
//          @CucumberOptions(features = "./src/test/java/features/login.feature", glue = {
//           "steps" },
//           dryRun = false,
//           monochrome = true,
//           plugin = {"pretty", "html:test-output"}
//           )


		
		
	}


}
