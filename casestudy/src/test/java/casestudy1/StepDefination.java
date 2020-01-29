package casestudy1;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	public static WebDriver driver;
	
	@When("^user open TestMeApp$")
	public void useropenTestMeApp()
	{
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\PDC3A-Training.PDC3A\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@And ("^user click signup$")
	public void userclicksignup()
	{
	driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
	}
	@And("^enter userName as \"([^\"]*)\"$")
	public void enteruserNameas(String uname)
	{
	driver.findElement(By.id("userName")).sendKeys(uname);
	}
	@And("^enter FirstName as \"([^\"]*)\"$")
	public void enterFirstNameas(String Firstname)
	{
	driver.findElement(By.id("firstName")).sendKeys(Firstname);
	}
	@And("^enter LastName as \"([^\"]*)\"$")
	public void enterLastNameas(String LastName)
	{
	driver.findElement(By.id("lastName")).sendKeys(LastName);
	}
	@And("^enter Password as \"([^\"]*)\"$")
	public void enterPasswordas(String Password)
	{
	driver.findElement(By.id("password")).sendKeys(Password);
	}
	@And("^enter Confirm Password as \"([^\"]*)\"$")
	public void  ConfirmPassword(String ConfirmPassword)
	{
	driver.findElement(By.id("pass_confirmation")).sendKeys(ConfirmPassword);
	}
	@And("^enter Gender as \"([^\"]*)\"$")
	public void enterGenderas(String Gender)
	{
		if(Gender.equalsIgnoreCase("male")) {
			driver.findElement(By.xpath("//input[@value='Male']")).click();
		}
		else if(Gender.equalsIgnoreCase("female"))
		{
			driver.findElement(By.xpath("//input[@value='Female']")).click();
		}

	}
	@And("^enter Email as \"([^\"]*)\"$")
	public void enterEmailas(String mail)
	{
	driver.findElement(By.id("emailAddress")).sendKeys(mail);
	}
	@And("^enter MobileNumber as \"([^\"]*)\"$")
	public void enterMobileNumberas(String MobileNumber)
	{
	driver.findElement(By.id("mobileNumber")).sendKeys(MobileNumber);
	}
	@And("^enter DOB as \"([^\"]*)\"$")
	public void enterDOBas(String DOB)
	{
	driver.findElement(By.id("dob")).sendKeys(DOB);
	}
	@And("^enter Address as \"([^\"]*)\"$")
	public void enterAddressas(String Address)
	{
	driver.findElement(By.id("address")).sendKeys(Address);
	}
	@And("^enter SecurityQuestion as \"([^\"]*)\"$")
	public void SecurityQuestion(String SecurityQuestion)
	{
	   WebElement dropdown=driver.findElement(By.name("securityQuestion"));
		Select s=new Select (dropdown);
	   driver.findElement(By.name("securityQuestion")).sendKeys(SecurityQuestion);
	
	}
	@And("^enter Answer as \"([^\"]*)\"$")
	public void Answer(String Answer)
	{
	driver.findElement(By.id("answer")).sendKeys(Answer);
	}
	@Then ("^user click on Register$")
	public void Register()
	{
	driver.findElement(By.name("Submit")).click();
	}
	

}

