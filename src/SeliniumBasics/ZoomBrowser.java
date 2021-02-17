package SeliniumBasics;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZoomBrowser {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
    driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);

	driver.get("https://www.facebook.com/");
	
	String ActualPageTitle = driver.getTitle();
	System.out.println("this should be the actual title: " + ActualPageTitle);
	
    String currentURL = driver.getCurrentUrl();
    System.out.println("this is the current url: " + currentURL);
	driver.close();
	

	}

}
