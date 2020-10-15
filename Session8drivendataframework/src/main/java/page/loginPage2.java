package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage2 {
WebDriver driver;
public loginPage2(WebDriver driver) {
	this.driver = driver;
}
@FindBy(id = "username") WebElement usernamlocator1;

@FindBy(id = "password") WebElement passwordlocator1;
@FindBy(xpath = "//button[contains(text(),'Sign in')]") WebElement signlocator1;
@FindBy(xpath = "//span[contains(text(),'CRM')]") WebElement crmlocator1;

@FindBy(xpath = "//a[contains(text(),'Add Contact')]") WebElement addcontactlocator1;
@FindBy(id = "account") WebElement fullnamelocator1;
@FindBy(id = "company") WebElement companylocator1;

@FindBy(how = How.ID,using = "email") WebElement  emaillocator;
@FindBy(how = How.ID,using = "phone") WebElement  phonelocator;

@FindBy(how = How.ID,using = "address") WebElement  addresslocator;
@FindBy(how = How.ID,using = "city") WebElement  citylocator;

@FindBy(how = How.ID,using = "state") WebElement  statelocator;
@FindBy(how = How.ID,using = "zip") WebElement  ziplocator;


public void usernamefield(String usernameparameter) {
	usernamlocator1.sendKeys(usernameparameter);
}
public void passfield(String passparameter) {
	passwordlocator1.sendKeys(passparameter);
}

public void signfield() {
	signlocator1.click();
}

public void crmfield() {
	crmlocator1.click();
}

public void addcontactfield() throws Exception {
	Thread.sleep(5000);
	addcontactlocator1.click();
	
}
public void fullnamefield(String fulname1) throws Exception {
	Thread.sleep(5000);
	fullnamelocator1.sendKeys(fulname1);
}
public void companyfield(String company1) {
	companylocator1.sendKeys(company1);
}
public void emailfield(String useremail) {
	emaillocator.sendKeys(useremail);
}
public void phonefield(String phonenumber) {
	phonelocator.sendKeys(phonenumber);
}
public void addressfield(String addresslocation) {
	addresslocator.sendKeys(addresslocation);
}
public void cityfield(String citylocation) {
	citylocator.sendKeys(citylocation);
}
public void statefield(String statelocation) {
	statelocator.sendKeys(statelocation);
}
public void zipfield(String ziplocation) {
	ziplocator.sendKeys(ziplocation);
}
}
