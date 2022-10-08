package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasicSeleniumCode {

	public static void main(String[] args) {
		//setup driver before starting the browser
		WebDriverManager.chromedriver().setup();
		//open a chrome browser
		ChromeDriver driver = new ChromeDriver();
		//load the url to test
		driver.get("http://leaftaps.com/opentaps/control/login");
		//maximize the browser
		driver.manage().window().maximize();
		//close the browser
		driver.close();
		

	}

}
