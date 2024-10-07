package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	private WebDriver driver;
	
    private By cookies = By.id("onetrust-accept-btn-handler");
    
    
    public HomePage(WebDriver driver) {
		this.driver=driver;
	}
    
    
    public void accept_cookies() {
    	
    	driver.findElement(cookies).click();
    		
    }
    

}
