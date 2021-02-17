package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleSearchTest {

	public static void main(String[] args) {
		
			  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
			  System.out.println( System.getProperty("user.dir"));
			//negative
			// go to this https://canvas.instructure.com/login/canvas
			
		 	WebDriver driver = new ChromeDriver();
		     driver.get("https://www.google.com");
		     driver.findElement(By.name("q")).sendKeys("testing");
			 driver.manage().window().maximize();
			 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS );
			 
	}

}
