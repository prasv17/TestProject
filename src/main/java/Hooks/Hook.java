package Hooks;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Base.Driver_Factory;

public class Hook {
	
	static Driver_Factory web_driver;
	static WebDriver driver;

	
	public void set_up_driver() throws IOException {
		
		web_driver=new Driver_Factory();
		
		driver=web_driver.driver_factory();
		
		driver.get("https://www.bluecrestwellness.com/");
		
		driver.manage().window().maximize();
	
		

	}

}
