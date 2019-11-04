package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[]args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browser drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://shearcircle.com/register");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[@class='btn btn-primary text-uppercase radius']")).click();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("sowmya");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("malishety");
		driver.findElement(By.xpath("//input[@id='uname']")).sendKeys("skmkkk@gmail.com");
		//driver.findElement(By.xpath("//select[@id='isd_code']")).sendKeys("+1");
		driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("6164698842");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("0012244566");
	    driver.findElement(By.xpath("//input[@id='cnf_password']")).sendKeys("0012244566");
		driver.findElement(By.xpath("//input[@name='accepted_billing_agreement']")).click();
		//driver.findElement(By.xpath("//input[@name='accepted_billing_agreement']")).click();
		driver.findElement(By.xpath("//button[@ng-click='RegisterFormSubmit()']")).click();
		
//tagname[@attributename='attribute value'];
		
		
		
	
	}

}
