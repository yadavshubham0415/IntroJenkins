package seleniumPrac;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandelling {
	public static void main(String Args[]) throws IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions a = new Actions(driver);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().fullscreen();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");

		driver.findElement(By.cssSelector(".blinkingText")).click();

		Set<String> windows = driver.getWindowHandles(); // [parentid,childid,subchildId]

		Iterator<String> it = windows.iterator();

		String parentId = it.next();

		String childId = it.next();

		driver.switchTo().window(childId);

		// System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		// driver.findElement(By.cssSelector(".im-para.red")).getText();

		// String emailId=
		// driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split("
		// ")[0];

		driver.switchTo().window(parentId);

		// driver.findElement(By.id("username")).sendKeys(emailId);

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(src, new File("C:\\Users\\shubham yadav\\Pictures\\screenshot.png"));

	}

}
