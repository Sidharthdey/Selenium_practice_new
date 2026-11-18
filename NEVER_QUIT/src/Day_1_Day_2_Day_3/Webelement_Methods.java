
package Day_1_Day_2_Day_3;     

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement_Methods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://automaintenanceagent.com/#/leadmanager/globalinbox");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		// Webelement methods - sendkeys(), click(), clear(), gettext()27. getAttribute(), getCssValue(), isDisplayed(), isEnabled(), isSelected()


		// Xpath is also explained here

		driver.findElement(By.id("username")).sendKeys("sidharth@nextxap.com");
		driver.findElement(By.id("password")).sendKeys("Sidhrath@1234@#$%");

		driver.findElement(By.xpath("//button[@class= 'px-4 loginBtn w-100 btn btn-primary']")).click();


	
	
	
	}

}
