package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {
	
	public static void main(String []args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver",".\\browser drivers\\chromedriver.exe");
		
		driver =new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		Select BIRTHDAY = new Select (driver.findElement(By.id("month")));
		
		BIRTHDAY.selectByVisibleText("Mar");
		
		//Select BIRTHDAY1 =new Select (driver.findElement(By.title("title")));
		
		//BIRTHDAY1.selectByVisibleText("28");
		
		Select BIRTHDAY2 =new Select (driver.findElement(By.name("\"birthday_year\"")));
		
		
		
	}
	

}
