package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;


public class AddMacToKartRadioBtn {

	public static void main(String[] args) {
	
		

	 	WebDriver driver = new ChromeDriver();
	     
	  
		 driver.manage().window().maximize();
		 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS );
		 
		 driver.get("https://tekschool.us/contact/");
		 WebElement rBtn = driver.findElement(By.xpath("//input[@value='6']"));
		 rBtn.click();
		 driver.findElement(By.id("input-option208")).sendKeys("how you doing");
		
		 		
		 		
		 		driver.findElement(By.xpath("//*[contains(text(),'Apple Cinema 30\"')]")).click();
		 		
		 		
		 		
	
		 		
		 		
		 	}
		 

	}


