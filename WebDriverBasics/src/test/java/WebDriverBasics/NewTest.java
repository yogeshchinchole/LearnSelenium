package WebDriverBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {

	WebDriver wd;

	@BeforeTest
	public void initiatebrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dell\\.m2\\repository\\webdriver\\chromedriver\\win32\\chromedriver.exe");
		wd = new ChromeDriver();
	}

	@Test
	public void starthere() {

		wd.get("https://dealsmunafa.com");
		String Str = wd.getTitle();
		System.out.println("This is Title: " + Str);
		AssertJUnit.assertEquals("Home - DealsMunafa", Str);
		WebElement findElement = wd.findElement(By.id("name"));
		System.out.println(findElement);

	}

	@AfterTest
	public void closeme() {
		wd.quit();
	}
}
