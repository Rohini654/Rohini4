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

public class casestudy3 {
	
	public static WebDriver driver;
	
	@Given("^users open TestMe$")
	public void useropenTestMeApp()
	{
		System.setProperty( "webdriver.chrome.driver","C:\\Users\\PDC3A-Training.PDC3A\\Desktop\\driver\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://10.232.237.143:443/TestMeApp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@When("^user clicks sign$")
	public void userclicksignup()
	{
	driver.findElement(By.xpath("//a[@href='login.htm']")).click();
	}
	@And("^user enters credential as$")
	public void  credentials(DataTable dt)
	{
		List<String>cred=dt.asList(String.class);
		driver.findElement(By.name("userName")).sendKeys(cred.get(0));
		driver.findElement(By.name("password")).sendKeys(cred.get(1));
		driver.findElement(By.name("Login")).click();
	}

    @And("^user search product$")
    public void search(DataTable dt)
    {
    	List<String>sea=dt.asList(String.class);
		driver.findElement(By.name("products")).sendKeys(sea.get(0));
	
    }
    @And("^product display")
    public void display()
    {
    	driver.findElement(By.xpath("/html/body/div[1]/form/input")).click();
    }
    @And("^product is added to cart$")
    public void addtocart()
    {
    	driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
    }
}
