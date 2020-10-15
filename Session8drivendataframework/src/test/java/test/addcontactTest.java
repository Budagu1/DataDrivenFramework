package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddcontactPage;
import page.LoginPage;
import page.basepage;
import util.BrowserFactory;
import util.ExcelReader;

public class addcontactTest {
	//.\\data\\excelllll.xlsx
	WebDriver driver;
	
	ExcelReader reda = new ExcelReader("C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\hhhh\\data\\excelllll.xlsx");
	String usern = reda.getCellData("Sheet1","userName",2);
	String passwd = reda.getCellData("Sheet1","Passwords",2);
	String fulName = reda.getCellData("Sheet2","FullName",2);
	String Addressn = reda.getCellData("Sheet2","CompanyName",2);
	String emaill = reda.getCellData("Sheet2","Email",2);
	String phonn = reda.getCellData("Sheet2","Phone",2);
	String addrename = reda.getCellData("Sheet2", "Address",2);
	String cityname = reda.getCellData("Sheet2","City",2);
	String statenam = reda.getCellData("Sheet2","State",2);
	String zipnber = reda.getCellData("Sheet2","Zip",2);

	@Test
	public void UserShouldBetoaddcontact() throws Exception {

		driver = BrowserFactory.launchBroser();

		LoginPage loginpagg = PageFactory.initElements(driver, LoginPage.class);
		loginpagg.enterusername(usern);
		loginpagg.enterpassword(passwd);
		loginpagg.clicksing();
		
		AddcontactPage addcontct = PageFactory.initElements(driver, AddcontactPage.class);
		addcontct.crmbutton();
		addcontct.addcontact();
		// fulnamm
		addcontct.fulnamm(fulName);
		addcontct.company(Addressn);
		addcontct.emailfield(emaill);
		addcontct.phonefield(phonn);
		addcontct.addressfield(addrename);
		addcontct.cityfield(cityname);
		addcontct.statefield(statenam);
		addcontct.zipfield(zipnber);
		// click on addlist contact
		
		addcontct.submitfield();
		addcontct.listcontactfield();
		addcontct.verifyEntercontactanddelete();

	}
}


