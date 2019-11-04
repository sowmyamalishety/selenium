package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JRI {
	@Test
	public void f() {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browser drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com");
		driver.findElement(By.id("jriTop_signin9")).click();
		
		driver.findElement(By.name("txtUserName")).sendKeys("sowmya");
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("123456789");

	}
}
