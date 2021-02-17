package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class MultiBrowserTesting {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
   // WebDriver driver = new FirefoxDriver();
	     
		  
		 driver.manage().window().maximize();
		 driver. manage(). timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS ); 
		 
		 driver.get("http://tek-school.com/retail/");
		 driver.findElement(By.linkText("Canon EOS 5D")).click();
		 Select d = new Select(driver.findElement(By.name("\'option[226]\'")));
		 d.deselectAll(); 
		 System.out.println("hi");
	}
}
