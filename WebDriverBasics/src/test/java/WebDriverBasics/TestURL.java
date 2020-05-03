package WebDriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String URL = "www.ygwealthonline.com";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(URL);
		System.out.println(driver.getTitle());

	}

}
