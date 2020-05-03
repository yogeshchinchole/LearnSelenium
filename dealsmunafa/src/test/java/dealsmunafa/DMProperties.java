package dealsmunafa;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DMProperties {

	public static void main(String[] args) throws IOException {

		Properties or = new Properties();
		Properties conf = new Properties();

		FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\properties\\OR.properties");
		or.load(fis);

		FileInputStream fisc = new FileInputStream(".\\src\\test\\resources\\properties\\Config.properties");
		conf.load(fisc);

		System.out.println(conf.getProperty("homepage"));
		System.out.println(or.getProperty("UName"));
	}
}
