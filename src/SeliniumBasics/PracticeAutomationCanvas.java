package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAutomationCanvas {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		  System.out.println( System.getProperty("user.dir"));
		//negative
		// go to this https://canvas.instructure.com/login/canvas
		
	 	WebDriver driver = new ChromeDriver();
	   	driver.get("https://www.facebook.com/");
		//driver.findElement(By.name("login")).click();// this finds it by the name it is given on the code page
		 driver.findElement(By.partialLinkText("Create a Page")).click();// this will find it on what is written on the page.must return 1 element.
		
		 driver.manage().window().maximize();
		 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS );
		 
		
		

	}

}
