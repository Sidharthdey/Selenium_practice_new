package Day_4_Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;                   //vertical and horizontal scroll

public class Scrolling_webpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://interndoor.com/");
		Thread.sleep(3000);
		
		//There is an interface called JavascriptExecutor which is used in scrolling webpage
		
		
		//according to the dimension the page will scroll in vertical direction
		
		driver.findElement(By.id("q")).sendKeys("QA engineer");
		Thread.sleep(3000);
		driver.findElement(By.id("tab-fulltime")).click();
		Thread.sleep(3000);
		JavascriptExecutor hinje = (JavascriptExecutor)driver;
		hinje.executeScript("window.scrollBy( 0 , 400)");

		
	}

}
