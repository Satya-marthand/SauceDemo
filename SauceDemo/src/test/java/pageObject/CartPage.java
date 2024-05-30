package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage {

@FindBy(xpath="//a[normalize-space()='CHECKOUT']")  WebElement cHECKOUT;
@FindBy(xpath="//a[normalize-space()='Continue Shopping']") WebElement continueShopping;

@FindBy(xpath="//div[@class='subheader']")  WebElement checkoutYourInformation;

public void cHECKOUT() {
	cHECKOUT.click();
}

public void continueShopping() {
	continueShopping.click();
}

public String checkoutYourInformation() {
	return checkoutYourInformation.getText();
}


}
