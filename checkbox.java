package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkbox {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/checkbox.html");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.xpath("(//div/input[@type='checkbox'])[1]")).isSelected());
	System.out.println(driver.findElement(By.xpath("(//div/input[@type='checkbox'])[6]")).isSelected());

	
}
}
