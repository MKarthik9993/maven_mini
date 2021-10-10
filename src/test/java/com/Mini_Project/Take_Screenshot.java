package com.Mini_Project;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Take_Screenshot {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\keerthana kumari\\eclipse-workspace\\Selenium_Intro\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.myntra.com/");

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("(//a[text()='Men'])[1]")).click();

		driver.findElement(By.xpath("(//a[text()='Kids'])[1]")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		TakesScreenshot scrshot = (TakesScreenshot) driver;
		File src = scrshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\keerthana kumari\\eclipse-workspace\\Mini_Project\\Screenshot\\myntkid.png");
		FileUtils.copyFile(src, dest);

	}

}
