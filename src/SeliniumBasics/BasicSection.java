package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSection {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + ".\\drivers\\chromedriver.exe");
		
		System.out.println(System.getProperty("user.dir")); // user directory tell us where  our work station is located
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		//driver.get("https://www.facebook.com/");
		//driver.findElement(By.name("login")).click();
		//driver.findElement(By.partialLinkText("Create a page")).click();
		
		
		
		driver.get("http://tek-school.com/real-estate/");
		driver.findElement(By.id("priceMax")).sendKeys("1000");
		driver.findElement(By.id("priceMin")).sendKeys("2000");
		
		try {
			Thread.sleep(5000);// this is explicit wait
		}catch(InterruptedException e) { // doing it this was mean we wait for 5 seconds till we do the below process of clicking
			e.printStackTrace();
			
		}
		
        driver.findElement(By.id("btnleft")).click();
        driver.manage().window(). maximize();
        


		
		
		

	}

}
