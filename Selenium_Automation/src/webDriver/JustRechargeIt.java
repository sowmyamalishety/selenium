package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustRechargeIt {
	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\Desktop\\MyNewWorkspace\\Selenium_Automation\\browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com");
		driver.findElement(By.id("jriTop_signin9"));
		driver.findElement(By.name("name=\"txtUserName\"")).sendKeys("sowmya");
		driver.findElement(By.xpath("type=\"password\"")).sendKeys("123456789");

	}
}
