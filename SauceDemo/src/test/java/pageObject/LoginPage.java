package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	

@FindBy(xpath="//input[@id='password']")    WebElement password;
@FindBy(xpath="//input[@id='user-name']") WebElement username;
@FindBy(xpath="//input[@id='login-button']")WebElement lOGIN;
	
	
public void password(String Loginpasswrd) {
	password.sendKeys(Loginpasswrd);	
}

public void username(String Loginusername) {
	password.sendKeys(Loginusername);	
}

public void lOGIN() {
	password.click();	
}


}