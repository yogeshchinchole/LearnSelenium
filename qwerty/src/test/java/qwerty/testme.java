package qwerty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testme {

	private RemoteWebDriver cd1;
	private WebDriver driver;
	private String baseurl;

	@BeforeTest
	public void outme()

	{

		CromeDriverManager.getInstance().setup();
		driver = new ChromeDriver();
		System.out.println("This is initial Display");

	}

	@Test
	public void testtitle() {
		System.out.println();
	}

	@Test
	public void testme1() {
		System.out.println("This is test");
	}

	@AfterTest
	public void outmeafter()

	{
		System.out.println("This is initial Display");
	}

}
