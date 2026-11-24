package Day_1_Day_2_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaautomationlabs.com/testing/checkbox.php");
		Thread.sleep(3000);
		
		
		//-----IF YOU WANT TO WRITE WITH WebDriver THEN WRITE LIKE THIS---------
		driver.findElement(By.id("myCheckbox")).click();
	
		
		//------IF YOU WANT TO WRITE WITH WebElement THEN WRITE LIKE THIS------
		WebElement we = driver.findElement(By.id("myCheckbox"));
		we.click();   
		System.out.println(we.isSelected());
		
		
		
	}
	
}
