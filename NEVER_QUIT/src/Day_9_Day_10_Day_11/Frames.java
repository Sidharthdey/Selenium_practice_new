package Day_9_Day_10_Day_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://testing.qaautomationlabs.com/iframe.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		

		//Pass either id or name of the attribute if you are using frame(String nameOrld)
			
		driver.switchTo().frame("iframe2");
		
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		//By default the frame will be 1. So, after you perform action by switching to the frame 2 you will again need to switch back to the default frame again

		//parentFrame() = Moves one level up.
		//defaultContent() = Moves directly to the main webpage.
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframe1");
		driver.findElement(By.xpath("//button[text()='CLick Me']")).click();
	
		
	}

}
