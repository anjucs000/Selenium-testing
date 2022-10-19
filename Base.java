package com.obsqura.selenium.SeleniumCourse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver; //declaring object of WebDriver as public bcz we need to use it in diff methods
	
	public WebDriver initialiseBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anjuc\\eclipse-workspace\\SeleniumCourse\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		return driver;
	}

	public static void main(String[] args) {
		Base obj=new Base();
		obj.initialiseBrowser();

	}

}
