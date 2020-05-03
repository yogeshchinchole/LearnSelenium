package dealsmunafa;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDealsMunafaHomePage {

	public static WebDriver driver;

	public static void takeScreenshots() throws IOException {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/mm/dd");
		LocalDate ld = LocalDate.now();
		String formatdate = dtf.format(ld);
		System.out.println(formatdate);

		File screenshotfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotfile, new File("./screenshots/" + dtf.format(ld) + ".jpg"));

	}

	public static void main(String[] args) throws IOException {

		String URL = "https://dealsmunafa.com/";
		String URL_AdminPage = "https://dealsmunafa.com/wp-admin";
		System.out.println("We are launching QA for Project: " + URL);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("Taking Screenshot");
		takeScreenshots();
		System.out.println("Screnshot Taken");
		driver.quit();

	}

}
