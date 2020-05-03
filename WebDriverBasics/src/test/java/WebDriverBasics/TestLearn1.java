package WebDriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestLearn1 {

	public static void main(String[] args) {

		String WebURL = "https://dealsmunafa.com/";

		// WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Jars\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();

		System.out.println("Now Getting URL: " + WebURL);
		Driver.get(WebURL);
		System.out.println("Now WebURL " + WebURL + " has been launched.");

		// Thread.sleep(20);

		// WebElement element = Driver.findElement(By.xpath(
		// "//*[@id=\"search_K3ISaDxa9kvmWCexm5A7io0XJnkXhNz9xPvfrdzywPwtL9e6kmzrPaIiqIcYpNYpIxhHc2gVeWRvCHLcoGUnLOmfDfIc0GwjdIOE\"]"));

		//
		// Driver.findElement(By.xpath(
		// "//*[@id=\"search_YbYjD2DtYM1frsRtPaS6laHIbaW5HvgYV6CFw3DsRxlUUWiJFcSh3an3QyBSI3Z4ehgXfCq8iNYTrZhgQzWa7ayc6YLKsuzFfaoV\"]"))
		// .sendKeys("Amazon");
		String textforSearch = "/html/body/section[1]/div/div/div[1]/div[2]/form/div[1]/input";
		System.out.println("Tracing an element");
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		Driver.findElement(By.xpath(textforSearch)).sendKeys("Amazon");
		Driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
		// WebElement we =
		// Actions action = new Actions(Driver);
		// action.moveToElement(we).click().perform();
		Driver.findElement(By.linkText("Amazon")).click();

		// Driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div[2]/form/div[2]/ul/li/a"));
	}

}
