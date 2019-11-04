package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ttd {
	
	public static void main (String[]args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browser drivers\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://hdpp.ttdsevaonline.com/Registration/VolunteerRegistration");
		Thread.sleep(6000);
		driver.findElement(By.id("Name")).sendKeys("sowmya");
		driver.findElement(By.id("SurName")).sendKeys("malishety");
		driver.findElement(By.id("genFemale")).click();
		//driver.findElement(By.name("dob")).sendKeys("11/07/1996");
		//driver.findElement(By.name("Occupation")).sendKeys("student");
		new Select(driver.findElement(By.name("Occupation"))).selectByVisibleText("Student");
	
		new Select(driver.findElement(By.id("EducationCategory"))).selectByVisibleText("Graduation and above");
		driver.findElement(By.name("Address1")).sendKeys("abcde");
		//driver.findElement(By.id("StateList")).sendKeys("telangana");
		new Select(	driver.findElement(By.id("StateList"))).selectByVisibleText("Telangana");
		driver.findElement(By.id("Mandal")).sendKeys("ghatkesar");
		
		driver.findElement(By.id("txtMobileNum")).sendKeys("9010867089");
		driver.findElement(By.id("txtpinnumber")).sendKeys("500098");
		driver.findElement(By.name("Email")).sendKeys("sowmyamalishety@gmail.com");
		driver.findElement(By.name("ProofNum")).sendKeys("123456789012");
		//driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.id("ExpFlagNo")).click();
		
		
	}
	

}
