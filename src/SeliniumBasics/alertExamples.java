package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class alertExamples {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
	     
		  
		 driver.manage().window().maximize();
		 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS );
		 
		 driver.get("https://tekschool.us/");
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("alert('Testing is fun')");
		 
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		//wait for e seconds
		Thread.sleep(2000);
		
		js.executeAsyncScript("confirm('trying to work')");
		Thread.sleep(3000);
		
		js.executeScript("prompt('hi five')"); 
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		

	}

}
