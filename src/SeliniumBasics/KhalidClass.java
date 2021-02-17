package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KhalidClass {

	public static void main(String[] args) {
		
		
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");		 
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.google.com/");
		 
		 //using Id
		 driver.findElement(By.id("search_query")).sendKeys("Tshirt");
		 
		 //using name
		 WebElement name = driver.findElement(By.name("search_query"));
		// driver.sendKeys("T shirt");
		 
		 //using class
		 driver.findElement(By.className(""));  
		 
		 //using linkText
		 String text= driver.findElement(By.linkText("Dress")).getText();
		 System.out.println(text);
		 
		 driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        
        WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        		
        
        
        
	}

}
