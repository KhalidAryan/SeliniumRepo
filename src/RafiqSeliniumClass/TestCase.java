package RafiqSeliniumClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {
		
		
		 System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		 
      WebDriver driver = new ChromeDriver();
      
      driver.get("https://www.amazon.com/");
      driver.manage().window().maximize();
      driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
      driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      
      Thread.sleep(2000);
      
      WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
      name.sendKeys("T shirt");
      
      WebElement search = driver.findElement(By.id("nav-search-submit-button"));
      search.click();
      
      WebElement text = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/I/816aqbWSYaL._AC_SX200_SY161_QL70_.jpg']"));
      text.click();
      
      WebElement role = driver.findElement(By.xpath("//span[@role='button']"));
      role.click();
      
      WebElement id = driver.findElement(By.xpath("//a[@id='native_dropdown_selected_size_name_3']"));
      id.click();
      
      WebElement color = driver.findElement(By.xpath("//img[@alt='Black']"));
      color.click();
      
      WebElement value = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
      value.click();
      
      
      
      
      


	}

}
