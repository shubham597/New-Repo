package propertyFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

	public static void main(String[] args) throws IOException {
        //Absolute Path
		String FilePath=System.getProperty("user.dir")+"\\PropertyFile\\SignupDetails.properties";
		System.out.println("Currentr Dir: "+FilePath);
		
		//
		FileInputStream fis=new FileInputStream(".\\PropertyFile\\SignupDetails.properties");
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		System.out.println("First Name: "+prop.getProperty("firstname"));
		System.out.println("Last Name: "+prop.getProperty("lastname"));
		System.out.println("EmailID : "+prop.getProperty("emailID"));
		System.out.println("Mobile No: "+prop.getProperty("mobileNumber"));
	}
}