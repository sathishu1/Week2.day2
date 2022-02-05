package week2day2;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Arun");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Vijay");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("52661661");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("password1");
		WebElement day = driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByVisibleText("21");
		WebElement month = driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		// month1.selectByIndex(5);
		month1.selectByValue("5");
		WebElement year = driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("2000");
		WebElement gender = driver.findElement(By.xpath("(//input[@name='sex'])[1]"));
		gender.click();

	}
}
