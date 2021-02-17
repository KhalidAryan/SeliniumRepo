package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxVSRadioBtn {

	public static void main(String[] args) {
	

		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		//  System.out.println( System.getProperty("user.dir"));
		//negative
		// go to this https://canvas.instructure.com/login/canvas
		
	 	WebDriver driver = new ChromeDriver();
	     
	  
		 driver.manage().window().maximize();
		 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS );
		 
		 driver.get("https://tekschool.us/contact/");
		 WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox' and @name='acceptance-737]"));
		 
		 System.out.println(checkBox.isDisplayed());
		 System.out.println(checkBox.isSelected());
		 System.out.println(checkBox.isEnabled());
		 
		// checkBox.click();
		 
		 if(!checkBox.isSelected()) {
			 checkBox.click();
		 }else {
			 System.out.println("it's already selected");
		 }
		
		 }
		 
	}


