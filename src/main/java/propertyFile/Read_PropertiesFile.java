package propertyFile;

import java.io.FileInputStream;
import java.util.Properties;

public class Read_PropertiesFile {

	public static String filePath;
	Properties prop;
	
	public Read_PropertiesFile(String filePath) {
		FileInputStream input = null;
		
		try {
			new FileInputStream(filePath);
			prop.load(input);	
			
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
	
	
	public static void main(String[] args) throws Exception {
		Read_PropertiesFile read = new Read_PropertiesFile("C:\\Users\\Administrator\\eclipse-workspace\\Java Project\\src\\file.properties");
		read.printProperty("job");
		
	}

	public String printProperty(String key)throws Exception {
		return prop.getProperty(key);
	}
}
