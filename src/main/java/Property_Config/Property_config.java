package Property_Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Property_config {
	
	
	public Properties property_config() throws IOException{
	
	Properties prop=new Properties();
	
	FileInputStream file=new FileInputStream("/Users/yesmail/Documents/Java_Lessons/bluecrestframework/src/Browser.properties");
	
    prop.load(file);
    
    return prop;
	
	}
	
	
	

}
