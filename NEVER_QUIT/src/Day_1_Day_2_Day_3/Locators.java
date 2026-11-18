
package Day_1_Day_2_Day_3;                          //Locators- id, name, linktext

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://interndoor.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Locaters - Linktext. Always focus on anchor tag <a> and take the text which is used after it.
		driver.findElement(By.linkText("Companies")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Interview prep")).click();
		
		Thread.sleep(3000);
		//Locators- id, name
		driver.findElement(By.className("bar-post-t")).click();

		
		
	
	}

}
