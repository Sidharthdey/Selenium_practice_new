package Day_4_Day_5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testing.qaautomationlabs.com/index.php");
		Thread.sleep(3000);
		
		
		
		//Tooltip popup and getAttribute is same thing
		
		
		
		//href is the attribute value. Instead of href if we add some other attribute like class then the value of the class will be the output
		 WebElement wee = driver.findElement(By.linkText("Home"));
		 String see = wee.getAttribute("href");
		 System.out.println("Attribute = " + see);
		 
		// Output : Attribute = https://qaautomationlabs.com/ 
		
		 
		 //Below code is just for validation --- not that important
		 
		if (see.equals("https://qaautomationlabs.com/")) {
			System.out.println("test pass");
		}
		else {
			System.out.println("test fail");
		}
		
	}

}