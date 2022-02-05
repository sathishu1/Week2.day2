package week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
	public static void main(String[] args) throws InterruptedException {
		
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver = new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("DemoCSR");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Leads")).click();
	driver.findElement(By.xpath("//a[@href='/crmsfa/control/findLeads']")).click();
 	driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("565656");
driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
Thread.sleep(2000);
String leadid = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
System.out.println("lead id:"+leadid); 
driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
driver.findElement(By.partialLinkText("Leads")).click();
driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("565656");
driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
Thread.sleep(2000);
WebElement text = driver.findElement(By.xpath("//div[text()='No records to display']"));
String text1 = text.getText();
String text2 = "No records to display";
if (text1.equalsIgnoreCase(text2)) {
	System.out.println("Already deleted or no record of such type found");
	}
else
{
	System.out.println("Record found");
	}



	 	
	 		/*http://leaftaps.com/opentaps/control/main
	 		 
	 		Delete Lead:
	 		1	Launch the browser
	 		2	Enter the username
	 		3	Enter the password
	 		4	Click Login
	 		5	Click crm/sfa link
	 		6	Click Leads link
	 		7	Click Find leads
	 		8	Click on Phone
	 		9	Enter phone number
	 		10	Click find leads button
	 		11	Capture lead ID of First Resulting lead
	 		12	Click First Resulting lead
	 		13	Click Delete
	 		14	Click Find leads
	 		15	Enter captured lead ID
	 		16	Click find leads button
	 		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
	 		18	Close the browser (Do not log out)
	 */
	 	
	}
}
