package seleniumPrac;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String Args[]) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		WebElement staticdropdown = driver
				.findElement(By.xpath("//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));

		Select dropdown = new Select(staticdropdown);

		dropdown.selectByIndex(3);

		String sakshi = dropdown.getFirstSelectedOption().getText();

		System.out.print(sakshi);

		// Handling Auto Suggest

		driver.findElement(By.id("autosuggest")).sendKeys("in");

		Thread.sleep(3000);

		List<WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		for (WebElement option : options) {
			if (option.getText().equalsIgnoreCase("india")) {
				option.click();
				break;
			}
		}

		driver.quit();
	}

}
