package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Button.html");
	driver.manage().window().maximize();
	System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
	System.out.println(driver.findElement(By.id("size")).getCssValue("background-color"));
System.out.println(driver.findElement(By.id("color")).getText());
System.out.println(driver.findElement(By.id("color")).getLocation());
System.out.println(driver.findElement(By.id("color")).getSize());
System.out.println(driver.findElement(By.id("color")).getTagName());
System.out.println(driver.findElement(By.id("color")).isDisplayed());
//System.out.println(driver.findElement(By.id("color1")).isDisplayed());





}
}
