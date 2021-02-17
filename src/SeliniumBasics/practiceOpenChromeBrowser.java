package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceOpenChromeBrowser {
	//Launch a new Chrome browser.
	//Open your favorite website
	//Get Page Title name
	//Print Page Title in  the Eclipse Console.
	//Get Page URL and verify if it is a correct page opened
	//Print Page URL on Eclipse Console.
	//Close the Browser.

	public static void main(String[] args) {
		//	Exercise for students who got successful execution:
			//	Create a new class and name it PracticeOpenChromeBrowser
			//	Open your favorite website  
			//	Make sure the chrome browser is maximize while it is opened
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		 driver.manage().window().maximize();
		 
		//d.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 
		 
	String actualPageTitle = driver.getTitle();
	System.out.println("This is the real page title" + actualPageTitle);
	
	String currentURL = driver.getCurrentUrl();
	System.out.println("This is the real URL" + currentURL);
	
	driver.get("https://kahoot.it/v2//");
		driver.close();
	}

}
