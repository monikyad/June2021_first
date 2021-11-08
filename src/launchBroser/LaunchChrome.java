package launchBroser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Monik\\Sept2021_Selenium\\First_Selenium\\driver\\chromedriver.exe");
		// polymorphism- parent class can make child class object. webdriver- parent
		// class, chrome driver-child class
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/"); // to open any website on the browser
		driver.manage().window().maximize(); // to manage the window
		Thread.sleep(2000); // to delay the closure of the window
		driver.close(); // to close the window/browser
	}
}
