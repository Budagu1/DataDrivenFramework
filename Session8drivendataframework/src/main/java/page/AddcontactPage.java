package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddcontactPage extends basepage {
	WebDriver driver;
	public AddcontactPage (WebDriver driver){
		this.driver = driver;
	}
	
	
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'CRM')]") WebElement crmlocator;
	@FindBy(how = How.XPATH, using ="//a[contains(text(),'Add Contact')]") WebElement Addcontactlocator;
	@FindBy(how = How.ID,using = "account") WebElement  fullnamelocator;
	@FindBy(how = How.ID,using = "company") WebElement  companynamelocator;
	@FindBy(how = How.ID,using = "email") WebElement  emaillocator;
	@FindBy(how = How.ID,using = "phone") WebElement  phonelocator;
	
	@FindBy(how = How.ID,using = "address") WebElement  addresslocator;
	@FindBy(how = How.ID,using = "city") WebElement  citylocator;
	
	@FindBy(how = How.ID,using = "state") WebElement  statelocator;
	@FindBy(how = How.ID,using = "zip") WebElement  ziplocator;
	
	@FindBy(how = How.ID,using = "submit") WebElement  submitlocator;
	
	@FindBy(how = How.XPATH, using = "//a [contains(text(),'List Contacts')]") WebElement Listcontactlocator;
	
	// method to interact with the elment
	public void crmbutton() {
		crmlocator.click();	
	}

	public void addcontact() throws InterruptedException {
		Addcontactlocator.click();
		Thread.sleep(2000);
	}
	String entername;
	public void fulnamm(String Fullname) throws Exception {
		Thread.sleep(5000);
		entername = Fullname+basepage.randomgenerat();
		fullnamelocator.sendKeys(entername );
	}
	public void company(String companyn) {
		companynamelocator.sendKeys(companyn+basepage.randomgenerat());
	}
	public void emailfield(String useremail) {
		emaillocator.sendKeys(useremail+basepage.randomgenerat());
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
	public void submitfield() throws Exception {
		submitlocator.click();
		Thread.sleep(5000);
	}
	public void listcontactfield() throws Exception {
		Listcontactlocator.click();
		Thread.sleep(5000);
		
	}
	//tbody/tr[1]/td[2]
	//delete
	//tbody/tr[1]/td[2]//following-sibling::td[4]/a[2]
	String before_xpath = "//tbody/tr[";
	String After_xpath = "]/td[2]";
	public void verifyEntercontactanddelete() throws Exception {
		for(int i=1;i<=6;i++) {
			String name = driver.findElement(By.xpath(before_xpath+i+After_xpath)).getText();
			//System.out.println(entername);
	//verify		
			if(name.contains(entername)){
				System.out.println("enter name existsss");
				driver.findElement(By.xpath("//tbody/tr["+ i +"]/td[2]//following-sibling::td[4]/a[2]")).click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/button[2]")).click();
			}
			
		}
	}
	
}
