package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaScripExecutorMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
	     
		  
		 driver.manage().window().maximize();
		 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS );
		 
		 driver.get("https://tekschool.us/");
		 
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 
		scrollDownonThePage(driver);// this does the below way in a shortcut but we should have the below method so it can work.
		
	}
	
	public static void scrollDownonThePage(WebDriver driver) {
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");	
		 
	}
	}


