package TestCase;

import org.testng.annotations.Test;

import baseClass.BaseClass;
import pageObject.LoginPage;

public class TC_001_Stsndard_login_credentials_validation_SauceDemo_App extends BaseClass{
  @Test
  public void f() {
	  
	  
	  LoginPage lp= new LoginPage(driver);
	  lp.username("standard_user");
	  lp.password("secret_sauce");
	  lp.lOGIN();
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
