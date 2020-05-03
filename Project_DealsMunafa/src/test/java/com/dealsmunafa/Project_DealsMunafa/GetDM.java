package com.dealsmunafa.Project_DealsMunafa;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDM {

	public static void main(String[] args) throws IOException {

		String URL = "https://dealsmunafa.com/";

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get(URL);
		driver.manage().window().maximize();
		File sreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sreenshot, new File("./screenshots/error.jpg"));

	}

}
