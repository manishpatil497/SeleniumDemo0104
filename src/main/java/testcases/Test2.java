package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Execution after setting ChromeDriver path in System setProperty method");
		System.setProperty("webdriver.chrome.driver", "/Users/manish/Desktop/Manish/DemoWork/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		Thread.sleep(3000);
		driver.quit();
		System.out.println("Execution complete");

	}

}