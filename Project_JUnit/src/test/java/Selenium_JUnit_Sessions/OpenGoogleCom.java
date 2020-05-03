package Selenium_JUnit_Sessions;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleCom {

	WebDriver wd;

	@Before
	public void b4() {
		// Setup Chrome Driver Manager
		// WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\.m2\\repository\\webdriver\\chromedriver\\win32\\chromedriver.exe");
	}

	@Test
	public void test() {

		wd = new ChromeDriver();
		wd.get("https://dealsmunafa.com");
		System.out.println("This Website title is: " + wd.getCurrentUrl());
		String Actual = wd.getTitle();
		System.out.println("Title of Website is: " + wd.getTitle());
		String Expected1 = "Home - DealsMunafa";

		System.out.println("Now Chrome Driver Instance is going to be closed");
	}

	@After
	public void cls() {
		System.out.println("Browswer will get closed here");
		wd.quit();
	}
}
