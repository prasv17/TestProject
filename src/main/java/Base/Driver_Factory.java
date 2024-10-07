package Base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Property_Config.Property_config;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver_Factory {
	
	static Properties prop;
	static Property_config config;
	static String browser;
	static WebDriver driver;

	public WebDriver get_driver() throws IOException {
		
		prop=new Properties();
		
		config=new Property_config();
		
		prop=config.property_config();
		
		browser=prop.getProperty("browser");
		
         if (browser.equals("chrome")){
        	 
        	 WebDriverManager.chromedriver().setup();
        	 
        	 driver=new ChromeDriver();
        	 
        	 
         }
        	 
        	 else if (browser.equals("firefox")) {
        		 System.out.println("Open chrome"); 
        		 
        	 }
        	 
         return driver;
        	 
         }
	
	
	}


