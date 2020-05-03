package dealsmunafa;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageAccessWithProperites {

	public static WebDriver driver;

	public static void main(String[] args) throws IOException {

		Properties orp = new Properties();
		Properties confp = new Properties();

		FileInputStream conff = new FileInputStream(".\\src\\test\\resources\\properties\\Config.properties");
		confp.load(conff);
		System.out.println("Config Properties File loaded");

		FileInputStream orf = new FileInputStream(".\\src\\test\\resources\\properties\\OR.properties");
		orp.load(orf);
		System.out.println("Object Repository Properties File loaded");

		// Accessing Browsers
		if (confp.getProperty("browser").equals("chrome")) {
			System.out.println("Setting Up Chrome Browser");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (confp.getProperty("browser").equals("firefox")) {
			System.out.println("Setting Up Firefox");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		driver.get(confp.getProperty("adminpage"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(confp.getProperty("implicit.wait")),
				TimeUnit.MILLISECONDS);

		driver.findElement(By.id(orp.getProperty("UName"))).sendKeys("YC_Admin");
		driver.findElement(By.xpath(orp.getProperty("Pass_Xpath"))).sendKeys("India@2019");
		driver.findElement(By.id(orp.getProperty("LogIn"))).click();
		driver.quit();

	}

}
