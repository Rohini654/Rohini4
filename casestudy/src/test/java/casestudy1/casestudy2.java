   package casestudy1;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

	public class casestudy2  {
		public static WebDriver driver;
		
		@Given("^users open TestMeApp$")
		public void useropenTestMeApp()
		{
			System.setProperty( "webdriver.chrome.driver","C:\\Users\\PDC3A-Training.PDC3A\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			driver.get("http://10.232.237.143:443/TestMeApp");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		@When("^user clicks signin$")
		public void userclicksignup()
		{
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		}
		@And("^user enters credentials as$")
		public void  credentials(DataTable dt)
		{
			List<String>cred=dt.asList(String.class);
			driver.findElement(By.name("userName")).sendKeys(cred.get(0));
			driver.findElement(By.name("password")).sendKeys(cred.get(1));
			driver.findElement(By.name("Login")).click();
		}

}
