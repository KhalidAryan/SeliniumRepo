package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExcecuterExamples {

	public static void main(String[] args) {

	 	WebDriver driver = new ChromeDriver();
	     
	  
		 driver.manage().window().maximize();
		 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS );
		 
		 driver.get("https://tekschool.us/contact/");
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("alert,'testing is fun')");

	}

}
