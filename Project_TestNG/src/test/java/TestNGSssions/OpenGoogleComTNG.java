package TestNGSssions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OpenGoogleComTNG {

	WebDriver wd;

	@BeforeTest
	public void b4() {
		// Setup Chrome Driver Manager
		// WebDriverManager.chromedriver().setup();

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\.m2\\repository\\webdriver\\chromedriver\\win32\\chromedriver.exe");
	}

	@Test
	public void test1() {

		wd = new ChromeDriver();
		wd.get("https://dealsmunafa.com");
		System.out.println("This Website title is: " + wd.getCurrentUrl());
		String Actual = wd.getTitle();
		System.out.println("Title of Website is: " + wd.getTitle());
		String Expected1 = "Home - DealsMunafa";

		System.out.println("Now Chrome Driver Instance is going to be closed");
		// wd.quit();

	}

	@Test
	public void test2() {

		wd = new ChromeDriver();
		wd.get("https://ygwealth.in");
		System.out.println("This Website title is: " + wd.getCurrentUrl());
		String Actual = wd.getTitle();
		System.out.println("Title of Website is: " + wd.getTitle());
		String Expected1 = "Home - DealsMunafa";

		System.out.println("Now Chrome Driver Instance is going to be closed");
		// wd.quit();
	}

	@AfterTest
	public void cls() {
		System.out.println("Browswer will get closed here");
		wd.quit();
	}

}
