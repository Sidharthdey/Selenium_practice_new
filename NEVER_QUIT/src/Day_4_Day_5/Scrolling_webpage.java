package Day_4_Day_5;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;                   //vertical and horizontal scroll

public class Scrolling_webpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.roboform.com/filling-test-all-fields");
		Thread.sleep(3000);
		
		//There is an interface called JavascriptExecutor which is used in scrolling webpage
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy( 0 , 400)");     //according to the dimension the page will scroll in vertical direction
		
	

	}

}
