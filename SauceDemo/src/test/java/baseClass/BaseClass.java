package baseClass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
public class BaseClass {
	public WebDriver driver;
	
	
	 @BeforeClass
	  public void beforeClass() 
	   
	  {	  
		  driver= new ChromeDriver();
		  driver.get("https://www.saucedemo.com/v1/");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.manage().window().maximize();		  
	  }

	  @AfterClass(groups= {"regression","sanity"})
	  public void afterClass() {
		//driver.close();
	  }
	  
	  public void alert() {
		  Alert myalert=driver.switchTo().alert();
		  myalert.accept();
	  }
	  
	  
	  
}