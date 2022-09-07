package propertyFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GetDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		//File name and location - Absolute path
				String filePath3=System.getProperty("user.dir")+"\\PropertyFile\\textFile.properties";
				//Create an instance of FileInputStream class by passing file location to its constructor
				FileInputStream fis=new FileInputStream(filePath3);
				//Create an instance of Properties class 
				Properties prop=new Properties();
				//with the help of Properties class ref call load() and pass FileInputStream ref as a parameter
				prop.load(fis);
				//in order to read data from property file use getProperty(String key) of Properties class
				System.out.println("Application URL: "+prop.getProperty("url"));
				System.out.println("Username: "+prop.getProperty("username"));
				System.out.println("Password: "+prop.getProperty("password"));
				System.out.println("confirmPassword: "+prop.getProperty("roi"));
				System.out.println("firstName: "+prop.getProperty("firstname"));
				System.out.println("lastName: "+prop.getProperty("lastname"));
				System.out.println("contactNumber: "+prop.getProperty("principleAmount"));
				System.out.println("emailId: "+prop.getProperty("emailId"));
			}

}
