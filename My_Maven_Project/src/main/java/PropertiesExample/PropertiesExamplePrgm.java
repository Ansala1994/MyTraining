package PropertiesExample;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExamplePrgm {
	FileReader fr;
	
	public void read() throws IOException {
		fr = new FileReader("C:\\Users\\Ansala\\eclipse-workspace\\My_Maven_Project\\src\\main\\resources\\Test.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("Username"));
		System.out.println(p.getProperty("Password"));
	}
	public void write() throws IOException {
		Properties p1=new Properties();
		//add email to the file Test.properties
		p1.setProperty("email","ansala4lulla@gmail.com");
				//create new property file
		p1.store(new FileWriter("Info.properties"),null);
		//p1.store(new FileWriter("C:\\Users\\Ansala\\eclipse-workspace\\My_Maven_Project\\src\\main\\resources\\Test.properties"),"Updated");
		p1.store(new FileWriter("C:\\Users\\Ansala\\eclipse-workspace\\My_Maven_Project\\Info.properties"),"New File Created");
	}
	

	public static void main(String[] args) throws IOException  {
		PropertiesExamplePrgm p = new PropertiesExamplePrgm();
		p.read();
		p.write();
		
	}

}
