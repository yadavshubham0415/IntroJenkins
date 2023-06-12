package seleniumPrac;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intro {
	
	
	
	@Test
	public void browserTest() {
		WebDriverManager.chromedriver().setup();

		// System.setProperty("webdriver.chrome.driver", "/Users/shubham
		// yadav/eclipse-workspace/src/chromedriver_win32.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://rahulshettyacademy.com/#/index");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
	}

}
