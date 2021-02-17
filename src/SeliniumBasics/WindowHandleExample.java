package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandleExample {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
   // WebDriver driver = new FirefoxDriver();
	     
		  
		 driver.manage().window().maximize();
		 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS ); 
		 
		 driver.get("https://tekschool.us/");
		 
		 Actions a = new Actions(driver);
		 WebElement aboutBtn = driver.findElement(By.xpath("//*[@title='About']"));
		 WebElement contactBtn.indElement(By.xpath("//*[@name='Contact']));

a.keyDown(Keys.CONTROL).click(aboutBtn).build().perform();
a.keyDown(Keys.CONTROL).click(contactBtn).perform();

	}

}
