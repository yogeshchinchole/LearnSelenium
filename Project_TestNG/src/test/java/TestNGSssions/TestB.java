package TestNGSssions;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver wdm = new ChromeDriver();
		wdm.get("https://dealsmunafa.com/");
		wdm.manage().window().maximize();
		// wdm.manage().window().wait(10);
		wdm.findElement(By.xpath("//input[@placeholder='Type shop name']")).sendKeys("Amazon");
		// wdm.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div[2]/form/div[2]/ul/li[1]/a")).click();
		wdm.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/div[2]/div/button")).click();

	}

}
