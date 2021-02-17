package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionExamples {


		public static void main(String[] args) throws InterruptedException  {
			 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
		     
			  
			 driver.manage().window().maximize();
			 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS );
			 
			 driver.get("https://tekschool.us/contact/");
			 
			// Actions a =new Actions(driver); 
		//	 WebElement readMoreBtn = driver.findElement(By.xpath("//*[@class='default=btn' and contains(text(), 'Read')]"));
		//	 Thread.sleep(2000);
			// a.moveToElement(readMoreBtn).perform();
			 Actions a =new Actions(driver);
			 
			 WebElement messageTextbx = driver.findElement(By.xpath("//textarea[@name='umessage']"));
			 WebElement image = driver.findElement(By.xpath("//div[@class='contact-image']"));
			
			 a.sendKeys(messageTextbx, "testing action class").perform();
			 Thread.sleep(3000);
			 a.sendKeys(messageTextbx, " \n this is my second line"). perform();
			 
			 Thread.sleep(3000);
			 
			 a.keyDown(Keys.CONTROL).sendKeys("z").build().perform(); // this will control Z our writtings
			 
			// a.clickAndhold(submitBtn).perform();
			 //a.contextClick(image).perform();// context mean right click.
			 
			 

	}

}
