
package Day_1_Day_2_Day_3;         

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods_Webdriver_Navigation {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://automaintenanceagent.com/#/leadmanager/globalinbox");  //we can use driver.navigate().to(url); also
        
        
        //Webdriver methods - getTitle, getPageSource, getCurrentUrl
        String title = driver.getTitle();
        System.out.println("title = " + title);
        
        String psource = driver.getPageSource();
        System.out.println("psource = " + psource);
        
        //Webdriver Navigation - to(), back(), forward(), refresh()
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        
        
        
    }
}
	