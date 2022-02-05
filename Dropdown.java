package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {
	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Dropdown.html");
	driver.manage().window().maximize();
	WebElement dropbyindex = driver.findElement(By.xpath("//select[@id='dropdown1']"));
	Select dropbyindex1 = new Select(dropbyindex);
	dropbyindex1.selectByIndex(4);
	WebElement dropbyname = driver.findElement(By.xpath("//select[@name='dropdown2']"));
	Select dropbyname1 = new Select(dropbyname);
	dropbyname1.selectByVisibleText("Selenium");
	WebElement dropbyvalue = driver.findElement(By.xpath("//select[@id='dropdown3']"));
	Select dropbyvalue1 = new Select(dropbyvalue);
	dropbyvalue1.selectByValue("3");
	driver.findElement(By.xpath("//div[@id='contentblock']/section[1]/div[5]/select[1]")).sendKeys("Appium");
	
	
	}
}
