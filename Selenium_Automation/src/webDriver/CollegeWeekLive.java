package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class CollegeWeekLive {
      public static void main(String[]args) throws InterruptedException {
		WebDriver driver;
		
		//Chrome browser launch
//		System.setProperty("webdriver.chrome.driver",".\\browser drivers\\chromedriver.exe");
//		driver=new ChromeDriver();
		
		//IE browser launch
		System.setProperty("webdriver.ie.driver", "./browser drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		
		
		driver.get("https://www.collegeweeklive.com/go-signup/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("sowmya");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("malishety");
		driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("sowmya@gmail.com");
		driver.findElement(By.xpath("//input[@id='phoneNumber']")).sendKeys("9010869095");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("sowmy@2");
		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("sowmy@2");
		//new Select(driver.findElement(By.xpath(").selectByVisibleText("");
		new Select(driver.findElement(By.xpath("//*[@label='Your Role']"))).selectByVisibleText("Student");
		
		new Select(driver.findElement(By.xpath("//*[@id='country']"))).selectByVisibleText("UNITED STATES");
		
	}
}	
		
		


