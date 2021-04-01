package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[]args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/manish/Desktop/Manish/DemoWork/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://web.rivers.im/");
		Thread.sleep(5000);
		
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Wait wait = new FluentWait(driver).withTimeout(30,SECONDS).pollingEvery(5, SECONDS).ignoring(NoSuchElementException.class);
		
		
		
		driver.findElement(By.xpath("//div[@class='country-select']")).click();
		Thread.sleep(5000);
		System.out.println("Quiting browser");
		driver.quit();
	}
}
