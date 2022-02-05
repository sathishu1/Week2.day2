package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editpage {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leafground.com/pages/Edit.html");
	driver.manage().window().maximize();
System.out.println(driver.getTitle());
if(driver.getTitle().contains("TestLeaf"))
{
System.out.println("Ttitle has TestLeaf in it");	
}
else
{
	System.out.println("Ttitle has no TestLeaf in it");	
	
}
System.out.println(driver.getPageSource());
System.out.println("CURRENT URL:"+driver.getCurrentUrl());
System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
System.out.println(driver.findElement(By.xpath("//input[@value='Append ']")).isEnabled());
System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());

}
}
