package homeassignments_week2day2;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		

       // JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();", close);
        
	        
		driver.findElement(By.partialLinkText("CRM/SFA")).click();		
			
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']/ancestor::a")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("2468");
	
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//String id=driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
		//System.out.println(id);
		Thread.sleep(3000);
		
		
		driver.findElement(By.linkText("11762")).click();
		String id1=driver.findElement(By.xpath("//span[text()='test (11762)']")).getText();
		System.out.println(id1);
		
		
	driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	
	
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//span[text()='Phone']/ancestor::a")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("2468");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
	
	String displaymsg = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	System.out.println(displaymsg);
	
		

	}

	

}
