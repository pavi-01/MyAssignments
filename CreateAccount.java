package homeassignments_week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.id("quickNewAccount")).click();
		driver.findElement(By.name("accountName")).sendKeys("Vishaka");
		driver.findElement(By.name("primaryPhoneCountryCode")).sendKeys("91");
        driver.findElement(By.name("primaryPhoneAreaCode")).sendKeys("900");
        driver.findElement(By.name("primaryPhoneNumber")).sendKeys("98981");
        driver.findElement(By.name("primaryEmail")).sendKeys("aggg@gmail.com");
       driver.findElement(By.xpath("//button[text()='Create Account']")).click();  
 
       String title=driver.getTitle();
        System.out.println(title);
        
        //driver.close();
        
        
        
        
	}

}