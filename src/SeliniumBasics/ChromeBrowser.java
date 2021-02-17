package SeliniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {

    // step 1. to open a chrome browser we need to set up system.SetProperty to open chromeDriver file.
		//syntax for system.setProperty("webdriver.chrome.driver", "<path to file>
		//for windows user we will add ".exe" extension for Mac users we do not add.
   System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
   
   // step 2. we need to create a reference to webdriver Interface
   // then crate OBJ of chromedriver class.
   WebDriver driver = new ChromeDriver(); // WedDriver is an Interface so we can not create OBJ of it. driver is the reference.
   
// we can maximize the page below mean we can see the page that will be testing in a full size
   driver.manage().window().maximize();
   
   // we need to make sure about the time so the webdriver does not throw an exception for this issue.
   driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS); // 30 is the seconds mean we give up to 30 seconds to open the page
   
   //global wait or implicit wait 
   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
   
   //delete cookies with selinium , cookies are the old browser we used and apps uses them to track our search items. like amazon or ebay.
   //driver.manage().deleteAllCookies(); ---------->this will delete all of the previews search we did.
   
   
   // we need to open http://tek-school.com/retail/
   // in order to open a website with selinium webdriver, we need to use .get() method and pass url as a parameter.
   //.get() will open website url.
   driver.get("http://tek-school.com/retail/");
   
   // i want to print the page or website title 
   String ActualPageTitle = driver.getTitle();
   System.out.println("This is current page title " + ActualPageTitle);
   
 //also want to print the url of the page which i'm on it.
   String currentURL = driver.getCurrentUrl();
   System.out.println("this is current page url " +currentURL);
   
   // to close an open browser with webdriver we can use 2 methods. 
   // 1. .close(); this metjhod will only close the only open tab in the browser.
   //2. .quit () this method will close all the open tabs in a browser.
   driver.close();
   
   
   
  
   
   
	}

}
