package homeassignments_week2day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Acc");	
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Johny");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Berry");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']")).sendKeys("Andrew");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("test1234@gmail.com");
		WebElement statedd=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel = new Select(statedd);
		//sel.selectByIndex(4);not working
		sel.selectByValue("CA");	
		
		WebElement country=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select cou=new Select(country);
		cou.selectByVisibleText("United States");
		 driver.findElement(By.className("smallSubmit")).click();
		 
		 driver.findElement(By.linkText("Edit")).click();
		 
		WebElement desc= driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']"));
		desc.clear();
		
		
		 
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("testing");
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
