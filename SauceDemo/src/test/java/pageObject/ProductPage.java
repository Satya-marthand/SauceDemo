package pageObject;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage {
	
	@FindBy(xpath="//button[contains(text(),'ADD TO CART')]") List<WebElement> addToCart;
	

    @FindBy(xpath="//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']") WebElement cart;
    
    @FindBy(xpath="//div[@class='product_label']")  WebElement products;
    
    public void addToCart() {
    	for(WebElement item: addToCart) {
    		item.click();
    	}
    }
    
    
    public void cart() {
    	cart.click();
    }
    
    public String products() {
    	return products.getText();
    }
    
    

}
