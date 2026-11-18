package Day_1_Day_2_Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate_radiobutton {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://qaautomationlabs.com/courses/");
		Thread.sleep(3000);
		
		
		driver.findElement(By.xpath("//a[@class = 'kps-primary']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//i[@class='nav-icon fas fa-dot-circle']")).click();
		Thread.sleep(3000);
		
		//HERE I USED THE WebElement because it is easy to assign the click, clear and rest of the elements with this method
		WebElement we_this = driver.findElement(By.name("gender"));
		we_this.click();
		
		driver.navigate().back();
		

	}

}
