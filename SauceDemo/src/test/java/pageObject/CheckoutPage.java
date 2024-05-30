package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {


@FindBy(xpath="//a[normalize-space()='FINISH']")  WebElement fINISH;
	
@FindBy(xpath="//div[@class='subheader']") WebElement checkoutOverview;

@FindBy(xpath="//h2[normalize-space()='THANK YOU FOR YOUR ORDER']")  WebElement tHANKYOUFORYOURORDER;

public void fINISH() {
	fINISH.click();
}

public String checkoutOverview() {
	return checkoutOverview.getText();
}
	

public String tHANKYOUFORYOURORDER() {
	return tHANKYOUFORYOURORDER.getText();
}



}
