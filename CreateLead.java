package homeassignments_week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
	
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestleafEdu");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Peteri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mathews");
		
		
		 driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Mr");
		 
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 
		  
		 
		 
		
		
		
		

	}

}
