package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddressPage {
	
	
	

@FindBy(xpath="//input[@id='first-name']")  WebElement firstName;
@FindBy(xpath="//input[@id='last-name']") WebElement lastName;
@FindBy(xpath="//input[@id='postal-code']")  WebElement zipPostalCode;
@FindBy(xpath="//input[@value='CONTINUE']") WebElement cONTINUE;
@FindBy(xpath="//a[normalize-space()='CANCEL']")  WebElement cANCEL;

@FindBy(xpath="//div[@class='subheader']")  WebElement yourCart;

public void firstName(String first) {
	firstName.sendKeys(first);	
}

public void lastName(String last) {
	lastName.sendKeys(last);	
}

public void zipPostalCode(String zip) {
	zipPostalCode.sendKeys(zip);	
}

public void cONTINUE() {
	cONTINUE.click();
}

public void cANCEL() {
	cANCEL.click();
}

public String yourCart() {
	return yourCart.getText();
}



}
